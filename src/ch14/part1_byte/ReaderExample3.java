package ch14.part1_byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ReaderExample3 {

	public static void main(String[] args) {
		
		try {
			
			InputStream is = new FileInputStream("C:/HomeWork/test3.db");
			
			byte[] arr = new byte[5];
			
			int data = is.read(arr, 2, 3); //arr[2]부터 바이트 3개 가져오기
			if (data != -1) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
			}

			is.close();
			
			
		} catch (Exception e) {}
		
	}

}
