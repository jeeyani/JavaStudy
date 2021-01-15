package ch12;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true); //메인스레드 종료시 해당 스레드도 같이 종료
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
	}

}
