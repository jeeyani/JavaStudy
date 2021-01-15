package ch07.exam02;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver dri = new Driver();
		
		Taxi taxi = new Taxi();
		Bus b = new Bus();
		
		
		
		dri.driver(taxi);
		dri.driver(b);
	}

}
