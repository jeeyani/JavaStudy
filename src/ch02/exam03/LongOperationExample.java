package ch02.exam03;

public class LongOperationExample {

	public static void main(String[] args) {
		byte v1 =10;
		int v2 =100;
		long v3 = 1000L;
		long res = v1+v2+v3; //선언한 변수들 중에서 long형이 제일 큰타입임으로 이로 변환해서 사용
		System.out.println(res);

	}

}
