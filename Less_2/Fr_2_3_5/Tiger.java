package Less_2.Fr_2_3_5;

public class Tiger extends Tank{
	
	private int armor;
	
	public int getArmor(){
		return armor;
	}
	
	public Tiger(int x, int y, Direction direction, ActionField af,	BattleField bf) {
		super(x, y, direction, af, bf);
		armor = 1;
	}
	
}
