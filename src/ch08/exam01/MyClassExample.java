package ch08.exam01;

public class MyClassExample {

	public static void main(String[] args) {

		System.out.println("(1)-----------------------");

		MyClass mc = new MyClass();
		mc.r.turnOn();
		mc.r.setVolume(5);

		System.out.println("(2)-----------------------");

		MyClass mc2 = new MyClass(new Audio());

		System.out.println("(3)-----------------------");

		MyClass mc3 = new MyClass();
		mc3.methodA();

		System.out.println("(4)-----------------------");

		MyClass mc4 = new MyClass();
		mc4.methodB();

	}

}
