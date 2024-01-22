package com.anudip.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String loginPage(Model model) {
		return "login";
	}

	@RequestMapping("/validateLogin")
	public String validateLogin(@RequestParam String check, Model model) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://your_database_url", "your_username",
				"your_password")) {
			String sql = "SELECT id FROM login_validator WHERE id=?";
			try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
				preparedStatement.setString(1, check);

				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					if (resultSet.next()) {
						model.addAttribute("message", "You are logged in successfully");
					} else {
						model.addAttribute("message", "Login failed. Do you want to register?");
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			model.addAttribute("message", "Error occurred");
		}

		return "result";
	}
}
