package Less_2.Fr_2_4_2;

public class Book {
	private String bookName;
	private String bookAuthor;
	private BookGenre bookGenre;
	private long articul;
	private double price;	

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	

	public long getArticul() {
		return articul;
	}
	public void setArticul(long articul) {
		this.articul = articul;
	}	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public BookGenre getBookGenre() {
		return bookGenre;
	}
	public void setBookGenre(BookGenre bookGenre) {
		this.bookGenre = bookGenre;
	}

	public Book(){
		
	}

	public Book(String bookName, String bookAuthor, BookGenre bookGenre, long articul){
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
		this.articul = articul;
	}
}
