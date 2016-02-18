package Less_1.Fr_1_3_6;

public class BattleField {
	
	final int BF_WIDTH = 592;
	final int BF_HEIGHT = 592;
		
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

	public String scanQuadrant(int v, int h) {
		return battleField[v-1][h-1];
	}
	
	public void updateQuadrant(int v, int h, String setValue) {
		battleField[v-1][h-1] = setValue;
	}
	
	public int getDimentionY(){
		return battleField.length;
	}
	
	public int getDimentionX(){
		return battleField[0].length;
	}
}
