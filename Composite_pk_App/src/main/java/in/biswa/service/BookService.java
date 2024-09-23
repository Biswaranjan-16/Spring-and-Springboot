package in.biswa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.biswa.entity.Book;
import in.biswa.entity.BookPk;
import in.biswa.repo.BookRepo;

@Service
public class BookService {
	
    @Autowired
	public BookRepo bookrepo;
    
    
	public void saveBook() {
		BookPk pk=new BookPk(101,"java");
		
		Book entity=new Book(1000.00,"james",pk); 
		
		bookrepo.save(entity);
		
		System.out.println("Record inserted successfully");
	}
	
	public void getBook() {
		BookPk pk=new BookPk(101,"java");
		Optional<Book> findbyId = bookrepo.findById(pk);
		if(findbyId.isPresent()) {
			System.out.println(findbyId.get());
		}
		
	}
	
}
