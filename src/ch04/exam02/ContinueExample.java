package ch04.exam02;

public class ContinueExample {

	public static void main(String[] args) {
		
		//2배수만 출력하기
		for (int i = 1; i <=10; i++) {
			if (i%2!=0) {
				continue; //2의 배수가 아니면 for다시 시작
			}
			System.out.println(i);
		}

	}

}
