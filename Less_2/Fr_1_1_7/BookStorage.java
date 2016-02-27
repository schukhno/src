package Less_2.Fr_1_1_7;

public class BookStorage {
	private String bookName;
	private String bookAuthor;
	private BookGenre bookGenre;
	
	
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

	public BookStorage(){
		
	}

	public BookStorage(String bookName, String bookAuthor, BookGenre bookGenre){
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenre;
	}
}
