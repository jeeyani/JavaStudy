package ch04.exam01;

import java.util.Random;

public class IfDiceExample {

	public static void main(String[] args) {
		int num =(int)(Math.random()*6)+1; //1~6사이의 수를 랜덤으로 설정
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		
		} else if (num==2) {
			System.out.println("1번이 나왔습니다.");
		} 
		else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		}
		else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		}
		else if (num==5) {
			System.out.println("5번이 나왔습니다.");
		
		} else {
			System.out.println("6번이 나왔습니다.");
		}

		


	}
}
