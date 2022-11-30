package source;

public class Book {

	private int bookid;
	private String bookname,author;
	private float price;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book(int bookid, String bookname, String author, float price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	
	}
	
	void display() {
		
		System.out.println("Book Id: "+bookid);
		System.out.println("Book Name: "+bookname);
		System.out.println("Author Name: "+author);
		System.out.println("Book Price: "+price);
		System.out.println("**********************");
		
		
	}
	
	
	
	
}
