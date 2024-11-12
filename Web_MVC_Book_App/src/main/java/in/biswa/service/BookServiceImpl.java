package in.biswa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.biswa.entity.Book;
import in.biswa.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepo bookrepo;


	@Override
	public List<Book> getAllBooks() {
		
		return bookrepo.findByActiveSw("Y");
	}


	@Override
	public Boolean saveBook(Book book) {
		book.setActiveSw("Y");
		Book saveBook=bookrepo.save(book);	
		if (saveBook.getBookId() != 0) {	
		    return true;
		}
		return false;
	}
	@Override
	public void deleteBook(Integer bookId) {
		
		
		//hard delete
		//bookrepo.deleteById(bookId);
		
		
		//soft delete
		Optional<Book> findById=bookrepo.findById(bookId);
		if(findById.isPresent()) {
			Book book=findById.get();
			book.setActiveSw("N");
			bookrepo.save(book);
			
		}
		
	}
	@Override
	public Book getBookById(Integer bookId) {
		
		Optional<Book> findById=bookrepo.findById(bookId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

}
