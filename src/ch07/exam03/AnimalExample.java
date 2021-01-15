package ch07.exam03;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("--------------");
		
		
		
		Animal animal = null;
		//자동형변환
		animal = new Dog();
		animal.sound();
		
		//자동형변환
		animal = new Cat();
		animal.sound();
		System.out.println("--------------");
		
		//메소드의 다형성
		animalSOund(new Dog());
		animalSOund(new Cat());

		

	}
	
	public static void animalSOund(Animal animal) {
		animal.sound();
	}

}
