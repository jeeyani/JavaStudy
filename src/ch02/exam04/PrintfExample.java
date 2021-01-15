package ch02.exam04;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value); //여섯자리
		System.out.printf("상품의 가격:%-6d원\n",value);//여섯자리에 왼쪽정렬
		System.out.printf("상품의 가격:%06d원\n",value);//여섯자리 나머지공간 0
		
		double area = 3.14159*10*10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n",10,area); //정수형과 실수형이 나눠져서 출력
		
		String name = "박지연";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job);
		

	}

}
