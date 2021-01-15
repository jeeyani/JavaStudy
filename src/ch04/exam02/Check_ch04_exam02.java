package ch04.exam02;

import java.util.Scanner;

public class Check_ch04_exam02 {
	public static void main(String[] args) {
		
		//2번문제
		int sum=0;
		for (int i = 1; i <=100; i++) {
			
			
			if (i % 3 != 0) {
				continue;
			}
			sum += i;
		
			//if(i%3 ==0) {sum+=i;}  //이 방법도 가능
		}
		System.out.println("1부터 100까지 3의 배수의 총합: "+sum);
		
		
		
		//3번문제
		while(true) {
			int Dice1 = (int)(Math.random()*6)+1;
			int Dice2 = (int)(Math.random()*6)+1;
			
			System.out.println("("+Dice1+", "+Dice2+")");
			
			
			int res = Dice1+Dice2;
			if(res ==5) {break;}
		}
		System.out.println("주사위 게임이 종료되었습니다.");
		
		
		//4번문제
		for (int x = 1; x <=10; x++) {
			for (int y = 1; y <=10; y++) {
				if((4*x+5*y == 60)) {
					System.out.println("("+x+", "+y+")");
				}
			}
		}
		
		
		//5번문제
		for (int i = 1; i < 5; i++) {
			
			for (int j = 0; j <i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//6번문제
		for (int i = 1; i <=4 ; i++) { //총 4줄을 생성
			for (int j = 4; j > i ; j--) { //오른쪽 열로 " "생성 첫째줄에는 공백은 세개, 둘째둘에는 공백을 2개..
				System.out.print(" ");
			}
			for (int j = 0; j <i; j++) { //이후 별찍는 갯수를 지정 i를 기준으로 첫째줄에 별한개, 둘째줄에 별두개...
				System.out.print("*");
				
			}
			System.out.println(); //맨 마지막에 줄바꿈실행
		}
		
		//7번
		boolean run = true;
		int balance =0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");
		
			String num;
			num = scanner.nextLine();
		
			if (num.equals("1")) {
		
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
		
			} else if (num.equals("2")) {
		
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
		
			} else if (num.equals("3")) {
				System.out.print("잔고> ");
				System.out.println(balance);
			} else if (num.equals("4")) {
				break;
			}
		
		}
		
		System.out.println("프로그램종료");
		
		
		
	}
}
