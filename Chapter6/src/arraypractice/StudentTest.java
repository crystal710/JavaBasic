package arraypractice;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		
		studentLee.addBook("�¹���1");
		studentLee.addBook("�¹���2");
		
		Student studentKim = new Student("Kim");
		
		studentKim.addBook("����1");
		studentKim.addBook("����2");
		studentKim.addBook("����3");
		
		Student studentCho = new Student("Cho");
		
		studentCho.addBook("�ظ�����1");
		studentCho.addBook("�ظ�����2");
		studentCho.addBook("�ظ�����3");
		studentCho.addBook("�ظ�����4");
		studentCho.addBook("�ظ�����5");
		studentCho.addBook("�ظ�����6");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
	}

}
