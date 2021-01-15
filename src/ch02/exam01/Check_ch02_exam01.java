package ch02.exam01;

public class Check_ch02_exam01 {

	public static void main(String[] args) {
		//4번문제

		int v1 = 0;
		if(true) {
			int v2 =0;
			int v3 = 0; //초기값위치 수정
			if(true) {
			//int v3 = 0;
			v1 = 1;
			v2 =1;
			v3 =1;
		}
			v1=v2+v3; //두번째 if블록안에서 v3가 초기화되었음으로 오류남
		}
		System.out.println(v1);
	}

}
