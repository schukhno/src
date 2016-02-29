package Less_2.Fr_2_3_5;

public class BT7 extends Tank{
	
	private int speed;
	
	public int getSpeed(){
		return speed;
	}
	
	public BT7(int x, int y, Direction direction, ActionField af,	BattleField bf) {
		super(x, y, direction, af, bf);
		speed = 10;
	}
	
}
