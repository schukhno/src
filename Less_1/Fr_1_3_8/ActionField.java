package Less_1.Fr_1_3_8;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ActionField {
	
	// 1 - top, 2 - bottom, 3 - left, 4 - right
	private int up = 1;
	private int down = 2;
	private int left = 3;
	private int right = 4;
	private int shiftOn = 1;
	
	
	private boolean COLORDED_MODE = false;	
	private BattleField battleField = new BattleField();	
	private Bullet bullet = new Bullet(0, 0, 0);	
	private Tank tank = new Tank();
	
	public void runTheGame() throws Exception {
		//clean();
	}
	
	public boolean processInterception() {
		String currentCoordinate = getQuadrant(bullet.getX(), bullet.getY());
				
	    int y = Integer.parseInt(currentCoordinate.substring(0, 1));
		int x = Integer.parseInt(currentCoordinate.substring(2, 3));
		
		boolean result = false;
		
		if(battleField.scanQuadrant(y,x) == " "){
			result = false;
		}
		
		if(!battleField.scanQuadrant(y,x).trim().isEmpty()){
			  battleField.updateQuadrant(y,x," ");
			result = true;
		}

		return result;
	}
	
	public String getQuadrant(int x, int y) {
        int xValue = x/64;
        int yValue = y/64;
		String y_x = yValue+"_"+xValue;
		return y_x;
	}
	
	public String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}
	
	
	private int minusLimit = -14;
	private int plusLimit = 575;
	
	public void processFire(Bullet bullet){
		int bulletX = tank.getX() + 25;
		int bulletY = tank.getY() + 25;

		while (bulletY > minusLimit && 
			   bulletY < plusLimit && 
			   bulletX > minusLimit && 
			   bulletX < plusLimit) 
		{
			if (tank.getDirection() == 1) {
				bulletY -= 1;
			} else if (tank.getDirection() == 2) {
				bulletY += 1;
			} else if (tank.getDirection() == 3) {
				bulletX -= 1;
			} else if (tank.getDirection() == 4) {
				bulletX += 1;
			}

			if (processInterception()) {
				bulletX = -100;
				bulletY = -100;
			}
			
			repaint();
			Thread.sleep(bullet.getSpeed());
		}
	}
	
	
	
	
	public void processTurn(Tank tank){
				   tank.setDirection = direction;
	}
	
	public void processMove(Tank tank){
		  if(tank.getDirection()==up){	            
	            if(tank.getTankY()>0){
	            	printTankCoordinate(up,tank.getTankX(),tank.getTankY());
	                tank.setTankY(shiftOn);// -= shiftOn;
	            } 
	        }
	        //down
	        if(tank.getDirection()==down){
	            if(tank.getTankY()<512){
	            	printTankCoordinate(down,tank.getTankX(),tank.getTankY());
	            	tank.setTankY(shiftOn); //+= shiftOn;
	            }
	        }
	        //left
	        if(tank.getDirection()==left){
	            if(tank.getTankX()>0){
	            	printTankCoordinate(left,tank.getTankX(),tank.getTankY());
	            	tank.setTankX(shiftOn); // -= shiftOn;
	            }
	        }            
	        //right
	        if(tank.getDirection()==right){
	            if(tank.getTankX()<512){
	            	printTankCoordinate(right,tank.getTankX(),tank.getTankY());
	            	tank.setTankX(shiftOn); += shiftOn;
	            }
	        }
	        repaint();
	        Thread.sleep(tank.getSpeed());
	}
	
	
	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.
	
	
	public static void main(String[] args) throws Exception {
		Tanks bf = new Tanks();
		bf.runTheGame();
	}

	public void Tanks() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(battleField.getBF_WIDTH(),battleField.getBF_HEIGHT() + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(frame, this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		for (int j = 0; j < battleField.getDimentionY(); j++) {
			for (int k = 0; k < battleField.getDimentionX(); k++) {
				if (battleField.scanQuadrant(j,k).equals("B")) {
					String coordinates = getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates.substring(0, separator));
					int x = Integer.parseInt(coordinates.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tank.getX(), tank.getY(), 64, 64);
		
		g.setColor(new Color(0, 255, 0));
		if (tank.getDirection() == 1) {
			g.fillRect(tank.getX() + 20, tank.getY(), 24, 34);
		} else if (tank.getDirection() == 2) {
			g.fillRect(tank.getX() + 20, tank.getY() + 30, 24, 34);
		} else if (tank.getDirection() == 3) {
			g.fillRect(tank.getX(), tank.getY() + 20, 34, 24);
		} else {
			g.fillRect(tank.getX() + 30, tank.getY() + 20, 34, 24);
		}
		
		g.setColor(new Color(255, 255, 0));
		g.fillRect(bullet.getX(), bullet.getY(), 14, 14);
	}

}
