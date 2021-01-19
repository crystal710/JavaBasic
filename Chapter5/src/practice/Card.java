package practice;

public class Card {

	private int cardNum;
	private static int serialNum = 10000;
	
	Card(){
		serialNum++;
		cardNum = serialNum;
	}
	
	public int getcardNum() {
		return cardNum;
	}
	
	public void setcardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	
	
}
