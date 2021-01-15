package ch14.part1_char;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) {
		
		try {
			
			Writer writer = new FileWriter("C:/HomeWork/test3.txt");
			
			char[] arr = {'A','B','C','D','E'};
			
			writer.write(arr,1,3);
				
			
			writer.flush(); // 출력하고자 할때는, 한꺼번에 모아서 출력을 해줘야한다!!!
			writer.close();
			
			
		} catch (Exception e) {}
		
	}

}
