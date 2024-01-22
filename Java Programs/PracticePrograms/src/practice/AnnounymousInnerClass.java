package practice;

abstract class Shape {
	abstract void draw();
}

public class AnnounymousInnerClass {
	public static void main(String[] args) {
		Shape ans = new Shape() {
			@Override
			void draw() {
				// TODO Auto-generated method stub
				System.out.println("Drawing shape from annonymous class.");
			}
		};
		ans.draw();
	}
}
