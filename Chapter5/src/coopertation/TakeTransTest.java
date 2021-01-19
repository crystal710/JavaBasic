package coopertation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		Student studentE = new Student("Edward", 30000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		Subway subwayGreen = new Subway(2);
		Taxi kakao = new Taxi("kakao");
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentE.takeTaxi(kakao);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		bus100.showBusInfo();
		bus500.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		
		kakao.showTaixInfo();
	}

}
