package com.app.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		String dateFormat = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		System.out.println("Today is: "+sdf.format(date));
	}
}
