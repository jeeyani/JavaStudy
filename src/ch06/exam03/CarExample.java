package ch06.exam03;

public class CarExample {

	public static void main(String[] args) {

		Car c1 = new Car();
		System.out.println("c1제작회사: " + c1.company);
		System.out.println();
		
		Car c2 = new Car("자가용");
		System.out.println("c2제작회사: " + c2.company);
		System.out.println("c2모델명: " + c2.model);
		System.out.println();
		
		Car c3 = new Car("자가용","빨강");
		System.out.println("c3제작회사: " + c3.company);
		System.out.println("c3모델명: " + c3.model);
		System.out.println("c3색상: " + c3.color);
		System.out.println();
		
		Car c4 = new Car("택시","검정",200);
		System.out.println("c4제작회사: " + c4.company);
		System.out.println("c4모델명: " + c4.model);
		System.out.println("c4색상: " + c4.color);
		System.out.println("c4속도: " + c4.maxSpeed);
		System.out.println();
	}

}
