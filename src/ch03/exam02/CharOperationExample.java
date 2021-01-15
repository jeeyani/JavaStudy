package ch03.exam02;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 ='A'+1; //유니코드 값 증가
		char c2 ='A';
		//char c3 = c2+1; //(컴파일에러)연산결과는 int형
		char c3 =(char)(c2+1);
		
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		System.out.println("c3= "+c3);
	}

}
