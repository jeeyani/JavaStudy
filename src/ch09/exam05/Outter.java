package ch09.exam05;

public class Outter {

	String field = "바깥 필드";
	
	void method() {
		System.out.println("바깥 클래스");
	}
	
	class Nested{
		String field = "중첩 필드";
		void method() {
			System.out.println("중첩 클래스");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
			
			
		}
	}
	
}
