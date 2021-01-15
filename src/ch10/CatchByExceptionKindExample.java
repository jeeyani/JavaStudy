package ch10;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			int var1 = Integer.parseInt(data1);
			int var2 = Integer.parseInt(data2); //문자열을 정수로 변환할 수 없음
			
			int res = var1 + var2;
			
			System.out.println(res);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 불가");
		} finally {
			System.out.println("다시 실행하세요");
		}

	}

}
