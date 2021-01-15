package ch09.exam02;

public class A {

	B field1 = new B();
	C field2 = new C();
		
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	
	//static B field3 = new B(); //애초에 B는 인스턴스 멤버
	C field4 = new C();
	
	static void method2() {
		//B var1 = new B(); //인스턴스 멤버를 static 메소드에서 생성할 수 없다
		C var2 = new C();
	}	
			
	class B{}
	static class C{}
	
}
