package Less_1.Fr_1_3_2;

import java.util.Random;

import javax.swing.JPanel;

/**
 * @version 3.0
 */
public class Tank extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	
	public int tankDirection = 1;

	public int tankX = 128+128;
	public int tankY = 128+128+128;
	
	int minusLimit = -14;
	int plusLimit = 575;
	
	int speed = 5;
	int bulletSpeed = 1;
	
	// 1 - top, 2 - bottom, 3 - left, 4 - right
	int up = 1;
	int down = 2;
	int left = 3;
	int right = 4;
	
	int shiftOn = 1;
	
    void fire() throws Exception {
		
		//Tank tank = new Tank();
		
		int bulletX = tankX + 25;
		int bulletY = tankY + 25;
		
		while (bulletY > minusLimit && 
			   bulletY < plusLimit && 
			   bulletX > minusLimit && 
			   bulletX < plusLimit) 
		{
			if (tankDirection == 1) {
				bulletY -= 1;
			} else if (tankDirection == 2) {
				bulletY += 1;
			} else if (tankDirection == 3) {
				bulletX -= 1;
			} else if (tankDirection == 4) {
				bulletX += 1;
			}

			Bullet bullet = new Bullet();
			
			if (bullet.processInterception()) {
				bulletX = -100;
				bulletY = -100;
			}
			
			repaint();
			Thread.sleep(bulletSpeed);
		}
	}
	
	String getQuadrant(int x, int y) {
        int xValue = x/64;
        int yValue = y/64;
		String y_x = yValue+"_"+xValue;
		return y_x;
	}
	



	void printTankCoordinate(int direction, int tankX, int tankY){
		System.out.print("Current position - " + tankX+"_"+tankY);

		if(direction == up){
			System.out.println(" then move UP to - " + tankX+"_"+(tankY-shiftOn));
		}
		else if(direction==down){
			System.out.println(" then move DOWN to - " + tankX+"_"+(tankY+shiftOn));
		}
			
		else if(direction==left){
			System.out.println(" then move LEFT to - " + (tankX-shiftOn)+"_"+tankY);
		}
		else if(direction==right){
			System.out.println(" then move RIGHT to - " + (tankX+shiftOn)+"_"+tankY);
		}
		
	}
	
	void move(int direction) throws Exception {	    
        //up	        
        if(direction==up){	            
            if(tankY>0){
            	printTankCoordinate(up,tankX,tankY);
                tankY -= shiftOn;
            } 
        }
        //down
        if(direction==down){
            if(tankY<512){
            	printTankCoordinate(down,tankX,tankY);
                tankY += shiftOn;
            }
        }
        //left
        if(direction==left){
            if(tankX>0){
            	printTankCoordinate(left,tankX,tankY);
                tankX -= shiftOn;
            }
        }            
        //right
        if(direction==right){
            if(tankX<512){
            	printTankCoordinate(right,tankX,tankY);
                tankX += shiftOn;
            }
        }
        repaint();
        Thread.sleep(speed);
    }

	
	void turn(int direction) {
		if (tankDirection != direction) {
			tankDirection = direction;
		}
	}
	
	void moveRandom() throws Exception { 
		Random r = new Random();
		int i;
		while (true) {
			i = r.nextInt(5);
			if (i > 0) {
				move(i);
			}
		}
	}
	
	void clean() throws Exception{
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=9; j++){
				moveToQuadrant(j, i);
				if(j==1&&j<=9&&i!=1){
					moveToQuadrant(1, i++);
				}
			}
		}
	}
	
	BattleField bf = new BattleField();
	
    void shootingBricks(
    		int direction,
    		int x, 
    		int y
    ) throws Exception{
		String currTankCoordinate = getQuadrant(tankX, tankY);
		
	    int curr_y = Integer.parseInt(currTankCoordinate.substring(0, 1));
		int curr_x = Integer.parseInt(currTankCoordinate.substring(2, 3));

        String endPointCoordinate = getQuadrant(x, y);
		
	    int end_y = Integer.parseInt(endPointCoordinate.substring(0, 1));
		int end_x = Integer.parseInt(endPointCoordinate.substring(2, 3));
		
		turn(direction);
		
		
		
    	if(direction==right){
			int finish = end_x-curr_x;				
			for(int i = 0; i<=finish && curr_x<9 && curr_y<9; i++){
				if(!bf.battleField[curr_y][curr_x++].trim().isEmpty()){
					fire();
				}			
			}	
    	}
    	else if(direction==left){
			int finish = curr_x-end_x;				
			for(int i = 0; i<=finish && curr_x<9 && curr_y<9; i++){
				if(!bf.battleField[curr_y][curr_x--].trim().isEmpty()){
					fire();
				}			
			}	
    	}
    	else if(direction==down){
			int finish = end_y-curr_y;
			for(int i = 0; i<=finish && curr_y<9 && curr_x<9; i++){
				if(!bf.battleField[curr_y++][curr_x].trim().isEmpty()){					
					fire();
				}			
			}			
    	}
    	else{
			int finish = curr_y-end_y;
			for(int i = 0; i<finish+1 && curr_y<9 && curr_x<9; i++){
				if(!bf.battleField[curr_y--][curr_x].trim().isEmpty()){
					fire();
				}			
			}			
    	}
    	
    }
	
	void moveToQuadrant(int v, int h) throws Exception {
		
		
		
		String coordinates = bf.getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y = Integer.parseInt(coordinates.substring(0, separator));
		int x = Integer.parseInt(coordinates.substring(separator + 1));
				
		if (tankX < x) {
			shootingBricks(right, x, y);			
			while (tankX != x) {
				move(right);
			}
		} else {
			shootingBricks(left, x, y);
			while (tankX != x) {
				move(left);
			}
		}
		if (tankY < y) {
			shootingBricks(down, x, y);
			while (tankY != y) {
				move(down);
			}
		} else {
			shootingBricks(up, x, y);
			while (tankY != y) {
				move(up);
			}
		}
	}

	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.
	
	
	public static void main(String[] args) throws Exception {
		//Tanks bf = new Tanks();
		//bf.runTheGame();
	}



}