package ch04.exam01;

public class IfElseIfEsleExample {

	public static void main(String[] args) {

		int score =75;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} 
		
		else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B입니다.");
		}
		
		else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
			
		}
		else { //90미만의 경우 실행
			System.out.println("점수가 70보다 작습니다.");
			System.out.println("등급은 D입니다.");
		}
		
	}

}
