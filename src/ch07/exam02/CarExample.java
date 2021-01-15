package ch07.exam02;

public class CarExample {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		for (int i = 1; i <=5; i++) {
			int problemLoc = mycar.run();
		
		
		switch (problemLoc) {
		case 1:
			System.out.println("앞왼쪽 한국타이어로 교체");
			mycar.FL = new HankookTire("앞왼쪽", 15);
			break;
			
		case 2:
			System.out.println("앞오른쪽 금호타이어로 교체");
			mycar.FR = new KumhoTire("앞오른쪽", 13);
			break;
			
		case 3:
			System.out.println("뒤왼쪽 한국타이어로 교체");
			mycar.BL = new HankookTire("뒤왼쪽", 14);
			break;
			
		case 4:
			System.out.println("뒤오른쪽 금호타이어로 교체");
			mycar.BR = new KumhoTire("뒤오른쪽", 17);
			break;

		
		}
		System.out.println("----------------------------");
	}

	}
}
