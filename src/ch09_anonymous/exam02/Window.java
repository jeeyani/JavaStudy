package ch09_anonymous.exam02;

import javax.swing.*;

public class Window {

	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickLinstener listener = new Button.OnClickLinstener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
			
		}
	};
	
	Window(){
		btn1.setOnClickListener(listener);
		btn2.setOnClickListener(new Button.OnClickLinstener() {
			
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다");
				
			}
		});
	}
	

}
