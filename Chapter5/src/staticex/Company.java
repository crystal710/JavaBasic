package staticex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company(); //�� �ϳ��� �����ؼ� ��� singleton pattern
		}
		return instance;
		
	}
}
