package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginValidator {
	public static void main(String[] args) {
		/*
		 * To check login what i do is first store the id and pass in the database and
		 * in the next line i give a prompt to user that are want to login to system and
		 * asked him for the id and pass and then base on that input i will check if the
		 * user given inputs are matches with my db data or not. and if i match then
		 * showing the output on console that u r logged in or else showing wrong input
		 */
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root", "root");
			Scanner scanner = new Scanner(System.in);
			// for login
			System.out.println("Wants to login ? ");
			System.out.println("Enter your register id: ");
			String check = scanner.next();
			loginChecker(check, con, scanner);
//
//			// for registration
//			System.out.println("Enter login id: ");
//			String id = scanner.next();
//			System.out.println("Enter password: ");
//			String pass = scanner.next();
//
//			String sql = "insert into login_validator values ('" + id + "','" + pass + "')";
//			Statement st = con.createStatement();
//			int res = st.executeUpdate(sql);
//			if (res > 0)
//				System.out.println("Success !");
//			else
//				System.err.println("Error");

//			st.close();
			con.close();
			scanner.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private static void loginChecker(String check, Connection con, Scanner scanner) throws SQLException {
		String sql = "SELECT id FROM login_validator WHERE id=?";
		try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			preparedStatement.setString(1, check);

			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				if (resultSet.next()) {
					System.out.println("You are logged in successfully");
				} else {
					System.err.println("Login failed.\n\n Do you want to register? (yes/no)");
					String response = scanner.next();
					if ("yes".equalsIgnoreCase(response)) {
						registerUser(con, scanner);
					}
				}
			}
		}
	}

	private static void registerUser(Connection con, Scanner scanner) throws SQLException {
		System.out.println("Enter login id: ");
		String id = scanner.next();
		System.out.println("Enter password: ");
		String pass = scanner.next();

		String sql = "INSERT INTO login_validator (id, pass) VALUES (?, ?)";
		try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pass);

			int res = preparedStatement.executeUpdate();
			if (res > 0)
				System.out.println("Registration successful!");
			else
				System.err.println("Error in registration");
		}
	}

}
