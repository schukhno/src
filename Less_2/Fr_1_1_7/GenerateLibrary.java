package Less_2.Fr_1_1_7;

public class GenerateLibrary {
	
	private BookStorage[] bs = new BookStorage[50];
			
	public GenerateLibrary(){
		for(int i = 0; i<10; i++){
			bs[i] = new BookStorage("BookName_"+i,"Author_"+i,BookGenre.Fantasy);
		}
		for(int i = 10; i<20; i++){
			bs[i] = new BookStorage("BookName_"+i,"Author_"+i,BookGenre.Food);
		}
		for(int i = 20; i<30; i++){
			bs[i] = new BookStorage("BookName_"+i,"Author_"+i,BookGenre.Computers);
		}
		for(int i = 30; i<40; i++){
			bs[i] = new BookStorage("BookName_"+i,"Author_"+i,BookGenre.Fiction);
		}
		for(int i = 40; i<49; i++){
			bs[i] = new BookStorage("BookName_"+i,"Author_"+i,BookGenre.History);
		}
	}
	
	public void printAllBooks(){
		for (int i = 0; i< bs.length; i++){
				System.out.println(bs[i].getBookName()+" "+
						           bs[i].getBookAuthor()+" "+
						           bs[i].getBookGenre());
		}
	}
		
	public void findNameAuthor(String bookName, String bookAuthor){
		boolean flag = false;
		for(int i=0;i<bs.length; i++){
			if(bs[i]!=null && bookName.equals(bs[i].getBookName()) && bookAuthor.equals(bs[i].getBookAuthor())){
				System.out.println("Book was found:");
				System.out.println(bs[i].getBookName()+" was wrote by "+
								   bs[i].getBookAuthor()+", "+
								   bs[i].getBookGenre()+" genre"
				);
				flag = true;
				break;
			}	
		}
		
		if(flag==false){
			System.out.println("Book - "+ bookName +" was NOT found in the library!");
		}
	}
	
	private BookStorage[] genreArray;
	private int indx = 0;
	
	private void findByGenre(BookGenre bookGenre){

		genreArray = new BookStorage[50];
		
		for (int i = 0; i< bs.length; i++){
			if(bs[i]!=null && bookGenre.equals(bs[i].getBookGenre())){
				genreArray[indx] = new BookStorage(bs[i].getBookName(), 
											       bs[i].getBookAuthor(), 
											       bs[i].getBookGenre());
				indx++;
			}
		}
	}
	
	private int counter = 0;
	
	public void printBookByGenre(BookGenre bookGenre){
		
		if(genreArray == null || !bookGenre.equals(genreArray[0].getBookGenre()) ){
			findByGenre(bookGenre);
			counter = 0;
			this.indx = 0;
		}
		
		int indx = 0;
		
		for(; indx<5; ){
				if(genreArray[counter]!=null){
				System.out.println(genreArray[counter].getBookName()+" was wrote by "+
						genreArray[counter].getBookAuthor()+", "+
						genreArray[counter].getBookGenre()+" genre");
				}
				indx++;
				counter++;
		}	
	}
}
