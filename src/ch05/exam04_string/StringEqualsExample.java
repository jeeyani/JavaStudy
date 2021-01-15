package ch05.exam04_string;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String str = new String("박지연");
		String str2 ="박지연";
				
		if (str == str2) {
			System.out.println("같은 객체를 참조");
		} else {System.out.println("다른 객체를 참조");}
		
		if (str.equals(str2)) {
			System.out.println("같은 문자열 가짐");
		} else {System.out.println("다른 문자열 가짐");}
	
	
	}

}
