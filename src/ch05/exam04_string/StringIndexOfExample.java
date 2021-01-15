package ch05.exam04_string;

public class StringIndexOfExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍"); //subject에서 프로그래밍이 시작하는 위치 번호를 저장
		System.out.println(location);

		if (subject.indexOf("자바") != -1) { //해당 문자가 들어 있다면
			System.out.println("자바와 관련 있는 책");
		} else {
			System.out.println("자바와 관련 없는 책");
		}

	}

}
