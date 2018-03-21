package code20180321day.test;

public class TestObject1 {
	public static void main(String[] args) {
		
		Book book1 = new Book("三生三世",99.9,"150","佚名");
		Book book2 = new Book("三生三世",99.9,"150","佚名");
		
		System.out.println(book1.getAuthor().equals(book2.getAuthor()));
		System.out.println(book1.getAuthor()==book2.getAuthor());
				
	}
}

class Book{
	
	private String name;
	private double price;
	private String  page;
	private String  author;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(String name, double price, String page, String author) {
		super();
		this.name = name;
		this.price = price;
		this.page = page;
		this.author = author;
	}
	public Book() {
		super();
	}
	
//	public boolean equals(Object obj){
//		
//		if (this ==obj ) {
//			return true;
//		}
//		
//		if (!(obj instanceof Book)) {
//			return false;
//		}
//		
//		Book book = (Book) obj;
//		return  this.name.equals(book.name) &&this.page == book.page&&this.price==book.price&&this.author.equals(book.author);
//		
//	}
	
	
}