package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 : " + priceLee + "원 입니다.");
		
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 : " + priceKim + "원 입니다.");
		
		Customer customerNo = new VIPCustomer(100030, "나몰라"); //인스턴스에 따라 메서드가 호출됨 재정의안되있으면 상위클래스의 메소드가 호출
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 : " + customerNo.calcPrice(10000) + "원 입니다.");
		//가상메소드 호출이 됨
		
	}
	

}
