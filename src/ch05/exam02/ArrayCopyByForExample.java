package ch05.exam02;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for (int i = 0; i < oldIntArray.length; i++) { //old배열을 new배열에 복사
			newIntArray[i] = oldIntArray[i];
		} 
		
		for (int i = 0; i < newIntArray.length; i++) { //복사된 값 제외 나머지는 기본값 0으로 출력
			System.out.print(newIntArray[i]+", ");
		}

	}

}
