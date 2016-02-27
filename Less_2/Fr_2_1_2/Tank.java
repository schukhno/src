package Less_2.Fr_2_1_2;

public class Tank {
	protected Color color;
	protected int crew;
	protected int maxSpeed;
	
	public Color getColor() {
		return color;
	}
	public int getCrew() {
		return crew;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public Tank(){
		
	}
	
	public Tank(Color color, int crew, int maxSpeed){
		this.color = color;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
	}	
}
