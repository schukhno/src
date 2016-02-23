package Less_1.Fr_1_3_14;

public class Tank {
	private int speed = 5;
	private int direction;
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

	public int getDirection() {
		return direction;
	}
	
	public int getSpeed() {
		return speed;
	}

	public Tank(ActionField af, BattleField bf){
		this(64, 64, 3, af, bf);
	}
	
	public Tank(int x, int y, int direction, ActionField af, BattleField bf){
		this.x = x;
		this.y = y;
		this.direction = direction;
		actionField = af;
		battleField = bf;
	}
		
	public void turn(int direction) {
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
	
	}
	
	private void moveRandom() throws Exception{ 
		
	}
	
	private void moveToQuadrant(int v, int h) throws Exception {
   
	}
	
	public void updateX(int x){
		this.x +=x;
	}
	
	public void updateY(int y){
		this.y +=y;
	}	
}

