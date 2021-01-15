package ch11;

public class MathExample {

	public static void main(String[] args) {
		
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println(v1);
		System.out.println(v2);
		
		//올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println(v3);
		System.out.println(v4);
		
		//버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println(v5);
		System.out.println(v6);
		
		//최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3,2.5);
		System.out.println(v7);
		System.out.println(v8);
		
		//최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3,2.5);
		System.out.println(v9);
		System.out.println(v10);
		
		//랜덤
		double v11 = Math.random();
		System.out.println(v11);
		
		//가까운 정수의 실수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println(v12);
		System.out.println(v13);
		
		//반올림값
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println(v14);
		System.out.println(v15);
		
		double v = 12.3456;
		double temp = v*100;
		long temp2 = Math.round(temp);
		double v16 = temp2/100.0;
		System.out.println(v16);

		
		
	}

}
