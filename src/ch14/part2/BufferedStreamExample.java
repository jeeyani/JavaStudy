package ch14.part2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamExample {

	public static void main(String[] args) throws Exception {
		
		
		//기본 스트림
		String orFile = BufferedStreamExample.class.getResource("snow.jpg").getPath();		
		String targetFile = "C:/HomeWork/snow.jpg";
		
		FileInputStream fis = new FileInputStream(orFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		
		long nonBuffer = copy(fis, fos);
		System.out.println("버퍼사용안할 때: "+nonBuffer);
		
		
		
		//보조 스트림 이용
		String orFile2 = BufferedStreamExample.class.getResource("snow2.jpg").getPath();		
		String targetFile2 = "C:/HomeWork/snow2.jpg";
		
		BufferedInputStream bis =new BufferedInputStream( new FileInputStream(orFile2));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFile2));
		
		long Buffer = copy(bis, bos);
		System.out.println("버퍼사용할 때: "+Buffer);
	}
	
	static int data =-1;
	
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long startTime = System.nanoTime();
		
		while(true) {
			
			int data = is.read();

			if(data == -1) {
				break;
			}
			os.write(data); 
		}
		os.flush();//전송
		
		long endTime = System.nanoTime();
		
		
		return (endTime - startTime);
	}
}
