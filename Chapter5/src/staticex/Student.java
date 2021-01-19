package staticex;

public class Student {

	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		studentID =serialNum;
	}
	
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNum++;
		studentID =serialNum;
	} //생성자를 미리 제공해주면 test클래스에서 이미 생성자 생성되어 오류가 발생
	//오버로딩 생성자 여러개 생성가능
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getStudenntID() {
		serialNum++;//일반 인스턴스에서는 static변수 사용가능 변수가 이미 이전에 생성되기때문
		return studentID;
	}


	public static int getSerialNum() {
		int i = 0;
		//studentName = "Lee";//static안에서 인스턴스 변수 사용불가 인스턴스가 new되어야 생성되는 것이라 사용불가 
		
		return serialNum;
	}


	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
