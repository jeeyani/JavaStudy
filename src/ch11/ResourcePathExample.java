package ch11;

import ch06.exam04.Calculator;
import ch06.exam04.Car;

public class ResourcePathExample {

	public static void main(String[] args) {
		
		Class clax = Car.class;
		
		String path1 = clax.getResource("photo1.jpg").getPath();
		String path2 = clax.getResource("images/photo2.jpg").getPath();

		System.out.println(path1);
		System.out.println(path2);
	}

}
