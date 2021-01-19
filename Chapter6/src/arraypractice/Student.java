package arraypractice;

import java.util.ArrayList;

import array.Book;

public class Student {

	String studentName;
	ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String title) {
		Book book = new Book(title, studentName);
		
		book.setTitle(title);//set get을 해줘야함.
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(studentName + " 학생이 읽은 책은 : ");
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println(" 입니다.");
	}
}
