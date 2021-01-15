package ch07.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
	
	DmbCellPhone dcp = new DmbCellPhone("아이폰", "검정", 10);
	
	System.out.println("모델: "+dcp.model);
	System.out.println("색상: "+dcp.color);
	System.out.println("채널: "+dcp.channel);
	
	dcp.powerOn();
	dcp.bell();
	dcp.sendVoice("여보세요");
	dcp.receiveVoice("안녕하세요 저는 박지연입니다");
	dcp.sendVoice("아~ 반갑습니다");
	dcp.hangUp();
	
	dcp.turnOnDmb();
	dcp.changeChannelDmb(12);
	dcp.turnOffDmb();
			
	
	}

}
