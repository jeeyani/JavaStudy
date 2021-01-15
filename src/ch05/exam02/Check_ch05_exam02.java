package ch05.exam02;

import java.util.Scanner;

public class Check_ch05_exam02 {

	public static void main(String[] args) {
		
		//4번문제
		int max =0;
		int[] arr1 = {1,5,3,8,2};
		
		for (int i = 0; i < arr1.length; i++) {
			if(max<arr1[i]) { //인덱스 참고숫자가 초과됨
				max=arr1[i];
			}
		}
		
		System.out.println("최대값 : "+max);
		
		
		//5번문제
		int[][] arr2 = { //3행의 차원
				{95,86},
				{83,92,96},
				{78,83,93,87,88},
		};
		
		int sum =0;
		double avg =0.0;
		
		int num=0;
		for (int i = 0; i < arr2.length; i++) {
			 for (int j = 0; j < arr2[i].length; j++) {
				sum+=arr2[i][j];
				num++;
			}
		}
		
		avg = (double)sum/num;
		
		System.out.println("총합: "+sum);
		System.out.println("평균: "+avg);
		
		
		//6번문제
		boolean run = true;
		int studentNum = 0;
		int[] scores =null;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo ==1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores =new int[studentNum]; //배열의 길이를 정해줘야함!!!!
			}
			
			else if(selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("score["+i+"]> ");
					scores[i]=Integer.parseInt(scanner.nextLine());
				}
			}
			else if(selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("score["+i+"]> ");
					System.out.println(scores[i]);
				}
			}
			else if(selectNo == 4) {
				int max2=0;
				int sum2=0;
				for (int i = 0; i < scores.length; i++) {
					sum2+=scores[i];
					
					if(scores[i]>max) {
						max=scores[i];
					}
					
					
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+(double)sum2/scores.length);
			}
			else {break;
			}
		}
		
		System.out.println("프로그램종료");
		
		
		
	}
}
