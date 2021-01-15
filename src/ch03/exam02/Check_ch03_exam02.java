package ch03.exam02;

import java.util.Scanner;

public class Check_ch03_exam02 {

	public static void main(String[] args) {
		//4번문제
		int pencils = 534;
		int students = 30;
		
		//학생 1명이 가지는 연필 개수
		int res = pencils/students;
		System.out.println(res);
		
		//남은 연필 갯수
		int res2 = pencils%students;
		System.out.println(res2);
	
		

		//5문제
		int var1 = 5;
		int var2 =2;
		double var3 = (double)var1/var2;
		int var4 =(int)(var3*var2);
		System.out.println(var4);
		
		
		//6번문제
		int value = 356;
		System.out.println(value/100*100);
		
		//7번
		double var5 = 10;
		double var6 = var5/100;  // float형의 10f는 정확한 값이 아님으로 double형으로 변경함
		if (var6==0.1) {
			System.out.println("10%입니다.");
			
		} else {System.out.println("10%가 아닙니다.");}
		
		//8번
		int lengthTop =5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop+lengthBottom)*height;
		System.out.println(area);
		
		//9번
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		String num1 = scanner.nextLine();
		
		System.out.print("두 번째 수: ");
		String num2 = scanner.nextLine();
		
		double result = Double.parseDouble(num1)/Double.parseDouble(num2);
		
		if(Double.parseDouble(num2)==0 || Double.parseDouble(num2)==0.0) {
			System.out.println("결과: 무한대");
		} else {
			System.out.println("결과: "+result);
		}
		
		//10번문제
		int var_1 =10;
		int var_2 =3;
		int var_3 = 14;
		double var_4 = var_1 * var_1 * Double.parseDouble(var_2+"."+var_3); //3.14를 하나의 숫자로 변환
		System.out.println("원의 넓이: "+ var_4);
		
		//11번
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String name = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		String pw = scanner.nextLine();
		int passward = Integer.parseInt(pw);
		
		if(name.equals("java")) {
			if(passward==1234) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패:패스워드가 틀립니다.");
			}
		}
		else { //아이디가 java가 아닌 경우
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
			
		
		}
	

}
