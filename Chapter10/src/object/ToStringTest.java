package object;

class Book implements Cloneable{//book클래스가 클론화 가능하다를 해놔야함
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Book book = new Book("토지", "박경리");
		
		
		System.out.println(book);
		
		Book book2 =(Book) book.clone();
		System.out.println(book2);
		
	}

}
