package com.app.java;

/*
 * to run - rigth click and goto run as and run with configuration and pass arguments in argument sec
 */
public class CommandLineTotalMarks {
	public static void main(String[] args) {
		System.out.println("Student name: " + args[0]);
		System.out.println("Student roll no: " + args[1]);
		double totalMarks = 0;
		for (int i = 2; i < args.length; i++) {
			totalMarks = totalMarks + Integer.parseInt(args[i]);
		}
		System.out.println("Total Marks of student- " + args[0] + " with roll no- " + args[1] + " is: " + totalMarks);
	}
}
