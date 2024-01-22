/* Write a java program to create p1 package, add interest class in p1 which find SI.
   create p2 package in which ad test main class which access interest class
*/

package com.profound.Package2;

import com.profound.Package.Interest;

public class Test_main {
	public static void main(String[] args) {
		Interest ob = new Interest(12000.0d, 4.0d, 10.0d);
		Interest ob1 = new Interest(35000.0d, 4.6d, 10.0d);
		Interest ob2 = new Interest(18900.0d, 2.2d, 10.0d);
		ob.show();
		ob1.show();
		ob2.show();
	}
}
