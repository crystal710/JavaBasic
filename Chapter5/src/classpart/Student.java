package classpart;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
	} //생성자를 미리 제공해주면 test클래스에서 이미 생성자 생성되어 오류가 발생
	//오버로딩 생성자 여러개 생성가능
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}
