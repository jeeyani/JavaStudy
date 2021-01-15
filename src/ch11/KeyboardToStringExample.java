package ch11;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes); //입력받기
		
		//배열을 0부터  readByteNo-2길이까지 객체로 생성
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		
		
		
	}

}
