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
		
		book.setTitle(title);//set get�� �������.
		
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		System.out.print(studentName + " �л��� ���� å�� : ");
		for(Book book : bookList) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println(" �Դϴ�.");
	}
}
