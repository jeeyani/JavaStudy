package ch02.exam04;

import java.util.Scanner; //scanner가 java.util패키지에 있다는 것을 컴파일러에게 알려줌

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String  inData;
		
		while(true) {
			inData = scanner.nextLine(); //scanner를 이용하여 indata에 값을 입력받음
			System.out.println("입력된 문자열: \""+inData+"\"");
			
			if (inData.equals("q")) { //문자열 비교시 equal 이용!!
				break;
			} //만약 입력된 데이터가 q이면 무한루프종료
			
		}//무한루프
		
		System.out.println("종료");
	}

}
