//package practice;
//public class DemoVariable {
//	int a = 10;
//    static int b = 20;
//
//    public void m1() {
//        System.out.println("Value of a: " + a);
//        // Uncomment the line below to see the error for accessing static variable b from a non-static method
//         System.out.println("Value of b: " + b);
//    }
//
//    public static void m2() {
//        int a = 30;
//        int b = 40;
//        System.out.println("Value of a in m2: " + a);
//        System.out.println("Value of b in m2: " + b);
//    }
//
//    public static void main(String[] args) {
//        DemoVariable demo = new DemoVariable();
//        demo.m1();
//        m2();
//    }
//}

package practice;

public class DemoVariable {
	int a = 10;
	static int b = 20;

	public void m1() {
		System.out.println("Value of a: " + a);
		System.out.println("Value of b in m1: " + DemoVariable.b);
	}

	public static void m2() {
		int b = new DemoVariable().a;
		System.out.println("Value of a in m2: " + new DemoVariable().a);
		System.out.println("Value of b in m2: " + b);
	}

	public static void main(String[] args) {
		DemoVariable demo = new DemoVariable();
		demo.m1();
		m2();
	}
}
