package ch08.exam02;

public class Example {
	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.run();
		
		myCar.FL = new KumhoTire();
		myCar.FR = new KumhoTire();
		
		myCar.run();
	}
}
