package practice1;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬방식을 선택하세요.");
		System.out.println("B : Bubble Sort");
		System.out.println("H : Heap Sort");
		System.out.println("Q : Quick Sort");
		
		int s = System.in.read();
		Sort sort = null;
		
		if(s == 'B' || s == 'b') {
			sort = new BubbleSort();
		}
		else if(s== 'H'|| s=='h') {
			sort = new HeapSort();
		}
		else if(s == 'Q' || s == 'q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("Error입니다.");
			return;
		}
		
		sort.ascending();
		sort.descending();
		sort.description();
		
	}

}
