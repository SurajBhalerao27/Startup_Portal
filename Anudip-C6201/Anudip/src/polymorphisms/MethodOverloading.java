package polymorphisms;

/*
 * Method overloading is the process of making methods of the same name in the same class.
 * 
 * Usage :
 * It is used for increasing the readability of the program
 * 
 * How to do ???
 * 	1) Make same name method in the same class
 * 	2) Parameters should be different.
 * 	3) Parameters can be change in following way
 * 		a) Increase the number of parameter.	
 * 		b) Change the datatype parameter.
 * 		c) Change the sequence of parameter datatype.
 * 
 *  
 * */
class Calculator {
	public void add() {
		System.out.println("This is Method");
	}

	public void add(char c) {
		System.out.println("This is the addition of the char: " + (c + c));
	}

	public void add(int i, int j) {
		System.out.println("This is the addition of int: " + (i + j));
	}

	public void add(int x, double y) {
		System.out.println((x + y));
	}

	public void add(double y, int x) {
		System.out.println(y + x);
	}

	public void add(String s, String t) {
		System.out.println("This is the addition of String:  " + (s + t));
	}

	public void add(double d) {
		System.out.println("This is double addition:  " + (d + d));
	}

	public void add(float a, float b) {
		System.out.println("This is float addtion:  " + (a + b));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add('A');  //This print the ascii value for the addition of the  A+A = 130. 
		calculator.add(22.5);
		calculator.add(22.5f, 22.5f);
		calculator.add(22.5, 23);
		calculator.add(23, 22.5);
	}

}
