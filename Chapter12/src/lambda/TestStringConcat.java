package lambda;

public class TestStringConcat {

	public static void main(String[] args) {

		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		StringConcat concat = (s, v) -> System.out.println(s + "," + v);//���ٽ����� ǥ��
		concat.makeString("hello", "world");
		
		StringConcat concat2 = new StringConcat() {//�͸� ����Ŭ���� ���
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		concat2.makeString("hello", "world");
	}

}
