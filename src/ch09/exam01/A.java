package ch09.exam01;

class A {
 
	A(){
		System.out.println("A 객체가 생성됨");
	}

	class B{
		B(){System.out.println("B 객체가 생성됨");}
		
		int field1;
		//static int field2; //인스턴스 멤버는 객체가 존재해야함으로 static를 붙일 수 없다
		
		void method1() {}
		//static void method2() {}
		}
	
	static class C{
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		}
	
	void methodA() {
		class D{
			D(){System.out.println("D 객체가 생성됨");}
			int field1;
			//static int field2; //D메소드를 사용하기 위해서는 객체 생성이후 가능함으로 static을 붙일 수 없다
			void method1() {}
			//static void method2() {}
		}
		
		D d = new D();
		d.field1 =3;
		d.method1();
	}
	
}


