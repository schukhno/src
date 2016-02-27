package Less_2.Fr_1_1_7;

public class Launcher {
	static String[] str;
	public static void main(String[] args) {
		GenerateLibrary gl = new GenerateLibrary();

		gl.findNameAuthor("BookName_5", "Author_5");
		System.out.println("============================================");
		gl.findNameAuthor("BookName_555", "Author_555");
		System.out.println("============================================");
		gl.printBookByGenre(BookGenre.Computers);
		System.out.println("============================================");
		gl.printBookByGenre(BookGenre.Computers);
		System.out.println("============================================");
		gl.printBookByGenre(BookGenre.History);
		System.out.println("============================================");
		gl.printBookByGenre(BookGenre.History);
		System.out.println("============================================");
		gl.printBookByGenre(BookGenre.Fiction);
		

	}

}
