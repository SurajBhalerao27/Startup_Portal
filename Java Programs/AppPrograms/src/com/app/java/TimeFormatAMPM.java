package com.app.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormatAMPM {
	public static void main(String[] args) {
		Date date = new Date();
		String timeFormat = "HH:mm:ss a";
		SimpleDateFormat sdf = new SimpleDateFormat(timeFormat);
		System.out.println(sdf.format(date));
	}
}
