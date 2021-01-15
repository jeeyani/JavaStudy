package ch07.exam03;

public class Cat extends Animal{

	public int age;
	
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}
