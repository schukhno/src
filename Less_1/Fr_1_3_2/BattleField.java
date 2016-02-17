package Less_1.Fr_1_3_2;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BattleField {
	
	final int BF_WIDTH = 592;
	final int BF_HEIGHT = 592;
	
	final boolean COLORDED_MODE = false;
	
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
	
	public void Tanks() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(750, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(frame, this);
		frame.pack();
		frame.setVisible(true);
	}
}
