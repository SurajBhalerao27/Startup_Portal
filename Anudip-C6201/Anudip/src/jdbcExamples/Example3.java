package jdbcExamples;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Example3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/anudip?user=root&password=root";

			Connection con = DriverManager.getConnection(url);
			String sql = "select * from employee_honda";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				System.out.println("Id : " + rs.getInt(1));
				System.out.println("Name : " + rs.getString(2));
				System.out.println("Designation : " + rs.getString(3));
				System.out.println("----------------------------------");
			}
			rs.close();
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
