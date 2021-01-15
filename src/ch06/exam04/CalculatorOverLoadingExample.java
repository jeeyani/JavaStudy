package ch06.exam04;

public class CalculatorOverLoadingExample {

	public static void main(String[] args) {
		
		CalculatorOverLoading c =new CalculatorOverLoading();
		
		double res1 = c.resRetangle(10);
		double res2 =c.resRetangle(10, 20);
		
		System.out.println(res1);
		System.out.println(res2);
		
	}

}
