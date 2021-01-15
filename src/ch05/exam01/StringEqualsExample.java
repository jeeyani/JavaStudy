package ch05.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if (strVar1==strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
					
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음"); //equals을 사용하면  변수 안의 문자열 내용이 같은지를 비교함
		} 
		
		//String을 생성하는 또 다른 방법
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if (strVar3==strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
					
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음"); //equals을 사용하면  변수 안의 문자열 내용이 같은지를 비교함
		} 
	}

}
