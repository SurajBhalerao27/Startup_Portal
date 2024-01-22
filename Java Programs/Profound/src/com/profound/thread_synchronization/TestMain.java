
// Write a java program to print multiplication table of 6 and 7 using muti-threading and synchronization keayword
package com.profound.thread_synchronization;

public class TestMain {

	public static void main(String[] args) {
		Table t = new Table();
		First f = new First(t);
//		First f1 = new First(t);   // if we created another obj of same class then JVM run first and then second and again second then first
		Second s = new Second(t);
//		Second s2 = new Second(t);

		f.start();
//		f1.start();
		s.start();
//		s2.start();
	}

}
