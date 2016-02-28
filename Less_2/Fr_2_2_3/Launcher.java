package Less_2.Fr_2_2_3;

public class Launcher {

	public static void main(String[] args) {
		
		System.out.println(
			(double) 	darkZone(1000,12,100000)/12
				);

	}

	public static int darkZone(int monthlyPayment, int interest, int dreamSum){
		//100, 12, 1_000_000
		int result = 0;
		
		int i = monthlyPayment;
		
		for(; i<dreamSum; ){
			
			//System.out.println(i);
			
			
			double persents = ((i*0.12)/12);
			//System.out.println(persents);
            i=(int) (i+persents)+monthlyPayment;		
            result++;
            
		}
		   
		return result;
	}
	
}
