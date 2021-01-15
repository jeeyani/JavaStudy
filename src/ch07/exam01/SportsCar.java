package ch07.exam01;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed+=10;
	}
	

	/*@Override
	void stop() { //final메소드 이기 때문에 재정의가 불가능
	}*/
	
}
