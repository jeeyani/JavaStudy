package ch06.exam06.ex06;

public class CarExample {

	public static void main(String[] args) {
		
		Car c = new Car();
		//c.speed(-50); //prviate으로 선언되었기때문에 바로 필드에 접근 할 수 없음

		c.setSpeed(60);
		
		if(!c.isStop()) {
			c.setStop(true); //자동으로 멈추게 하기
		}
		
		System.out.println("현재속도: "+c.getSpeed());
	}

}
