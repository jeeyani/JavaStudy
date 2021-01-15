package ch03.exam02;

public class DenylogicOperatorExample {

	public static void main(String[] args) {
		boolean play =true;
		System.out.println(play);
		
		play =!play; //거짓대입
		System.out.println(play);
		
		play =!play; //참대입
		System.out.println(play);
	}

}
