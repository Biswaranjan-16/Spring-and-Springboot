package in.biswa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.biswa.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
