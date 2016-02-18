package Less_1.Fr_1_3_8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ActionField {
	
	private boolean COLORDED_MODE = false;
	
	public void runTheGame() throws Exception {
		//clean();
	}
	
	public boolean processInterception() {
		String currentCoordinate = getQuadrant(bulletX, bulletY);
				
	    int y = Integer.parseInt(currentCoordinate.substring(0, 1));
		int x = Integer.parseInt(currentCoordinate.substring(2, 3));
		
		boolean result = false;
		
		if(battleField[y][x] == " "){
			result = false;
		}
		
		if(!battleField[y][x].trim().isEmpty()){
			battleField[y][x] = " ";
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
	
	
	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.
	
	
	public static void main(String[] args) throws Exception {
		Tanks bf = new Tanks();
		bf.runTheGame();
	}

	public Tanks() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
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
		
		for (int j = 0; j < battleField.length; j++) {
			for (int k = 0; k < battleField.length; k++) {
				if (battleField[j][k].equals("B")) {
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
		g.fillRect(tankX, tankY, 64, 64);
		
		g.setColor(new Color(0, 255, 0));
		if (tankDirection == 1) {
			g.fillRect(tankX + 20, tankY, 24, 34);
		} else if (tankDirection == 2) {
			g.fillRect(tankX + 20, tankY + 30, 24, 34);
		} else if (tankDirection == 3) {
			g.fillRect(tankX, tankY + 20, 34, 24);
		} else {
			g.fillRect(tankX + 30, tankY + 20, 34, 24);
		}
		
		g.setColor(new Color(255, 255, 0));
		g.fillRect(bulletX, bulletY, 14, 14);
	}

}
