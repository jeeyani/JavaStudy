package ch02.exam03;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		// 문자열 ->숫자로 강제형 변환
		int v1 = Integer.parseInt("10");
		double v2 = Double.parseDouble("3.14");
		boolean v3 = Boolean.parseBoolean("true");
		
		System.out.println("v1 = "+v1);
		System.out.println("v2 = "+v2);
		System.out.println("v3 = "+v3);
		
		
		//숫자->문자열로 형변환
		String s1 = String.valueOf(10);
		String s2 = String.valueOf(3.14);
		String s3 = String.valueOf(true);
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("s3 = "+s3);
		

	}

}
