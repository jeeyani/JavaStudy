package ch08.exam02.casting;
 
public class Bus implements Vehicle{ //Vehicle인터페이스로 사용가능한 Bus클래스

	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
	
	public void checkFare() {
		System.out.println("승용차요금을 체크합니다");
	}
	
}
