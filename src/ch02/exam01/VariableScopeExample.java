package ch02.exam01;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 5;
		System.out.println(v1);
		//System.out.println(v2); //변수 선언전에 사용할 수 없음
		
		if(true) {
			int v2=10;
			System.out.println(v1);
			System.out.println(v2);
		}
		//int v3 = v1+v2+5;
		System.out.println(v1);
		//System.out.println(v2); //변수 선언 불록 외부에서는 사용할 수 없음
	}

}
