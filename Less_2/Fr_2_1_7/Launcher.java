package Less_2.Fr_2_1_7;

public class Launcher {

	public static void main(String[] args) {
		
		Tank tank = new Tank(Color.BLACK, 10, 100);
		
		T34 t34 = new T34(Color.BLACK, 5, 50);
		Bt7 bt7 = new Bt7(Color.GREEN, 4, 65);
		Tiger tiger = new Tiger(Color.BROWN, 3, 45);
		
		System.out.println(tank.toString()+" "+tank.move());
		
		System.out.println(t34.toString()+" "+t34.move());
		System.out.println(bt7.toString()+" "+bt7.move());
		System.out.println(tiger.toString()+" "+tiger.move());
	}

}
