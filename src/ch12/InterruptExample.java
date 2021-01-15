package ch12;

public class InterruptExample {

	public static void main(String[] args) {
	
		Thread pt = new PrintThread2();
		pt.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	
		pt.interrupt();
		

	}

}
