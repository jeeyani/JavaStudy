package ch07.exam01;

public class SupersonicAirplanceExample {

	public static void main(String[] args) {
		
		SupersonicAirplance sa = new SupersonicAirplance();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplance.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplance.NORMAL;
		sa.fly();
		sa.land();

	}

}
