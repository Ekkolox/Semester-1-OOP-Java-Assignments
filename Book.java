package assignments;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvaliable;

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.isAvaliable = true;
		this.ISBN = ISBN;
		
	}
	public void borrowBook() {
		if (isAvaliable) {
			isAvaliable = false;
			System.out.println(title + "has been borrowed");
		} else {
			System.out.println(title + "is currently unavaliable");
		}
	}
	public void returnBook() {
		isAvaliable = true;
		System.out.println(title + "has been returned");
	}
	public void displayBookDetails() {
		System.out.println("Title: " + title + "," + " Author: " + author + "," + "ISBN: " + ISBN + "," + "Avaliable: " + isAvaliable);
	}
}
