package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");//heap�޸� allocation�Ǵ°�
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";//���Ǯ���� ������
		System.out.println(str3 == str4);
	}

}
