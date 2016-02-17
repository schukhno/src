package Less_1.Fr_1_3_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ActionField {

	
//	public static void main(String[] args) throws Exception {
//		Tank bf = new Tank();
//		bf.runTheGame();
//	}
	
//	void runTheGame() throws Exception {
//		//clean();
//	}
	
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		BattleField bf = new BattleField();
		
		
		for (int j = 0; j < bf.battleField.length; j++) {
			for (int k = 0; k < bf.battleField.length; k++) {
				if (bf.battleField[j][k].equals("B")) {
					String coordinates = bf.getQuadrantXY(j + 1, k + 1);
					int separator = coordinates.indexOf("_");
					int y = Integer.parseInt(coordinates.substring(0, separator));
					int x = Integer.parseInt(coordinates.substring(separator + 1));
					g.setColor(new Color(0, 0, 255));
					g.fillRect(x, y, 64, 64);
				}
			}
		}
		
		Bullet bl = new Bullet();
		Tank tank = new Tank();
		
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tank.tankX, tank.tankY, 64, 64);
		
		g.setColor(new Color(0, 255, 0));
		if (tank.tankDirection == 1) {
			g.fillRect(tank.tankX + 20, tank.tankY, 24, 34);
		} else if (tank.tankDirection == 2) {
			g.fillRect(tank.tankX + 20, tank.tankY + 30, 24, 34);
		} else if (tank.tankDirection == 3) {
			g.fillRect(tank.tankX, tank.tankY + 20, 34, 24);
		} else {
			g.fillRect(tank.tankX + 30, tank.tankY + 20, 34, 24);
		}
		
		g.setColor(new Color(255, 255, 0));
		g.fillRect(bl.bulletX, bl.bulletY, 14, 14);
	}
}
