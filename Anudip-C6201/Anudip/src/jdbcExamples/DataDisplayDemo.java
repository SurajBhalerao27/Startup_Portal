package jdbcExamples;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DataDisplayDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip?user=root&password=root");
//			String url = "jdbc:mysql://anudip/3306?user=root&password=root";

			String sql = "select * from employee_honda where id=?";

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id: ");
			int id = sc.nextInt();

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
//			int i = ps.executeUpdate();
			if (rs.next()) {
				System.out.println("Data Found!");
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Designation : " + rs.getString(3));
			} else {
				System.out.println("Sorry! No such data found with ID:'" + id + "'");
			}
			ps.close();
			con.close();
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
