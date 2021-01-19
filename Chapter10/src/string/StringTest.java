package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");//heap메모리 allocation되는것
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";//상수풀에서 가져옴
		System.out.println(str3 == str4);
	}

}
