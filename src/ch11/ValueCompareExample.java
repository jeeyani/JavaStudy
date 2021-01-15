package ch11;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("-128 ~ 127 초과값일 경우");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2);
		System.out.println(obj1.intValue() == obj2.intValue()); //언박싱 후
		System.out.println(obj1.equals(obj2));
		System.out.println();
		
		
		System.out.println("-128 ~ 127 범위의 값 경우");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.intValue() == obj4.intValue());
		System.out.println(obj3.equals(obj4));
		System.out.println();
	}

}
