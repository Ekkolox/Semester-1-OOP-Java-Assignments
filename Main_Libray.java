package assignments;

public class Main_Libray {

	public static void main(String[] args) {
		Book book1 = new Book("The Fault in Our Stars","John Green","554929");
		Book book2 =  new Book("Half of a Yellow Sun", "Ngozi Chimammanda", "227542");
		Book book3 =  new Book("Memory Man", "David Baldacci", "776824");
		
		book1.displayBookDetails();
		book2.displayBookDetails();
		book3.displayBookDetails();
		
		book1.borrowBook();
		book2.borrowBook();
		
		book1.returnBook();
		
		book1.displayBookDetails();
		book2.displayBookDetails();
	}

}
