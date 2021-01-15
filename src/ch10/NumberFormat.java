package ch10;

public class NumberFormat {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int var1 = Integer.parseInt(data1);
		int var2 = Integer.parseInt(data2); //문자열을 정수로 변환할 수 없음
		
		int res = var1 + var2;
		
		System.out.println(res);
	}

}
