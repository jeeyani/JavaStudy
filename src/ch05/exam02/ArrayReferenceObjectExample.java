package ch05.exam02;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] ="Java";
		strArray[2] =new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0]==strArray[2]); //번지수를 비교함
		System.out.println(strArray[0].equals(strArray[2])); //문자열을 비교함
	}

}
