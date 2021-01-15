package ch02.exam02;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		//float v1 = 3.14; // (컴파일 에러) 기본적으로 double형으로 인식하기 때문에 float형으로 사용하기 위해서는 값뒤에 f를 붙여줌
		float v2 = 3.14f;
		double v3 =3.14;
		
		//정밀도 테스트
		float v4 = 0.1234567890123456789f;
		double v5 = 0.1234567890123456789;
		
		System.out.println("v2: "+v2);
		System.out.println("v3: "+v3);
		System.out.println("v4: "+v4); //v4: 0.12345679
		System.out.println("v5: "+v5); // v5: 0.12345678901234568 
		// float형보다 double형이 소수점 이하 자리 숫자를 더 나타낼 수 있음으로, float형보다 double형이 더 정밀하다고 할 수 있다!!
		//참고) float/double의 소수점 이하 자릿수는 시스템환경에 따라 다름
		
		//e 사용하기
		double v6 =3e6;
		float v7 = 3e6f; //값 옆에 f 잊지말기!!!
		double v8 = 2e-5;
		System.out.println("v6: "+v6);
		System.out.println("v7: "+v7);
		System.out.println("v8: "+v8);
		

	}

}
