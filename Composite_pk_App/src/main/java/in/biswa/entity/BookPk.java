package in.biswa.entity;

import jakarta.persistence.Embeddable;


@Embeddable
public class BookPk {

	private int BookId;
	private String BookName;
	
	public BookPk() {
		
	}
	
	
	public BookPk(int bookId, String bookName) {
		super();
		BookId = bookId;
		BookName = bookName;
	}


	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", BookName=" + BookName + "]";
	}
	
	
}
