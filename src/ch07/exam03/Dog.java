package ch07.exam03;

public class Dog extends Animal{
	
	public int age;

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
}
