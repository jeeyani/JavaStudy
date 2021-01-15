package ch06.exam04;

public class CarMethodExample {

	public static void main(String[] args) {
		
		
		CarMethod car = new CarMethod();
		
		car.keyTurnOn();
		car.run();
		int speed = car.getSpeed();
		System.out.println("현재속도: "+speed);
		
	}
	
}
