package ch08.exam01;

public class MyClass {
	
	RemoteControl r = new Television();
	
	
	//생성자
	MyClass(){}
	
	MyClass(RemoteControl r){
		this.r = r;
		r.turnOn();
		r.setVolume(5);
	}
	
	//메소드
	void methodA() {
		RemoteControl r = new Audio();
		r.turnOn();
		r.setVolume(5);
	}
	
	void methodB() {
		
		r.turnOn();
		r.setVolume(5);
	}

}
