package practice;

class Demo {
	class InnerDemo {
		int a = 50, b = 20;

		InnerDemo() {
			System.out.println(a + b);
		}
	}

	{
		int a = 44, b = 85;
		System.out.println(a + b);
	}
}

public class InnerClass {
	static int cal() {
		return 5 + 10;
	}

	public static void main(String[] args) {
		System.out.println(InnerClass.cal());
		Demo demo = new Demo();
		Demo.InnerDemo innerDemo = demo.new InnerDemo();
	}
}
