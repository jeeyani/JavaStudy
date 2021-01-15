package ch02.exam02;

public class EscapeExample {

	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업\t");
		System.out.print("행 단위 출력\n"); // println이 아님으로 "\n"을 이용하여 행 바꿔줌.
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\"입니다."); //""는 문자열을 나타냄으로 문자열안에 ""을 써주기 위해서 \"을 사용.
		System.out.println("봄\\여름\\가을\\겨울"); // \\역시 혼자만으로 문자열안에 나타날 수 없음으로 문자열 안에 써주기 위해서는 \\을 사용
	}

}
