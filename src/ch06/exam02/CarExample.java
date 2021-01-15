package ch06.exam02;


public class CarExample {

	public static void main(String[] args) {
		//객체 생성
				Car car1= new Car();
				
				System.out.println("제작회사: "+car1.company);
				System.out.println("모델명: "+car1.model);
				System.out.println("색깔: "+car1.color);
				System.out.println("최고속도: "+car1.maxSpeed);
				System.out.println("현재속도: "+car1.speed);
				
				car1.speed = 60;
				System.out.println("수정된 속도: "+car1.speed);

	}

}
