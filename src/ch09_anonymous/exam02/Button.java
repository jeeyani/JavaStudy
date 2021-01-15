package ch09_anonymous.exam02;

public class Button {
	
	public static interface OnClickLinstener{
		//button객체를 안만들고 밖에서 다양하게 사용하기 위함이다
		void onClick();
	}
	
	private OnClickLinstener listener;
	
	
	public void setOnClickListener(OnClickLinstener listener) {
		this.listener = listener;
	}
	
	
	public void touch(){
		//다형성 -> 버튼마다 실행결과는 다 다르게 해야함
		listener.onClick(); // listener를 통해 onClick()호출
	}
	


	

}
