package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/anudip?user=root&password=root";
			Connection con = DriverManager.getConnection(url);
			String sql = "insert into employee_honda values (?,?,?)";
			String sql2= "delete from employee_honda where id=(?)";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter name: ");
			String name = sc.nextLine();

			System.out.println("Enter designation: ");
			String desig = sc.nextLine();

			PreparedStatement ps = con.prepareStatement(sql);
			PreparedStatement ps2 = con.prepareStatement(sql2);
//			ps.setInt(1, id);
//			ps.setString(2, name);
//			ps.setString(3, desig);
// 
			ps2.setInt(1, id);
			
			int i = ps2.executeUpdate();
			if (i > 0)
				System.out.println("Successfull");
			else
				System.out.println("Un-Successfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
