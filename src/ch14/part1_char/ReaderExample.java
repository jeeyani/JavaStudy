package ch14.part1_char;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		
		try {
			
			Reader reader = new FileReader("C:/HomeWork/test1.txt");
			
			while(true) {
				int data = reader.read(); //read는 int형으로 리턴~
				if(data == -1) { //더 이상 읽은 것이 없을 때는 -1를 반환함
					break;
				}
				System.out.println((char)data);
			}
			
			reader.close();
			
			
		} catch (Exception e) {}
		
	}

}
