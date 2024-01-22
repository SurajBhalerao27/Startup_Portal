package jdk8910Features;

public class VarKeywordDemo {
//	var id = 16; // here i get an error

	/*
	 * var keyword is used to create local variable. We can store any type of data
	 * in va type variable, as seen below;
	 * 
	 * Rules : 1) We cannot make instance variable using var keyword. 2) We can use
	 * it only within a local scope. 3) We cannot use var to declare return type or
	 * parameters of a method. 4) If we want to change the value of the vat variable
	 * then we should change with same type and not other Ex. if var num = 15; is
	 * firstly a int and then we cannot changes to duble like var num = 15.5; 5)
	 * Variables with type vat have to be initialized while creating.
	 */

//	public void display(var i, var j) {63
//		
//	}

	public void display() {
		System.out.println("This is display method...");
	}

	public static void main(String[] args) {
		int a = 15;
		var num = 15;
		var fresher = true;
		var name = "Suraj";
		var sign = '$';
		var marks = 90.98;

//		num = "Bhalerao"; // We cannot changes the type of the data once before declared.
		num = 40; // We can only changes the value of data.

//		var a; // We cannot remains it by only initialized it.

		var obj = new VarKeywordDemo(); // This is an example where we give ref to the constructor.
		obj.display();
	}

}
