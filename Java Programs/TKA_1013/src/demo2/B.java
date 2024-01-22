package demo2;

public class B {
	int learYearOrNot(int yr) {
		if ((yr % 4 == 0) || (yr % 100 == 0 && yr % 400 == 0)) {
			System.out.println(yr + " This is a Leap Year");
		} else {
			System.out.println(yr + " This is not leap Year");
		}
		return yr;
	}

}
