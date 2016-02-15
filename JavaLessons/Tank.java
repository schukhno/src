package JavaLessons;

public class Tank {
	
   String color;
   int crew;
   int maxSpeed;
      
public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getCrew() {
	return crew;
}

public void setCrew(int crew) {
	this.crew = crew;
}

public int getMaxSpeed() {
	return maxSpeed;
}

public void setMaxSpeed(int maxSpeed) {
	this.maxSpeed = maxSpeed;
}

   Tank(){
	   this("Black",3,50);
   }

   Tank(String color, int crew, int maxSpeed){
	   this.color = color;
	   this.crew = crew;
	   this.maxSpeed = maxSpeed;
   }
}