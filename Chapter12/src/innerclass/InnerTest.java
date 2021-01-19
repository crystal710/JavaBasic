package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	class InClass{
		int iNum = 100;

		void inTest() {
			System.out.println(num);
			System.out.println(sNum);//outclass의 static변수는 이미 선언되어있어 intest에서 사용가능
		}
	}
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			//System.out.println(inNum);//static메소드에서 사용불가능 클래스 생성 이후에 만들어지는 변수라 불가능
			System.out.println(sInNum);
			System.out.println(sNum);
		}//static class인 경우 static 변수선언과 메소드 생성이 모두 가능 static들만 메소드안에 사용 가능
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		outclass.usingInner();//pirvate라 직접 intest 가져올수없어서 public메소드 하나 만들어서 호출
		
		OutClass.InClass myInClass = outclass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}

}
