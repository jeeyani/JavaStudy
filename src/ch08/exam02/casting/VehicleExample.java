package ch08.exam02.casting;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle v = new Bus();
		
		v.run();
		
		//v.checkFare(); //인터페이스타입이기때문에 접근 불가능
		
		
		//버스로 강제타입변환
		Bus bus = (Bus) v;
		bus.checkFare();
		bus.run();

	}

}
