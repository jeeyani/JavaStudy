package ch11;

public class Key {

	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	//hashcode를 재정의 하지 않는 class
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
				//필드값이 같으면 true를 리턴
			}
		}
		return false;
	}
	
	//hashcode를 재정의한다면
	@Override
	public int hashCode() {
		
		return number;
	}
}
