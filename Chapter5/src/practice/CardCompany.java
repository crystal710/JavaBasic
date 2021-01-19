package practice;


public class CardCompany {
	private static CardCompany instance = new CardCompany();
		
		private CardCompany() {
			
		}
		
		public static CardCompany getInstance() {
			if(instance == null) {
				instance = new CardCompany(); //단 하나만 생성해서 사용 singleton pattern
			}
			return instance;
			
		}
		public Card createCard() {
			Card card = new Card();
			return card;
		}
}
