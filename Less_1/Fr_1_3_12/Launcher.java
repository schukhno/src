package Less_1.Fr_1_3_12;

public class Launcher {

	public static void main(String[] args) throws Exception {
		ActionField af = new ActionField();
		BattleField bf = new BattleField();
		Tank tank = new Tank(128,128,3,af,bf);
		af.processMove(tank);
		af.runTheGame();
	}

}
