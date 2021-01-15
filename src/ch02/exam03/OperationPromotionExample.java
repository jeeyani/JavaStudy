package ch02.exam03;

public class OperationPromotionExample {

	public static void main(String[] args) {

		byte bVa1 = 10;
		byte bVa2 =20;
		//byte res1 = bVa1 + bVa2; // (컴파일에러)int형으로 변환되기때문에 byte형으로 출력할 수 없음
		int res2 = bVa1 + bVa2;
		System.out.println(res2);
		
		char cVa1 = 'A';
		char cVa2 = 1;
		//char res2 = cVa1 + cVa2; //(컴파일에러)int형으로 변환되기때문에 char형으로 출력할 수 없음
		int res3 = cVa1 + cVa2;
		System.out.println("유니코드= " +res3);
		System.out.println("출력문자= "+(char)res3); //출력문자형태로 출력하기 위해 char형으로 강제형변환
		
		
		int inVa1 =10;
		int inVa2 =inVa1/4;
		System.out.println(inVa2); // 정수/정수 계산임으로 출력값도 결국 정수만 나옴
		
		int inVa3 =10;
		//int inVa4 =10/4.0; //(컴파일에러) int형에는 실수형을 삽입할 수 없음
		double dVa = inVa3/4.0;
		System.out.println(dVa);
		
		int x=1;
		int y=2;
		double res4 = (double)x/y; // 실수/정수 계산임으로 결과값은 실수가 나옴
 		System.out.println(res4);
		
		
		
	}

}
