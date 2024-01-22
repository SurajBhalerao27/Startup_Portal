/*
	 7. Create a class Book which describes its Book_title and Book_price.
	 Use getter and setter Methods to get & set the Books description.
	 Implement createBook and showBook methods to create and display Book Information.
	 Write a separate class BookInfo to access the Book class
*/
package practice;

public class BookPojo {
	    private String bookTitle;
	    private double bookPrice;

	    public String getBookTitle() {
	        return bookTitle;
	    }

	    public void setBookTitle(String bookTitle) {
	        this.bookTitle = bookTitle;
	    }

	    public double getBookPrice() {
	        return bookPrice;
	    }

	    public void setBookPrice(double bookPrice) {
	        this.bookPrice = bookPrice;
	    }

	    public void createBook(String bookTitle, double bookPrice) {
	        this.bookTitle = bookTitle;
	        this.bookPrice = bookPrice;
	    }

	    public void showBook() {
	        System.out.println("Book title: " + bookTitle);
	        System.out.println("Book price: " + bookPrice);
	    }
	}