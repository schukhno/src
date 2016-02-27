package Less_2.Fr_2_1_2;

public class Launcher {

	public static void main(String[] args) {

		T34 t34 = new T34(Color.BLACK, 5, 50);
		Bt7 bt7 = new Bt7(Color.GREEN, 4, 65);
		Tiger tiger = new Tiger(Color.BROWN, 3, 45);
		
		System.out.println("T34: Color - "+t34.getColor()+", crew count - "+t34.getCrew()+", max speed - "+t34.getMaxSpeed()+" km/h");
		System.out.println("BT7: Color - "+bt7.getColor()+", crew count - "+bt7.getCrew()+", max speed - "+bt7.getMaxSpeed()+" km/h");
		System.out.println("Tiget: Color - "+tiger.getColor()+", crew count - "+tiger.getCrew()+", max speed - "+tiger.getMaxSpeed()+" km/h");
		
	}

}
