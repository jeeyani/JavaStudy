package ch09_anonymous.exam01;

public class AnonymousExample {

	public static void main(String[] args) {
		
		
		Anonymous anon = new Anonymous();
		
		anon.p.wake();
		anon.method1();
		anon.method2(new Person() {
			void study() {
				System.out.println("공부합니다");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다");
				study();
			}
		});

	}

}
