package practice;

public class Starcoffee {

	int money;
	 public String coffee(int money) {
		 
		 this.money += money;
		 if(money == Menu.STARAMERICANO) {
			 return "���ٹ� �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.";
		 }
		 else if(money == Menu.STARLATTE) {
			 return "���ٹ� ���׸� �����ϼ̽��ϴ�.";
		 }
		 else {
			 return null;
		 }
	 }
}
