package practice;

public class MaximumOfTwo {
	int a,b;
	void set(int a1, int b1){
		a=a1;
		b=b1;
	}
	int max() {
		if (a>b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		MaximumOfTwo ob = new MaximumOfTwo();
		ob.set(50,12);
		System.out.println(ob.max());
	}

}
