package ch02.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		int value = 0; //초기화 해주기!
		
		int result = value +10; //(컴파일오류)value값에 초기값 설정이 안되어있음
		
		System.out.println(result);
	}

}
