package ch14.part1_char;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample2 {

	public static void main(String[] args) {
		
		try {
			
			Reader reader = new FileReader("C:/HomeWork/test2.txt");
			
			char[] arr = new char[100];
			
			while(true) {
				int data = reader.read(arr);
				if(data == -1) { //더 이상 읽은 것이 없을 때는 -1를 반환함
					break;
				}
				for (int i = 0; i < data; i++) {
					System.out.println(arr[i]);
				}
			}
			
			reader.close();
			
			
		} catch (Exception e) {}
		
	}

}
