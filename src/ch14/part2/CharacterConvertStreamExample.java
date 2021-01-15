package ch14.part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		

	}
	
	public static void write(String str) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/HomeWork/test_1.txt"); //출력
			Writer writer = new OutputStreamWriter(fos);
			writer.write(str); //보조 스트림을 이용해서 문자를 출력
			writer.flush();
			writer.close();
		} catch (Exception e) {}
		
	}
	
	public static String read() throws Exception {
	
			FileInputStream fis = new FileInputStream("C:/HomeWork/test_1.txt");
			Reader reader = new InputStreamReader(fis);
			
			char[] buffer = new char[100];
			int CharNum = reader.read(buffer);
			reader.close();
			String data = new String(buffer,0,CharNum); //buffer에서 읽은 수 만큼 문자열로 변환
			return data;

	}

}
