package ch07.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r =10;
		
		Calculator ca = new Calculator();
		System.out.println("원의 면적: "+ca.areaCircle(r));
		
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원의 면적: "+com.areaCircle(r));

	}

}
