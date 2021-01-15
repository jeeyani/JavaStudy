package ch12;

public class MainThreadExample {

	public static void main(String[] args) {

		//공유객체
		Calculator calc = new Calculator();

		//User1 Thread 실행
		User1 user1 = new User1();
		user1.setCalculator(calc); //자식만 가지고 있는 메소드를 사용하기 위해 선언을 자식으로 해줌

		user1.start();

		//User2 Thread 실행
		User2 user2 = new User2();
		user2.setCalculator(calc); 

		user2.start();
	}

}
