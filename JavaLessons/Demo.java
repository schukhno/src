package JavaLessons;

public class Demo {

	public static void main(String[] args) {
		Car ford = new Car();
		ford.setDriver(new Driver());
		ford.model = "Ford";
		System.out.println("First Car - " + ford.model);
		System.out.println("Driver name - " + ford.getDriver().name);
		System.out.println("Driver age - " + ford.getDriver().age);		
		System.out.println("=====================");
		Car opel = new Car();
		opel.model = "Opel";
		opel.setDriver(new Driver(30, "Sergii"));
		
		System.out.println("Second Car - " + opel.model);
		System.out.println("Driver name - " + opel.getDriver().name);
		System.out.println("Driver age - " + opel.getDriver().age);
	}

}
