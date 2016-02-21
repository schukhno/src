package Less_1.Fr_1_3_10;

public class Tank {
	private int x;
	private int y;
	
	private int direction = 1;
	private int speed = 5;
	
	private int up = 1;
	private int down = 2;
	private int left = 3;
	private int right = 4;
	
	private int shiftOn = 1;
	private int shiftBullet = 25;
	
	private ActionField actionField;
	private BattleField battleField;
	private Bullet bullet;
	
	private int minusLimit = -14;
	private int plusLimit = 575;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void turn(int direction) {
		this.direction = direction;
		actionField.processTurn(this);
	}
	
	public void move() throws Exception {	    
		actionField.processMove(this);
    }

	public void fire() throws Exception {
		bullet = new Bullet(x+25, y+25, direction); 
		actionField.processFire(bullet);
	}
	
	
	private void moveRandom() { 
		
	}
	
	private void moveToQuadrant(int v, int h) {
   
	}

}

