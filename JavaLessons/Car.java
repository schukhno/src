package JavaLessons;

public class Car {
	
	String model;
	
	private Driver driver;
	
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	Car(){
		this("Opel");
	}
	
	Car(String model){
		this.model = model;
	}
		
}