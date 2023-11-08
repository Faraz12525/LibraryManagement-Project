package libraryProjrct;

import java.util.ArrayList;
import java.util.List;

public class LibraryOperation {
	
	private List<Book> books;

	public LibraryOperation() {
		books = new ArrayList<>();
	}
	
	//Adding book 
	public void addBook(Book book) {
		books.add(book);
	}
	
	//Searching Book by its name
	public Book searchBook(String key) {
		for (Book book : books) {
			if (book.getBookName().equalsIgnoreCase(key)) {
				return book;
			}
			
		}
		return null;
	}
	
	
	
	//Showing all books
	public List<Book> showBooks() {
	    return books;
	}
	
	//removing Book
	public void removeBook(String name) {
		Book book = searchBook(name);
		if (book != null) {
			books.remove(book);
		}
	}
}
