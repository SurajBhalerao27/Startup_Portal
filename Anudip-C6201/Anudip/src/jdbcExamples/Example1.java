package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Example1 {
	/*
	 * 1) import java.sql package 2) Load the driver 3) Create the connections 4)
	 * Query executed througth the help st/ prepared statement 5) if in case we are
	 * executing select type query, then mysql server will give some data in return,
	 * this data is recieved in the java program by resultSet object. 6)
	 */

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root", "root");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter designation: ");
			String desig = sc.next();
			
			String sql = "insert into employee_honda values (" + id + ",'" + name + "','" + desig + "')";

//			String sql2 = "insert into employee_honda values (13,'xyz','developer')";

			/*
			 * If exception occured in the above line then catch block will executed but if
			 * we enter only id and other left as blank then the else block will execute
			 */
			
			Statement st = con.createStatement();
			int response = st.executeUpdate(sql);
			if (response > 0)
				System.out.println("Data inserted successfully !");
			else
				System.out.println("Unsuccessful !!");
			st.close();
			con.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
