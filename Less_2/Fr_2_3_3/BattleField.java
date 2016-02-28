package Less_2.Fr_2_3_3;

public class BattleField {

	private int BF_WIDTH = 592;
	private int BF_HEIGHT = 592;
		
	private String[][] battleField = {
			{"B"," ","B","B","B","B","B","B","B"},
			{" "," ","B","B","B"," "," ","B","B"},
			{"B"," ","B"," ","B"," "," ","B","B"},
			{"B","B","B"," ","B","B"," ","B","B"},
			{"B","B","B","B","B","B","B","B","B"},
			{"B","B"," ","B","B","B"," "," ","B"},
			{"B","B"," ","B","B","B","B"," ","B"},
			{"B"," ","B","B"," "," "," "," ","B"},
			{"B","B","B","B","B","B","B","B","B"},	
	};

	public int getBF_WIDTH() {
		return BF_WIDTH;
	}

	public int getBF_HEIGHT() {
		return BF_HEIGHT;
	}
	
	public BattleField(String[][] battleField){
		this.battleField = battleField;
	}
	
	
	public BattleField(){
	}
	
	public String scanQuadrant(int v, int h) {
		return battleField[v][h];
	}
		
	public void updateQuadrant(int v, int h, String setValue) {
		battleField[v][h] = setValue;
	}
	
	public int getDimentionY(){
		return battleField.length;
	}
	
	public int getDimentionX(){
		return battleField[0].length;
	}
	
	
}
