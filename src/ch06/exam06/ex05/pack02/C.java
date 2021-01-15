package ch06.exam06.ex05.pack02;

import ch06.exam06.ex05.pack01.*;

public class C {
	
	public C() {
		A a =new A();
		a.field = 1;
		//a.field2 =1; //default이기때문에 다른 패키지에서 사용불가
		//a.field3 = 1; //private이기 때문에 외부에서 사용불가
		
		a.method1();
		//a.method2(); //default이기때문에 다른 패키지에서 사용불가
		//a.method3(); //private이기 때문에 외부에서 사용불가
		
	}
	
}
