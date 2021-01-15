package ch02.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte res1 = 10+20; // 컴파일 단계에서 연산을 실행 
		System.out.println(res1); 

		byte x=10;
		byte y=20;
		int res2 = x+y; //정수타입의 변수가 연산식에서 피연산자로 사용될때 "int타입"으로 자동 타입변환되어 연산을 수행함으로 결과값을 int형으로 받아줘야함
		System.out.println(res2); 
	}

}
