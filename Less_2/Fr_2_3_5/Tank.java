package Less_2.Fr_2_3_5;

import java.util.Random;

public class Tank {
		
	protected int speed = 5;
	private Direction direction;
	private int x;
	private int y;
	
	private ActionField actionField;
	private BattleField battleField;
	private Bullet bullet;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}
	
	public int getSpeed() {
		return speed;
	}

	public Tank(ActionField af, BattleField bf){
		this(64, 64, Direction.DOWN, af, bf);
	}
	
	public Tank(int x, int y, Direction direction, ActionField af, BattleField bf){
		this.x = x;
		this.y = y;
		this.direction = direction;
		actionField = af;
		battleField = bf;
	}
		
	public void turn(Direction direction) {
		this.direction = direction;
		actionField.processTurn(this);
	}
	
	public void move() throws Exception {	    
		actionField.processMove(this);
    }

	public void fire() throws Exception {
		bullet = new Bullet((x+25), (y+25), direction); 
		actionField.processFire(bullet);
	}
	
	public void clear() throws Exception {
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=9; j++){
				moveToQuadrant(j, i);
				if(j==1&&j<=9&&i!=1){
					moveToQuadrant(1, i++);
				}				
			}
		}
	}
	
	public void moveRandom() throws Exception{ 
		Random r = new Random();
		int v;
		int h;
		
		while (true) {
			v = r.nextInt(9);
			h = r.nextInt(9);
			
			if ((v > 0 && v<=9)&&(h > 0 && h<=9)) {
				moveToQuadrant(v, h);
			}
		}
	}
	
	public void moveToQuadrant(int v, int h) throws Exception {
		String coordinates = actionField.getQuadrantXY(v, h);
		int separator = coordinates.indexOf("_");
		int y = Integer.parseInt(coordinates.substring(0, separator));
		int x = Integer.parseInt(coordinates.substring(separator + 1));
				
		if (this.x < x) {
			shootingBricks(Direction.RIGHT, x, y);			
			while (this.x != x) {
				//move(right);
				actionField.processMove(this);
			}
		} else {
			shootingBricks(Direction.LEFT, x, y);
			while (this.x != x) {
				//move(left);
				actionField.processMove(this);
			}
		}
		if (this.y < y) {
			shootingBricks(Direction.DOWN, x, y);
			while (this.y != y) {
				//move(down);
				actionField.processMove(this);
			}
		} else {
			shootingBricks(Direction.UP, x, y);
			while (this.y != y) {
				//move(up);
				actionField.processMove(this);
			}
		}
	}
	
	private void shootingBricks(Direction direction, int x, int y ) throws Exception{
		String currTankCoordinate = actionField.getQuadrant(this.x, this.y);
		
	    int curr_y = Integer.parseInt(currTankCoordinate.substring(0, 1));
		int curr_x = Integer.parseInt(currTankCoordinate.substring(2, 3));

        String endPointCoordinate = actionField.getQuadrant(x, y);
		
	    int end_y = Integer.parseInt(endPointCoordinate.substring(0, 1));
		int end_x = Integer.parseInt(endPointCoordinate.substring(2, 3));
		
		turn(direction);
		
    	if(direction==Direction.RIGHT){
			int finish = end_x-curr_x;				
			for(int i = 0; i<=finish && curr_x<9 && curr_y<9; i++){
				if(!battleField.scanQuadrant(curr_y, curr_x++).trim().isEmpty()){
					fire();
				}			
			}	
    	}
    	else if(direction==Direction.LEFT){
			int finish = curr_x-end_x;				
			for(int i = 0; i<=finish && curr_x<9 && curr_y<9; i++){
				if(!battleField.scanQuadrant(curr_y, curr_x--).trim().isEmpty()){
					fire();
				}			
			}	
    	}
    	else if(direction==Direction.DOWN){
			int finish = end_y-curr_y;
			for(int i = 0; i<=finish && curr_y<9 && curr_x<9; i++){
				if(!battleField.scanQuadrant(curr_y++, curr_x).trim().isEmpty()){					
					fire();
				}			
			}			
    	}
    	else{
			int finish = curr_y-end_y;
			for(int i = 0; i<finish+1 && curr_y<9 && curr_x<9; i++){
				if(!battleField.scanQuadrant(curr_y--, curr_x).trim().isEmpty()){
					fire();
				}			
			}			
    	}
    	
    }
	
	public void destroy(){
		this.x = -100;
		this.y = -100;
	}
	
	public void updateX(int x){
		this.x +=x;
	}
	
	public void updateY(int y){
		this.y +=y;
	}	
}

