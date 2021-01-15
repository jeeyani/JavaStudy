package ch09.exam03;

public class A {

	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	//정적 클래스가 아닌 B
	class B{
		void method() {
			field1 =10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	//정적 클래스인 C
	static class C{
		void method() {
			//정적으로 선언되지 않았기 때문에 객체를 필요로 한다
			/*field1 =10;
			method1();*/
			
			
			
			field2 = 10;
			method2();
		}
	}
	
}
