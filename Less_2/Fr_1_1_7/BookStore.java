package Less_2.Fr_1_1_7;

public class BookStore {
	private String[][] bookArray;  
	private int bookName = 0;
	private int bookAuthor = 1;
	private int bookGenre = 2;
	
	//BookGenre bookGenre1;
	
	public BookStore(){
		//bookArray = new String[100][3]; 
		bookArray = new String[][]{
			{"The Deep End of the Ocean","Jacquelyn Mitchard","BookGenre.Fantasy"},
			{"1","2","3"}
		};				
	}
	
	public void printArray(){
		for (int i = 0; i< bookArray.length; i++){
				System.out.println(bookArray[i][bookName]+" "+
		                           bookArray[i][bookAuthor]+" "+
						           bookArray[i][bookGenre]);
		}
	}
}
