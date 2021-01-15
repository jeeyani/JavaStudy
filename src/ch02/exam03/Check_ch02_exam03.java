package ch02.exam03;

/* p.87 확인문제 */
public class Check_ch02_exam03 {

	public static void main(String[] args) {
		
		//5번문제
		char c1 ='a';
		int c2 =c1+1;
		System.out.println((char)c2);
		
		//6번문제
		int x =5;
		int y =2;
		int res = x/y; //정수끼리의 계산임으로 결과는 2;
		System.out.println(res);
		
		//7번문제
		int x2 =5;
		int y2 =2;
		double res2 = (double)x2/y2; //실수형으로 강제형변환을 해주어 실수값이 나오도록함
		System.out.println(res2);
		
		//8번문제
		double v1=3.5;
		double v2 = 2.7;
		int res3 = (int)(v1/v2); //실수계산이후 나온 결과값을 정수형으로 강제형변환
		System.out.println(res3); 

		//9번문제
		long va1 = 2L;
		float va2 = 1.8f;
		double va3 = 2.5;
		String va4 = "3.9";
		int res4 = (int) va1 +(int)(va2+va3)+(int)Double.parseDouble(va4);
		//int형 결과값에 넣어야함으로 우선 모든 변수는 int형으로 강제형변환이 필요하다.
		//실수형은 실수계산이후 변환을 해주고, 문자열은 숫자형으로 변환뒤 정수형으로 변환한다.
		
		//10번문제
		String st1 = 2+3+"";
		String st2 = 2+""+3;
		String st3 = ""+2+3;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		
		//11번문제
		byte value = Byte.parseByte("10");
		int value2 = Integer.parseInt("1000");
		float value3 = Float.parseFloat("20.5");
		double value4 = Double.parseDouble("3.14159");
	
	
		
	}

}
