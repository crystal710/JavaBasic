package practice;

public class Person {

	String name;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	public void buyStarcoffee(Starcoffee scoffee, int money) {
		String message =scoffee.coffee(4000);
		if(message !=null) {
			this.money -=money;
			System.out.println(name + "는 " + money + "원 " + message);
		}
		
	}
	public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
		String message = bCoffee.coffee(4500);
		if(message != null) {
			this.money -= money;
			System.out.println(name + "는 " + money +"원 "  + message);
		}
	}
}
