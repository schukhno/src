package Less_1.Fr_1_3_2;

public class Bullet {
	
	public int bulletX = -100;
	public int bulletY = -100;

	
boolean processInterception() {
		
		Bullet bullet = new Bullet();
		
		int bulletX = bullet.bulletX;
		int bulletY = bullet.bulletY;	
		
		Tank tank = new Tank();
		
		String currentCoordinate = tank.getQuadrant(bulletX, bulletY);
				
	    int y = Integer.parseInt(currentCoordinate.substring(0, 1));
		int x = Integer.parseInt(currentCoordinate.substring(2, 3));
		
		boolean result = false;
		
		BattleField battleField = new BattleField();
		
		if(battleField.battleField[y][x] == " "){
			result = false;
		}
		
		if(!battleField.battleField[y][x].trim().isEmpty()){
			battleField.battleField[y][x] = " ";
			result = true;
		}

		return result;
	}
	
	
}
