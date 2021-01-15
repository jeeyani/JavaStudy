package ch09.exam04;

public class A {

	void method1(final int arg) {
		final int var = 1;

		//로컬 변수의 값을 변경 할 수 없다
		//로컬 변수가 중첩클래스 안에 있을 시 final의 특성을 가지는 것으로 취급
		//arg = 50;
		//var = 100;

		class Inner {
			void method2() {
				//로컬 변수의 값을 읽기
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
				int res = var + arg;

			}
		}

	}

}
