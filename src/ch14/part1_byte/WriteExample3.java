package ch14.part1_byte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) {
		
		try {
			
			OutputStream os = new FileOutputStream("C:/HomeWork/test3.db");
			
			byte[] arr = {10,20,30,40,50};
			
			os.write(arr,1,3); //배열의 인덱스 1번부터 3개를 출력
			
			
			os.flush(); 
			os.close();
			
			
		} catch (Exception e) {}
		
	}

}
