package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

		int dan=2;
		int count=1;
		
		/* for(dan = 2; dan < 10 ; dan++) {
			for(count = 1 ; count <10 ; count++) {
				
				System.out.println(dan + "X" + count + "=" + dan*count);
			}
			System.out.println();
		}
		*/
		while(dan<10) {
			count=1;
			while(count<10) {
				System.out.println(dan + "X" + count + "=" + dan*count);
				count++;
			}
			dan++;
			System.out.println();
		}
		
		
	}

}
