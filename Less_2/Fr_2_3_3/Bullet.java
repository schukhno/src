package Less_2.Fr_2_3_3;

public class Bullet {
	
	private int x;
	private int y;
	private int speed = 10;
	private Direction direction;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}

	public Direction getDirection() {
		return direction;
	}

	public Bullet(int x, int y, Direction direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	public void updateX(int val){
		this.x+=val;
	}
	
	public void updateY(int val){
		this.y+=val;
	}
	
	public void destroy(){
		this.x = -100;
		this.y = -100;
	}	
}
