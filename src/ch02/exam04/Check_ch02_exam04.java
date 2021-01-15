package ch02.exam04;

import java.util.Scanner;

public class Check_ch02_exam04 {
	public static void main(String[] args) {
		//1번문제
		String name ="김자바";
		int age = 25;
		String tel1 = "010", tel2="123" ,tel3="4567";
		System.out.println("이름: "+name);
		System.out.print("나이: "+age+"\n");
		System.out.printf("전화: %3s-%3s-%4s\n",tel1,tel2,tel3);
		//System.out.printf("전화: %1$s-%2$s-%3$s\n",tel1,tel2,tel3);
		
		//2번문제
		Scanner scanner = new Scanner(System.in); System.out.print("첫번째 수: ");
		String	strNum1=scanner.nextLine();
	  
		System.out.print("두번째 수: "); 
		String strNum2=scanner.nextLine();
	  
		int num1 = Integer.parseInt(strNum1); 
		int num2 = Integer.parseInt(strNum2);  
		int res = num1+num2; System.out.println("덧셈 결과: "+res);
		 
		
		//3번문제
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("1. 이름: ");
		String s1 =scanner2.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String s2 =scanner2.nextLine();
		
		System.out.print("3. 전화번호: ");
		String s3 =scanner2.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
}
