package in.biswa.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Book_info_table")
public class Book {

	private Double BookPrice;
	private String  BookAuthorName;
	
	@EmbeddedId
	private BookPk bookpk;
	
	
	public Book() {
		
	}


	


	public Book(Double bookPrice, String bookAuthorName, BookPk bookpk) {
		super();
		BookPrice = bookPrice;
		BookAuthorName = bookAuthorName;
		this.bookpk = bookpk;
	}


	public Double getBookPrice() {
		return BookPrice;
	}


	public void setBookPrice(Double bookPrice) {
		BookPrice = bookPrice;
	}


	public String getBookAuthorName() {
		return BookAuthorName;
	}


	public void setBookAuthorName(String bookAuthorName) {
		BookAuthorName = bookAuthorName;
	}


	public BookPk getBookpk() {
		return bookpk;
	}


	public void setBookpk(BookPk bookpk) {
		this.bookpk = bookpk;
	}
 
	@Override
	public String toString() {
		return "Book [BookPrice=" + BookPrice + ", BookAuthorName=" + BookAuthorName + ", bookpk=" + bookpk + "]";
	}	
	
}
