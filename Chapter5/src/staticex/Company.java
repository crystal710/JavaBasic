package staticex;

public class Company {

	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company(); //단 하나만 생성해서 사용 singleton pattern
		}
		return instance;
		
	}
}
