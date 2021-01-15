package ch05.exam02;

public class ArrayInArrayExample {

	public static void main(String[] args) {
		
		int[][] mathScore = new int[2][3]; //2*3행렬 선언
		for (int i = 0; i < mathScore.length; i++) {
			for (int j = 0; j < mathScore.length; j++) {
				System.out.println("mathScore["+i+"]["+j+"]= "+mathScore[i][j]);
			}
			
		}//행렬에 값을 입력하지 않아 초기값 0이 출력
		System.out.println();
		
		
		int[][] englishScore = new int[2][]; //2차원 행렬 선언
		englishScore[0] = new int[2]; //0행에 2개의 열 생성
		englishScore[1] = new int[3]; //1행에 3개의 열 생성

		for (int i = 0; i < englishScore.length; i++) {
			for (int j = 0; j < englishScore.length; j++) {
				System.out.println("englishScore["+i+"]["+j+"]= "+englishScore[i][j]);
			}
		} //행렬에 값을 입력하지 않아 초기값 0이 출력
		System.out.println();
		
		
		int[][] javaScore = {{95,80},{92,96,80}};
		for (int i = 0; i < javaScore.length; i++) {
			for (int j = 0; j < javaScore.length; j++) {
				System.out.println("javaScore["+i+"]["+j+"]= "+javaScore[i][j]);
			}
		}
		
		
	}

}
