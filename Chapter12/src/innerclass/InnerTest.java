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
			System.out.println(sNum);//outclass�� static������ �̹� ����Ǿ��־� intest���� ��밡��
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
			//System.out.println(inNum);//static�޼ҵ忡�� ���Ұ��� Ŭ���� ���� ���Ŀ� ��������� ������ �Ұ���
			System.out.println(sInNum);
			System.out.println(sNum);
		}//static class�� ��� static ��������� �޼ҵ� ������ ��� ���� static�鸸 �޼ҵ�ȿ� ��� ����
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		outclass.usingInner();//pirvate�� ���� intest �����ü���� public�޼ҵ� �ϳ� ���� ȣ��
		
		OutClass.InClass myInClass = outclass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		OutClass.InStaticClass.sTest();
	}

}
