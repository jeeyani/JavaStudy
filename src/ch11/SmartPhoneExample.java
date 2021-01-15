package ch11;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("구글", "안드로이드");
		
		String strObj = sp.toString(); //재정의된 toString호출
		System.out.println(strObj);
		
		System.out.println(sp);

	}

}
