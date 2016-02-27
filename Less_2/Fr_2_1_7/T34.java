package Less_2.Fr_2_1_7;

public class T34 extends Tank{
	
	public T34(Color color, int crew, int maxSpeed){
		this.color = color;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String move(){
		return "is mooving....with speed - 50 km/h";
	}
	
	@Override
	public String toString(){
		return "T34";
	}
}
