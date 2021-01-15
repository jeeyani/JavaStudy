package ch02.exam02;

/* Long 타입 변수 */
public class LongExample {

	public static void main(String[] args) {
		long v1 = 10;
		long v2 = 20L;
		//long v3 = 1000000000; //int형 범위를 초과할 경우 L울 붙여 long형인 것을 표시해줌.
		long v3 = 1000000000L;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
	}

}
