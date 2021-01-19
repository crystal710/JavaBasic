package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();//어떤 배열 요소를 쓸것인지 정하는게 좋음
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i = 0 ; i<list.size();i++) {//size는 element 들어간 개수만 나타냄
			String string = list.get(i);
			System.out.println(string);
			
		}
		
		for(String s : list) { //처음부터 끝까지 돌려서 출력하기
			System.out.println(s);
		}
		
	}

}
