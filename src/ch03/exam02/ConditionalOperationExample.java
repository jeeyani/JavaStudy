package ch03.exam02;

public class ConditionalOperationExample {

	public static void main(String[] args) {
	
		int score = 85;
		char grade = (score>90)? 'A':((score>80)? 'B':'C'); //1. 80점 이상이면 B  2.90점 이상이면 A
		System.out.println(score+"점은  "+grade+"등급입니다.");
	}

}
