package Less_2.Fr_2_4_2;

import java.sql.Date;

public class Purchase {
	
	private long numOrder;
	private long articul;
	private Date dateOrdered;
	
	public long getNumOrder() {
		return numOrder;
	}
	public long getArticul() {
		return articul;
	}
	public Date getDateOrdered() {
		return dateOrdered;
	}  
		
	
	public Purchase(){
		
	}
	
	public Purchase(long numOrder, long articul, Date dateOrdered){
		this.numOrder = numOrder;
		this.articul = articul;
		this.dateOrdered = dateOrdered; 
	}
	
}
