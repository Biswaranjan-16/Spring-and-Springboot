 package in.biswa.service;

import java.util.List;

import in.biswa.entity.Book;

public interface BookService {
	public List<Book> getAllBooks();
	
	public Boolean saveBook(Book book);
	
	public void  deleteBook(Integer bookId);
	
	public Book getBookById(Integer bookId);
	
}
