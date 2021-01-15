package ch07.exam01;

public class DmbCellPhone extends CellPhone { //CellPhone를 상속 받음

	//Field
	int channel;

	//Constructor

	DmbCellPhone(String model,String color,int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//Method
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 방송수신을 시작");
	}
	void changeChannelDmb(int channel) {
		System.out.println(channel+"번으로 바꿉니다");	
	}
	void turnOffDmb() {
		System.out.println("방송수신 종료");
	}
	
	
}
