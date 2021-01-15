package ch08.exam01;

public class Television implements RemoteControl{

	private int volume;
	
	//RemoteControl인터페이스에 있는 (추상)메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else{
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "+this.volume);
	}
	
	//인터페이스에 언급이 되어있지 않기 때문에 인터페이스를 통해 접근이 불가능 하다.
	public void setChannel(int no) {
		System.out.println(no + "채널로 변경합니다");
	}

}
