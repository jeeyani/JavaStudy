package ch06.exam04;

public class CarExample {

	public static void main(String[] args) {
		
		Car c =new Car();
		
		c.setGas(5);
		
		boolean gasState = c.isLeftGas();
		
		if(gasState) {
			System.out.println("출발합니다");
			c.run();
		}
		
		if(c.isLeftGas()) {
			System.out.println("가스를 주입할 필요가 없습니다.");
		}else {
			System.out.println("가스를 주입하세요");
			
		}
		
	}
	
}
