package ch11;

import java.awt.Frame;

public class StringSToLowerUpperExample {

	public static void main(String[] args) {
		
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String LowerStr1 = str1.toLowerCase();
		String LowerStr2 = str2.toLowerCase();
		System.out.println(LowerStr1.equals(LowerStr2));
		System.out.println(str1.equalsIgnoreCase(str2)); //대소문자를 구별하지 않음
		
	}

}
