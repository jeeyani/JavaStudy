package ch09.exam01;

public class Main {
	
	public static void main(String[] args) {
	
	A a = new A();
	
	A.B b = a.new B();
	b.field1 = 3;
	b.method1();
	
	//정적 멤버 클래스
	A.C c = new A.C();
	c.field1 = 10;
	c.field2 =20;
	c.method1();
	c.method2();
	
	//A의 메소드가 실행
	a.methodA();

}
	}
