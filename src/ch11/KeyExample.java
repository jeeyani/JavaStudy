package ch11;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
	
		HashMap<Key, String> hm = new HashMap<Key, String>();
		
		hm.put(new Key(1),"홍길동");
		
		String value = hm.get(new Key(1));
		System.out.println(value); 
		//hashcode를 재정의하지 않으면 입력받는 new key와 출력되는 new key는 다른 객체
		
	}

}
