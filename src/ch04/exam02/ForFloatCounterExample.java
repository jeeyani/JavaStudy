package ch04.exam02;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		for (float x= 0.1f; x <= 1.0f; x+=0.1f) {
			System.out.println(x);
		}
			//0.1은 float형으로 정확하게 표현할 수 없기때문에, 실제 x에 더해지는 값은 0.1보다 약간 큼.
		}

}
