package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();//� �迭 ��Ҹ� �������� ���ϴ°� ����
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0 ; i<list.size();i++) {//size�� element �� ������ ��Ÿ��
			String string = list.get(i);
			System.out.println(string);
			
		}
		
		for(String s : list) { //ó������ ������ ������ ����ϱ�
			System.out.println(s);
		}
		
	}

}
