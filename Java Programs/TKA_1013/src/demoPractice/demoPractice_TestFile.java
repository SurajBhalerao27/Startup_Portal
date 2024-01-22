package demoPractice;

public class demoPractice_TestFile {

	public static void main(String[] args) {
		Employee emp = new Employee();
		int aaa = emp.eid = 101;
		String bbb = emp.fname = "Suraj";
		String ccc = emp.lname = "Bhalerao";
		char ddd = emp.gender = 'M';
		String eee = emp.doj = "01-01-2024";
		int fff = emp.age = 20;
		String jjj = emp.Dream_Company = "Infosys, IBM, TCS";
		double ggg = emp.salary = 60000.00d;
		String hhh = emp.role = "Software Engineer";
		String iii= emp.mobile_no = "9730922327";

		System.out.println("Employee's Id : "+ aaa);
		System.out.println("First Name : " + bbb);
		System.out.println("Last Name : " + ccc);
		System.out.println("Gender : " + ddd);
		System.out.println("Date Of Joining : " + eee);
		System.out.println("Age : "+fff);
		System.out.println("Dream Companies are : "+jjj);
		System.out.println("Salary :"+ggg);
		System.out.println("Role : "+hhh);
		System.out.println("Mobile Number : " + iii);
		System.out.println();

		Cal cal = new Cal();
		int a = cal.add(40, 20);
		int b = cal.mul(40, 20);
		int c = cal.div(40, 20);
		int d = cal.sub(40, 20);

		System.out.println("Addition: "+a);
		System.out.println("Multiplication: "+b);
		System.out.println("Division: "+c);
		System.out.println("Substraction: "+d);
		System.out.println();

		SimpleInterest ob = new SimpleInterest();

		float res = ob.cal_si(105800, 10, 2.5f);
		System.out.println("Simple Interest is : " + res);
		System.out.println();
	}

}
