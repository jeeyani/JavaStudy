package ch05.exam04_string;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		String old = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newA = old.replace("자바", "java");
		
		System.out.println(old);
		System.out.println(newA);
		
		
	}

}
