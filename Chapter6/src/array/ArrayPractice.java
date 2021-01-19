package array;

public class ArrayPractice {

	public static void main(String[] args) {

		char arr[]= new char[26];
		char ch = 'A'; // 아스키코드로안하고 문자열로 호출 후 ++가능
		
		for(int i = 0; i<arr.length ; i++) {
			//arr[i] = (char)(65+i); //아스키코드로 A-Z까지 출력
			arr[i] = ch++;
		}
		for (int i = 0 ; i<arr.length; i++) {
			//System.out.println(arr[i] + " ");
			System.out.println(arr[i] + ","+ (int)arr[i]);
		}
	}

}
