package in.biswa.service;

import java.util.List;

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
		return bookrepo.findAll();
	}


	@Override
	public Boolean saveBook(Book book) {
		Book saveBook=bookrepo.save(book);
		
		if (saveBook.getBookId() != 0) {
			
		    return true;
		}


		return false;
	}

}
