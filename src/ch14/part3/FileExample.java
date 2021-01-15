package ch14.part3;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:/HomeWork/images");
		File file1 = new File("C:/HomeWork/file1.txt");
		File file2 = new File("C:/HomeWork/file2.txt");
		File file3 = new File("C:/HomeWork/file3.txt");
		
		if(dir.exists() == false) {dir.mkdirs();};
		if(file1.exists() == false) {file1.createNewFile();};
		if(file2.exists() == false) {file2.createNewFile();};
		if(file3.exists() == false) {file3.createNewFile();};
		
		File temp = new File("C:/HomeWork");
		File[] list = temp.listFiles();
		
		System.out.println("시간\t\t\t형태\t\t크기\t이름");
		System.out.println("--------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a HH:mm");
		for(File f : list) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t"+f.getName());
			} else {
				System.out.print("\t\t\t"+f.length()+"\t"+f.getName());
			}
			System.out.println();
		}

	}

}
