package ch14.part1_byte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			
			OutputStream os = new FileOutputStream("C:/HomeWork/test1.db");
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
				
			
			os.flush(); // 출력하고자 할때는, 한꺼번에 모아서 출력을 해줘야한다!!!
			os.close();
			
			
		} catch (Exception e) {}
		
	}

}
