package ch08.exam02.casting;

public class Driver {

	//Vehicle(인터페이스)
	public void driver(Vehicle ve){ //Vehicle로 구현가능한 모든 객체가 올 수 있음
		if(ve instanceof Bus) { //Bus
			Bus bus = (Bus) ve;
			bus.checkFare();
		} 
		ve.run();
	}
	
}
