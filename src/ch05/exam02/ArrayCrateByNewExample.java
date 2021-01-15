package ch05.exam02;

public class ArrayCrateByNewExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) { //초기값 0 을 출력
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}

		//배열에 값 대입
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] =30;
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		double[] arr2 = new double[3];
		
		for (int i = 0; i < arr2.length; i++) { //초기값 0.0출력
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		//배열에 값 대입
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		
		
		
		String[] arr3 =new String[3];
		for (int i = 0; i < arr3.length; i++) {//초기값 null출력
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";	
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		
	}
	
	

}
