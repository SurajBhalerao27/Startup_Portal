package com.app.java;

import java.util.Comparator;

public class QueueComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}

}
