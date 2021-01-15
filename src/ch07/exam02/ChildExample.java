package ch07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		
		Child c = new Child();
		//부모타입으로 자동형변환
		Parent p = c;
		
		int c1 =5;
		double p1 = c1;
		
		p.method1(); //
		p.method2(); //
		//p.method3(); //부모타입에 있는 메소드만 사용할 수 있음
		
		
		
		Child child = (Child) p;
		child.method1();
		child.method3();
		
		

	}

}
