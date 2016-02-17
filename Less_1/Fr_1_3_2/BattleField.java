package Less_1.Fr_1_3_2;

public class BattleField {
	
	public String[][] battleField = {
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


	String getQuadrantXY(int v, int h) {
		return (v - 1) * 64 + "_" + (h - 1) * 64;
	}
	
}
