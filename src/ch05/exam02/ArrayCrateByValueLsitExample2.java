package ch05.exam02;

public class ArrayCrateByValueLsitExample2 {

	//메인 메소드
	public static void main(String[] args) {
		
		int[] score;
		score = new int[] {83,90,87};
		
		int sum1=0;
		for (int i = 0; i < score.length; i++) {
			sum1 +=score[i];
		}
		
		System.out.println("총합: "+sum1);
		
		int sum2 =add(new int[] {83,90,87}); //add메소드 호출
		System.out.println("총합: "+sum2);
		System.out.println();

	}
	
	//배열을 추가하는 add메소드
	public static int add(int[] score) { //int형을 리턴함으로 void가 아닌 int형
		int sum =0;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		return sum;
	}

}
