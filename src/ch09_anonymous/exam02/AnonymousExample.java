package ch09_anonymous.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anon = new Anonymous();
		
		anon.field.turnOn();
		
		anon.method1();
		
		anon.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("스마트티비를 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("스마트티비를 끕니다");
				
			}
		});

	}

}
