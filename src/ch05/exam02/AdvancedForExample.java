package ch05.exam02;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum =0;
		for (int var:scores) {
			sum+=var;
		}
		System.out.println("총합: "+sum);
		System.out.println("평균: "+(double)sum/scores.length);
	}

}
