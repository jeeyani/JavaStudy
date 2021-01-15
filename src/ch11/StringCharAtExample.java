package ch11;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn="950127-2000000";
		char sex = ssn.charAt(7); //문자만 출력하는 것임으로 char형에 대입!!
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;

		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
				
	
	
	}

}
