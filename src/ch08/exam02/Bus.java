package ch08.exam02;
 
public class Bus implements Vehicle{ //Vehicle인터페이스로 사용가능한 Bus클래스

	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
	
}
