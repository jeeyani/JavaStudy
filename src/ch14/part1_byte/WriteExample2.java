package ch14.part1_byte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {
		
		try {
			
			OutputStream os = new FileOutputStream("C:/HomeWork/test2.db");
			
			byte[] arr = {10,20,30};
			
			os.write(arr); //배열 내용을 한꺼번에 출력!
			
			
			os.flush(); 
			os.close();
			
			
		} catch (Exception e) {}
		
	}

}
