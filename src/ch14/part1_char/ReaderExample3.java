package ch14.part1_char;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample3 {

	public static void main(String[] args) {

		try {

			Reader reader = new FileReader("C:/HomeWork/test3.txt");

			char[] arr = new char[5];

			int data = reader.read(arr, 2, 3);
			if (data != -1) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
			}

			reader.close();

		} catch (Exception e) {
		}

	}

}
