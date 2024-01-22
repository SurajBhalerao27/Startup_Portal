// Write a java program to copy data from one file to another in UPPER Case using Buffer input stream class and Buffered Output Stream Class.
package com.profound.buffered_stream;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		String soursefile = "E:\\Login And Pass.txt";
		String destinationfile = "E:\\new_Copied_Upper.txt";

		try (FileInputStream fin = new FileInputStream(soursefile);
				BufferedInputStream bin = new BufferedInputStream(fin);

				FileOutputStream fout = new FileOutputStream(destinationfile);
				BufferedOutputStream bout = new BufferedOutputStream(fout)) {
			int content;
			while ((content = bin.read()) != -1) {
				char ch = (char) content;
				char upper = Character.toUpperCase(ch);
				bout.write((int) upper);
			}

			System.out.println("Successfull !!!");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
