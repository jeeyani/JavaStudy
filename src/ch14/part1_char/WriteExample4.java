package ch14.part1_char;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) {
		
		try {
			
			Writer writer = new FileWriter("C:/HomeWork/test4.txt");
			
			String arr = "ABC"; //문자열 출력하기!
			
			writer.write(arr);
				
			
			writer.flush(); // 출력하고자 할때는, 한꺼번에 모아서 출력을 해줘야한다!!!
			writer.close();
			
			
		} catch (Exception e) {}
		
	}

}
