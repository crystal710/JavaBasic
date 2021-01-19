package thread;

class Bank2{
	private int money = 10000;
	
	public void saveMoney(int save) {
		synchronized (this) {//synchronized 블록방식
			int m = this.getMoney();
		
		
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m + save);
		}
	}

	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m - minus);
	}
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}

class Park2 extends Thread{
	
	public void run() {
		System.out.println("start save");
		SyncTest2.myBank.saveMoney(3000);
		System.out.println("save money: " + SyncTest2.myBank.getMoney());
	}
	
}

class ParkWife2 extends Thread{
	public void run() {
		System.out.println("start minus");
		SyncTest2.myBank.minusMoney(1000);
		System.out.println("minus money: " + SyncTest2.myBank.getMoney());
	}
}

public class SyncTest2 {
	
	public static Bank myBank = new Bank();

	public static void main(String[] args) throws InterruptedException {
		Park2 p = new Park2();
		p.start();//박씨가 끝날때 까지 박씨와이프는 뱅크에 수행되지않음
		
		Thread.sleep(200);
		ParkWife2 pw = new ParkWife2();
		pw.start();
		
	}

}
