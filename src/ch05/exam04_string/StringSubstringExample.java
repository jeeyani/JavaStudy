package ch05.exam04_string;

import java.awt.Frame;

public class StringSubstringExample {

	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		
		String firtNum = ssn.substring(0,6); //0시작부터 6번째 전까지 자르기
		System.out.println(firtNum);
		
		String secdNum = ssn.substring(7); //7번째 전까지 자르기
		System.out.println(secdNum);
		
	}

}
