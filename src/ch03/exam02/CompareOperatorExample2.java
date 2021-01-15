package ch03.exam02;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 =1;
		double v3 =1.0;
		System.out.println(v2==v3);
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4==v5); //float의 근사값은 0.1보단 큰값!!
		System.out.println((float)v4==v5); //강제형변환을 통해 비교
		
		
	}

}
