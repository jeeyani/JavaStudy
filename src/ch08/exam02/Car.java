package ch08.exam02;

public class Car {

	Tire FL = new HankookTire();
	Tire FR = new HankookTire();
	Tire BL = new HankookTire();
	Tire BR = new HankookTire();
	
	void run() {
		FL.roll();
		FR.roll();
		BL.roll();
		BR.roll();
	}
	
}
