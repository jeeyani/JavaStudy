package ch05.exam02;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		int[] scores = {83,90,87};
		
		int sum =0;
		for (int i = 0; i < scores.length; i++) {
			sum+=scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double)sum/scores.length; //double형으로 강제형변환을 해줘야지 실수계산이 되어 소수점 자리까지 출력가능
		System.out.println("평균: "+avg);
		
	}

}
