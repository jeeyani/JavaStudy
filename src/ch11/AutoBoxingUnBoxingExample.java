package ch11;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//자동 박싱
		Integer obj =100;
		System.out.println(obj.intValue());

		//자동 언박싱
		int var = obj;
		System.out.println(var);
		
		//자동언박싱
		int res = obj +100;
		System.out.println(res);
		
	}

}
