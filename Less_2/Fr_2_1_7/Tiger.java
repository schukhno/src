package Less_2.Fr_2_1_7;

public class Tiger extends Tank{
	
	public Tiger(Color color, int crew, int maxSpeed){
		this.color = color;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String move(){
		return "is mooving....with speed - 45 km/h";
	}
	
	@Override
	public String toString(){
		return "Tiger";
	}
	
}
