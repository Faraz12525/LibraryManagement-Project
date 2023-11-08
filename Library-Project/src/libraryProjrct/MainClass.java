package libraryProjrct;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	private static LibraryOperation libraryOperation = new LibraryOperation();
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean exit = false;
		
		while (!exit) {
			System.out.println("Library System App");
			
			System.out.println("1. Add a book ");
			System.out.println("2. Search book ");
			System.out.println("3. Remove a book");
			System.out.println("4. Show all books");
			System.out.println("5. Exit ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				searchBook();
				break;
			case 3:
				removeBook();
				break;
			case 4:
				showBooks();
				break;
			case 5:
				exit = true;
				break;
		default:
				System.out.println("Invalid choice! Please select again");
			}
			
		}
	
	}

	//showing all books
	private static void showBooks() {
	    List<Book> books = libraryOperation.showBooks();
	    
	    if (books.isEmpty()) {
	        System.out.println("No books available.");
	    } else {
	        System.out.println("Available Books:");
	        for (Book book : books) {
	            System.out.println("Book ID: " + book.getBookId());
	            System.out.println("Book Name: " + book.getBookName());
	            System.out.println("Author: " + book.getAuthor());
	            System.out.println("--------------");
	        }
	    }
	        
	    }

	//Add method
	private static void addBook() {
		
		System.out.println("Enter Book ID ");
		String id = scanner.nextLine();
		System.out.println("Enter Book name ");
		String name = scanner.nextLine();
		System.out.println("Enter Book author name ");
		String author = scanner.nextLine();
		
		Book book = new Book(id, name, author);
		
		libraryOperation.addBook(book);
		System.out.println("Book added ");
	}
	
	//search method
	private static void searchBook() {
		
		System.out.println("Enter book name to search ");
		String key = scanner.nextLine();
		
		Book book = libraryOperation.searchBook(key);
		
		if (book != null) {
			System.out.println("Book ID "+book.getBookId());
			System.out.println("Book name "+book.getBookName());
			System.out.println("Book author "+book.getAuthor());
		}else {
			System.out.println("No such book found ");
		}
	}
	
	//removing  book
	private static void removeBook() {
		
		System.out.println("Enter to name to remove book ");
		String name = scanner.nextLine();
		 libraryOperation.removeBook(name);
		 System.out.println("Book "+name+" has been removed");
	}

}
