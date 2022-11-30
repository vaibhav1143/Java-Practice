package source;

import java.util.Scanner;

public class BookFunction {

	int bookid,counter;
	String bookname,author;
	float price;
	int temp;
	Book[] book=new Book[20];
	Scanner sc=new Scanner(System.in);
	
	void index() {
		System.out.println("1. Add Book ");
		System.out.println("2. Update Book");
		System.out.println("3. Delete Book");
		System.out.println("4. Search Book");
		System.out.println("5. Get all Book");
		System.out.println("6. Exit");
		System.out.println("Enter your choice: ");
	}
	
	public void AddBook() {
		
		System.out.println("How many book you want to add");
		 temp=sc.nextInt();
		for(int i=0;i<temp;i++) {
			
			System.out.println("Enter book id");
			bookid=sc.nextInt();
			System.out.println("Enter book name");
			bookname=sc.next();
			System.out.println("Enter Author name");
			author=sc.next();
			System.out.println("Enter Price");
			price=sc.nextFloat();
			
			book[counter]=new Book(bookid, bookname, author, price);
			book[i].display();	
			counter++;
		}
		
		
		
	}
	
	public void update() {
		System.out.println("Enter Book id for book update");
		bookid=sc.nextInt();
		
		for(int i=0;i<counter;i++) {
			if(book[i].getBookid()==bookid) {
				
				System.out.println("Update Book Name");
				bookname=sc.next();
				book[i].setBookname(bookname);
				
				System.out.println("Enter Author name for update");
				author=sc.next();
				book[i].setAuthor(author);
				
				System.out.println("Update Price ");
				price=sc.nextFloat();
				book[i].setPrice(price);
			}
			else {
				System.out.println("NO Bookid available, Book not found");
			}
		}
		
	}
	
	public void delete() {
		System.out.println("Enter Book Id for delete detail");
		bookid=sc.nextInt();
		for(int i=0;i<counter;i++) {
			if(bookid==book[i].getBookid()) {
				book[i].setBookname("");
				book[i].setAuthor("");
				book[i].setPrice(0);
			}
			else {
				System.out.println("NO Bookid available, Book not found");
			}
		}
	}
	public void search() {
		System.out.println("Enter Book Id for delete detail");
		bookid=sc.nextInt();
		for(int i=0;i<counter;i++) {
			if(bookid==book[i].getBookid()) {
				System.out.println("Book Id : "+book[i].getBookid());
				System.out.println("Book Name : "+book[i].getBookname());
				System.out.println("Book Author Name : "+book[i].getAuthor());
				System.out.println("Book Price : "+book[i].getPrice());


			}
			else {
				System.out.println("NO Bookid available, Book not found");
			}
			
		}
		
	}
	
	public void Getall() {
		 for(int j=0;j<counter;j++){ 
			 book[j].display();			 
			
               }
	}
	
	
	}

