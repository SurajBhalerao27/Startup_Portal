package com.app.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		String name = "";
		while (!name.equals("stop")) {
			System.out.println("Enter Name: ");
			name = bfr.readLine();
			System.out.println("Your Name Is: " + name);
		}
		bfr.close();
		isr.close();
	}
}
