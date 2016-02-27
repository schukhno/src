package Less_2.Fr_2_1_7;

public class Bt7 extends Tank{
	
	public Bt7(Color color, int crew, int maxSpeed){
		this.color = color;
		this.crew = crew;
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String move(){
		return "is mooving....with speed - 65 km/h";
	}
	
	@Override
	public String toString(){
		return "BT7";
	}
}
