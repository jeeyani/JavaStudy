package ch14.part1_char;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		
		try {
			
			Writer writer = new FileWriter("C:/HomeWork/test1.txt");
			
			char a = 'A';
			char b = 'B';
			char c = 'C';
			
			writer.write(a);
			writer.write(b);
			writer.write(c);
				
			
			writer.flush(); // 출력하고자 할때는, 한꺼번에 모아서 출력을 해줘야한다!!!
			writer.close();
			
			
		} catch (Exception e) {}
		
	}

}
