// Write a java program to copy data from one file to another using byte stream classes
package com.profound.byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fin = new FileInputStream("E:\\Login And Pass.txt");
		FileOutputStream fout = new FileOutputStream("E:\\This_is_Copy.txt");
		int content;
		System.out.println("Reading...");
		while ((content = fin.read()) != -1) {
			fout.write(content);
//			System.out.print((char) content);
		}
		System.out.println("Copied...");
		fin.close();
		fout.close();

	}

}
