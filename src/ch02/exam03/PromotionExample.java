package ch02.exam03;

public class PromotionExample {

	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue =10;
		int intvalue = byteValue; // 바이트보다 int형의 크기가 큼으로 자동형변환
		System.out.println("intValue: " + intvalue );
		
		char charValue = '가';
		intvalue = charValue; //char형보다 int형의 크기가 큼으로 int형으로 자동형변환 되면서 '가'의 유니코드가 출력됨
		System.out.println("가의 유니코드: " + intvalue );
		
		intvalue = 50;
		long longValue = intvalue; //int형보다 long형의 크기가 큼으로 long형으로 자동형변환
		System.out.println("longValue: " + longValue );
		
		longValue = 100;
		float floatValue = longValue;//long형보다 float형의 크기가 큼으로 float형으로 자동형변환
		System.out.println("floatValue: " +floatValue );
		
		floatValue =100.5f; //float형보다 double형의 크기가 큼으로 double형으로 자동형변환
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue );

	}

}
