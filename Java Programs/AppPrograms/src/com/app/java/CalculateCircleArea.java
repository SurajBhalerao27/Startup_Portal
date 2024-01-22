package com.app.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCircleArea {
	public static void main(String[] args) {
		double radius = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter radius: ");
		try {
			radius = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		double areaOfCircle = Math.PI * radius * radius;
		System.out.printf("Area of circle is: %.2f", areaOfCircle);
	}
}
