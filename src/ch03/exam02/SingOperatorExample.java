package ch03.exam02;

public class SingOperatorExample {

	public static void main(String[] args) {
		//부호연산자
		int x =-100;
		int res1 = +x; 
		int res2 = -x;
		System.out.println("res1 = "+res1);
		System.out.println("res2 = "+res2);
		
		byte b =100;
		//byte res3 = -b; //(컴파일에러)부호연산시 int형으로 변환되면서 오류가 남 
		int res3 =-b;
		System.out.println("res3 = "+res3);
		
	}

}
