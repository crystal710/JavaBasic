package practice;

public class Starcoffee {

	int money;
	 public String coffee(int money) {
		 
		 this.money += money;
		 if(money == Menu.STARAMERICANO) {
			 return "별다방 아메리카노를 구매하셨습니다.";
		 }
		 else if(money == Menu.STARLATTE) {
			 return "별다방 라테를 구매하셨습니다.";
		 }
		 else {
			 return null;
		 }
	 }
}
