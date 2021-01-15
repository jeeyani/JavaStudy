package ch04.exam02;

public class BreakOutterExample {

	public static void main(String[] args) {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) { //바깥쪽 for문에 라벨Outter을 붙여줌
			for (char lower = 'a'; lower <='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if (lower=='g') {
					break Outter; //바깥for문 Outter를 종료시켜 for전체 다 종료하기!!
				}
			}
			
		}
	System.out.println("프로그램 종료");
	}
	
	

}
