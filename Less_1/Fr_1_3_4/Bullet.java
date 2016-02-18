package Less_1.Fr_1_3_4;

public class Bullet {
	
	private int x;
	private int y;
	private int speed = 1;
	private int direction;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}

	public int getDirection() {
		return direction;
	}

	public void updateX(int val){
		x+=val;
	}
	
	public void updateY(int val){
		y+=val;
	}
	
	public void destroy(){
		x = -100;
		y = -100;
	}	
}
