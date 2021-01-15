package ch11;

import ch06.exam02.Car;

public class ClassExample {

	public static void main(String[] args) throws Exception {
		
		//첫 번째 방법
		Class clazz = Car.class;
		
		//두 번째 방법
		Class clazz2 = Class.forName("ch08.exam02.Car");
		
		
		//세 번째 방법
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz3.getPackage().getName());
	}

}
