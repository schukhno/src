package Less_2.Fr_2_4_2;

public class Buyer {
	
	private String firstName;
	private String lastName;
	private String eMail;
	private long numOrder;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public long getNumOrder() {
		return numOrder;
	}		

	public Buyer(){
		
	}
	
	public Buyer(String firstName, String lastName, String eMail, long numOrder){
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.numOrder = numOrder;		
	}
	
	
}
