package ch10;

import ch06.exam06.ex02.pack02.C;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class claxx = Class.forName("java.lang.String2");
	}
}
