package ch07.exam02;

public class Car {
	Tire FL = new Tire("앞 왼쪽", 1);
	Tire FR = new Tire("앞 오른쪽", 2);
	Tire BL = new Tire("뒤 왼쪽", 3);
	Tire BR = new Tire("뒤 오른쪽", 4);
	
	
	int run() {
		System.out.println("[ 자동차가 달립니다 ]");
		if(FL.roll() == false) {stop(); return 1;}
		if(FR.roll() == false) {stop(); return 2;}
		if(BL.roll() == false) {stop(); return 3;}
		if(BR.roll() == false) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[ 자동차가 멈춥니다]");
	}
	
	
}
