package ch08.exam02;

public class DriverExample {
	public static void main(String[] args) {

		Driver d = new Driver();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		d.driver(b);
		d.driver(t);
		
		
	}
}
