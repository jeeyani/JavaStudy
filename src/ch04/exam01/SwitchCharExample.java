package ch04.exam01;

public class SwitchCharExample {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A':
			
		case 'a':
			System.out.println("우수회원입니다.");
			break;
			
		case 'B':
	
		case 'b':
			System.out.println("일반회원입니다."); // grade는 b임으로  "일반회원입니다." 출력됨
			break;
		default:
			System.out.println("손님입니다.");
		}
	}

}

