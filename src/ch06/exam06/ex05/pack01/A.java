package ch06.exam06.ex05.pack01;

public class A {

	public int field;
	int field2;
	private int field3;
	
	
	
	public A() {
		//같은 내부에서는 모두 사용가능
		field = 1;
		field2 =1;
		field3 =1;
		
		method1();
		method2();
		method3();
	}
	
	
	public void method1() {} //public
	void method2() {} //default
	private void method3() {} //private
}
