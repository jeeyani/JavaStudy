package ch02.exam03;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue =(char) intValue; //int형을 char형으로 강제형 변환
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue; //long형을 int형으로 강제형변환
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue =(int) doubleValue; //double형을 int형으로 강제형변환
		System.out.println(intValue);
	}

}
