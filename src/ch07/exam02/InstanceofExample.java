package ch07.exam02;

public class InstanceofExample {

	public static void main(String[] args) {
		
		Parent3 p3 = new Child3();
		method1(p3); //true
		method2(p3); //자식타입으로 강제 변형
		
		Parent3 p4 = new Parent3();
		method1(p4); //false
		//method2(p4); //예외발생
		
	}
	
	public static void method1(Parent3 p) {
		if(p instanceof Child3) { //p가 Child3타입이면
			Child3 ch3 = new Child3();
			System.out.println("메소드1 - child변환성공");
		}else {
			System.out.println("메소드1 - child변환되지 않음");
		}
	}
	
	public static void method2(Parent3 p) {
		Child3 ch3= (Child3) p;
		System.out.println("메소드2 - child변환성공");
	}

}
