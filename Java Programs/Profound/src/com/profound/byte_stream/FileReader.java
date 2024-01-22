package com.profound.byte_stream;

import java.io.*;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fin = new FileInputStream("E:\\Login And Pass.txt");
		int content;
		while ((content = fin.read()) != -1) {

			System.out.print((char) content);
		}
		fin.close();
	}

}
