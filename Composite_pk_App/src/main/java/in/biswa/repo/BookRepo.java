package in.biswa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.biswa.entity.Book;
import in.biswa.entity.BookPk;

public interface BookRepo extends JpaRepository<Book, BookPk>{


}
