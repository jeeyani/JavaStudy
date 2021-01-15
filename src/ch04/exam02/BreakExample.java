package ch04.exam02;

public class BreakExample {

	public static void main(String[] args) {

		while (true) {
			int num = (int) (Math.random()*6)+1;
			System.out.println(num);
			if (num ==6) {
				break;
			}
			
		}
		System.out.println("종료");
	} //1~6까지 숫자를 랜던하게 루프를 돌려서 6이나오면 프로그램 종료

}
