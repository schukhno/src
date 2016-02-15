package JavaLessons;

public class GetTankInfo {

	public static void main(String[] args) {
		
		Tank[] tank = new Tank[5];
		
		tank[0] = new Tank();
		tank[0].color = "Red";
		tank[0].crew = 4;
		tank[0].maxSpeed = 60;

		tank[1] = new Tank();
		tank[1].color = "Black";
		tank[1].crew = 3;
		tank[1].maxSpeed = 40;
		
		tank[2] = new Tank();
		tank[2].color = "Yellow";
		tank[2].crew = 5;
		tank[2].maxSpeed = 45;

		tank[3] = new Tank();
		tank[3].color = "Green";
		tank[3].crew = 5;
		tank[3].maxSpeed = 47;

		tank[4] = new Tank();
		tank[4].color = "Pink";
		tank[4].crew = 8;
		tank[4].maxSpeed = 90;
		
		printTankInfo(tank);
	}

	
	static void printTankInfo(Tank[] tankInfo){		
		for(int i = 0; i<tankInfo.length; i++){
			System.out.print("Tank color: "+tankInfo[i].color);
			System.out.print(", Crew count: "+tankInfo[i].crew);
			System.out.println(", Max speed: "+tankInfo[i].maxSpeed);
		}				
	}
}