package practice;


public class CardCompany {
	private static CardCompany instance = new CardCompany();
		
		private CardCompany() {
			
		}
		
		public static CardCompany getInstance() {
			if(instance == null) {
				instance = new CardCompany(); //�� �ϳ��� �����ؼ� ��� singleton pattern
			}
			return instance;
			
		}
		public Card createCard() {
			Card card = new Card();
			return card;
		}
}
