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
		address = "�ּ� ����";
		serialNum++;
		studentID =serialNum;
	} //�����ڸ� �̸� �������ָ� testŬ�������� �̹� ������ �����Ǿ� ������ �߻�
	//�����ε� ������ ������ ��������
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getStudenntID() {
		serialNum++;//�Ϲ� �ν��Ͻ������� static���� ��밡�� ������ �̹� ������ �����Ǳ⶧��
		return studentID;
	}


	public static int getSerialNum() {
		int i = 0;
		//studentName = "Lee";//static�ȿ��� �ν��Ͻ� ���� ���Ұ� �ν��Ͻ��� new�Ǿ�� �����Ǵ� ���̶� ���Ұ� 
		
		return serialNum;
	}


	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
