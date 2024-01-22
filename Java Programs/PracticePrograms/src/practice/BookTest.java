package practice;

public class BookTest {
	public static void main(String[] args) {
		BookPojo b = new BookPojo();
		b.createBook("Rich Dad Poor Dad", 155.55);
		b.createBook("English Grammer", 500.25);


		b.showBook();
	}
}
