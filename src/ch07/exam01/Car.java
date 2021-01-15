package ch07.exam01;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed ++;
	}
	
	public final void stop() {
		System.out.println("차 멈춤");
		speed =0;
	}
}
