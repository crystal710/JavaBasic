package practice;

public class CardTest {

	public static void main(String[] args) {

		CardCompany company = CardCompany.getInstance();
		
		Card mycard = company.createCard();
		Card yourcard = company.createCard();
		
		System.out.println(mycard.getcardNum());
		System.out.println(yourcard.getcardNum());
	}

}
