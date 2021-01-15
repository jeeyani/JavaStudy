package ch06.exam06.ex05.pack01;

public class B {
	
	public B() {
		A a =new A();
		a.field = 1;
		a.field2 =1;
		//a.field3 = 1; //private이기 때문에 외부에서 사용불가
		
		a.method1();
		a.method2();
		//a.method3(); //private이기 때문에 외부에서 사용불가
		
	}
	
}
