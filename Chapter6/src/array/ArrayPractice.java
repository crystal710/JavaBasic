package array;

public class ArrayPractice {

	public static void main(String[] args) {

		char arr[]= new char[26];
		char ch = 'A'; // �ƽ�Ű�ڵ�ξ��ϰ� ���ڿ��� ȣ�� �� ++����
		
		for(int i = 0; i<arr.length ; i++) {
			//arr[i] = (char)(65+i); //�ƽ�Ű�ڵ�� A-Z���� ���
			arr[i] = ch++;
		}
		for (int i = 0 ; i<arr.length; i++) {
			//System.out.println(arr[i] + " ");
			System.out.println(arr[i] + ","+ (int)arr[i]);
		}
	}

}
