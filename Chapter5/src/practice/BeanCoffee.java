package practice;

public class BeanCoffee {
	int money;
	 public String coffee(int money) {
		 
		 this.money += money;
		 if(money == Menu.BEANAMERICANO) {
			 return "��ٹ� �Ƹ޸�ī�븦 �����ϼ̽��ϴ�.";
		 }
		 else if(money == Menu.BEANLATTE) {
			 return "��ٹ� ���׸� �����ϼ̽��ϴ�.";
		 }
		 else {
			 return null;
		 }
	 }
}
