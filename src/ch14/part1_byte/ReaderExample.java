package ch14.part1_byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderExample {

	public static void main(String[] args) {
		
		try {
			
			InputStream is = new FileInputStream("C:/HomeWork/test1.db");
			
			while(true) {
				int data = is.read(); //read는 int형으로 리턴~
				if(data == -1) { //더 이상 읽은 것이 없을 때는 -1를 반환함
					break;
				}
				System.out.println(data);
			}
			
			is.close();
			
			
		} catch (Exception e) {}
		
	}

}
