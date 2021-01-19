package polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		
		super(customerID,customerName); //����Ŭ������ �⺻�����ڰ� ȣ���
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		//System.out.println("VIPCustomer(int, Stirng)������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}//�ٸ��� �������Ҽ����� -> override
	
	
}
