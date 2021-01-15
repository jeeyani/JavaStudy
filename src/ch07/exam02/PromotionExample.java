package ch07.exam02;


public class PromotionExample {

	B b =new B();
	C c = new C();
	D d = new D();
	String e = new String();
	
	
	//자동 변환가능
	A a1 =b;
	A a2 =c;
	A a3 =d;
	//A a4 =e;
	
	B b2 = d;
	//C c2 = e;
	
	
	//자동형 변환 불가능
	//B b3 = e;
	//C c3 = d;
	
}
