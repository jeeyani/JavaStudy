package ch10;



public class ClassCast {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) { //cat객체를 매개값으로 주어 dog타입으로 변환할 수 없기 때문에 instanceof를 이용해 확인한다
		Dog dog = (Dog) animal;
		}
	}
	
}
