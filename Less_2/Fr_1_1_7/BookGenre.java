package Less_2.Fr_1_1_7;

public enum BookGenre {
	Fantasy(1), Food(2), Computers(3), Fiction(4), History(5);
	
	private int value;
    
	private BookGenre(int value) {
	    this.value = value;
	}
	
	public String getGenre() {
		    return this.name();
	}
}


