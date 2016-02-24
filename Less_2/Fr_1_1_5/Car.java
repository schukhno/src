package Less_2.Fr_1_1_5;

public class Car {

	private String model;
	private double width;
	private double length;
	private double weight;
	private static Color color = Color.RED;
	private long price; 
	
	private double getWidth() {
		return width;
	}

	private void setWidth(double width) {
		this.width = width;
	}

	private double getLength() {
		return length;
	}

	private void setLength(double length) {
		this.length = length;
	}

	private double getWeight() {
		return weight;
	}

	private void setWeight(double weight) {
		this.weight = weight;
	}

	private String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	private Color getColor() {
		return color;
	}

	private void setColor(Color color) {
		this.color = color;
	}

	private long getPrice() {
		return price;
	}

	private void setPrice(long price) {
		this.price = price;
	}
	
	private Car(){
		this("Honda", 2.4, 5.3, 1200, color, 30000);
	}
	
	private Car(String model, double width, double length, double weight, Color color, long price){
		this.model = model;
		this.width = width;
		this.length = length;
		this.weight = weight;
		this.color = color;
		this.price = price;
	}

	public static void main(String[] args) {
		Car carDefault = new Car();
		
		System.out.println(carDefault.getModel());
		System.out.println(carDefault.getWidth());
		System.out.println(carDefault.getLength());
		System.out.println(carDefault.getWeight());
		System.out.println(carDefault.getColor());
		System.out.println(carDefault.getPrice());
		
		System.out.println("=======================================");
		Car carNew = new Car();
		
		carNew.setModel("BMW");
		carNew.setWidth(2.6);
		carNew.setLength(6.0);
		carNew.setWeight(3000.25);
		carNew.setColor(Color.BLACK);
		carNew.setPrice(3_000_000);

		System.out.println(carNew.getModel());
		System.out.println(carNew.getWidth());
		System.out.println(carNew.getLength());
		System.out.println(carNew.getWeight());
		System.out.println(carNew.getColor());
		System.out.println(carNew.getPrice());		
	}

}
