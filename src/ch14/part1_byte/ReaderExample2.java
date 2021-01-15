package ch14.part1_byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderExample2 {

	public static void main(String[] args) {
		
		try {
			
			InputStream is = new FileInputStream("C:/HomeWork/test2.db");
			
			byte[] arr = new byte[100];
			while(true) {
				int data = is.read(arr); //배열에 입력된 값을 저장하고 data에 읽은 바이트의 수를 리턴
				if(data == -1) { //더 이상 읽은 것이 없을 때는 -1를 반환함
					break;
				}
				
				for (int i = 0; i < data; i++) {
					System.out.println(arr[i]);
				}
				
			}
			
			is.close();
			
			
		} catch (Exception e) {}
		
	}

}
