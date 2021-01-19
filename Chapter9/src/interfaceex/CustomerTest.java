package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();//intanceÀÇ order default°ª ¾È³ª¿È
		
		Sell seller = customer;
		seller.sell();
		seller.order();
	}

}
