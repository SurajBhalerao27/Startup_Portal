package com.app.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfRectangle {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter length: ");
			int length = Integer.parseInt(reader.readLine());
			System.out.println("Enter width: ");
			int width = Integer.parseInt(reader.readLine());
			int areaOfRectangle = length * width;
			System.out.println("Area Of Rectangle: " + areaOfRectangle);
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Value!!!");
		} catch (IOException ioe) {
			System.err.println("Error !");
		}
	}
}
