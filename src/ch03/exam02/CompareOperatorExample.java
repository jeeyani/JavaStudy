package ch03.exam02;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 =10;
		boolean res1 = (num1==num2);
		boolean res2 = (num1 !=num2);
		boolean res3 = (num1<=num2);
		System.out.println("res1= "+res1);
		System.out.println("res2= "+res2);
		System.out.println("res3= "+res3);
	
		char c1 ='A'; //65
		char c2 = 'B'; //66
		boolean res4 = (c1<c2); //int타입으로 변환되어 비교함
		System.out.println("res4= "+res4);
		
		
		
	}

}
