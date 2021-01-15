package ch09.exam05;

public class OutterExample {

	public static void main(String[] args) {
		
		Outter out = new Outter();
		Outter.Nested nes = out.new Nested();
		nes.print();
		
	}

}
