package polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID,customerName); //상위클래스의 기본생성자가 호출됨
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		//System.out.println("VIPCustomer(int, Stirng)생성자 호출");
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}//다르게 재정의할수있음 -> override
	
	
}
