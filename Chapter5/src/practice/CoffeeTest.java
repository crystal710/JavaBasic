package practice;

public class CoffeeTest {

	public static void main(String[] args) {

		Person kim = new Person("Kim", 10000);
		Person Lee = new Person("Lee", 10000);
		Starcoffee starCoffee = new Starcoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
		
		kim.buyStarcoffee(starCoffee, Menu.STARAMERICANO);
		Lee.buyBeanCoffee(beanCoffee, Menu.BEANLATTE);
		
	}

}
