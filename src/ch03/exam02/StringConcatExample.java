package ch03.exam02;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 ="JDK"+6.0;
		String str2 = str1 +"특징";
		System.out.println(str2);
		
		String str3 ="JDK"+3+3.0; //("JDK"+3) 먼저 계산되어 문자열
		String str4 = 3+3.0+"JDK"; //( 3+3.0) 먼저 계산되어 숫자
		System.out.println(str3);
		System.out.println(str4);

	}

}
