package com.mini.ui;

import java.util.Arrays;
import java.util.Scanner;

import com.mini.daoimpl.EmployeeDaoImpl;
import com.mini.pojo.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("|---------------------------------------------|");
		System.out.println("|       Wel-Come To Social-Emp                |");
		System.out.println("|---------------------------------------------|");

		boolean exit = false, flag = false;
		int empId = 101;
		String empName;
		String designation;
		double salary;

		Employee e = null;
		EmployeeDaoImpl eimpl = new EmployeeDaoImpl();

		boolean loggedIn = false;
		while (!loggedIn) {
			System.out.print("Enter your username: ");
			String username = sc.nextLine();
			System.out.print("Enter your password: ");
			String password = sc.nextLine();

			if (isValidUser(username, password)) {
				loggedIn = true;
				System.out.println("Login successful!");
			} else {
				System.err.println("Invalid username or password. Please try again. ");
			}
		}

		while (exit == false) {

			System.out.println("|--------------------------------------------|");
			System.out.println("| Please enter the number as given in option |");
			System.out.println("|--------------------------------------------|");
			System.out.println("| 1  | Register employee                     |");
			System.out.println("| 2  | Show all employees                    |");
			System.out.println("| 3  | Search employee by ID                 |");
			System.out.println("| 4  | Update employee details               |");
			System.out.println("| 5  | Delete employee profile               |");
			System.out.println("| 6  | Search employee by name               |");
			System.out.println("| 0  | Exit                                  |");
			System.out.println("|--------------------------------------------|");

			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.print("Enter your name: ");
				empName = sc.nextLine();
				sc.nextLine();
				System.out.print("Enter your designation: ");
				designation = sc.nextLine();
				System.out.print("Enter your salary: ");
				salary = sc.nextDouble();
				sc.nextLine();

				empId += 1;

				e = new Employee(empId, empName, designation, salary);
				flag = eimpl.addEmployees(e);
				if (flag) {
					System.out.println("Employee Register Successfully !\n");
					System.out.println(Arrays.toString(eimpl.showAllEmployees()));
				} else {
					System.err.println(" Error While Registering Employee :(\n");
				}
				break;
			case 2:
				Employee[] employees = eimpl.showAllEmployees();
				if (employees.length == 0) {
					System.out.println("No employees registered yet.");
				} else {
					System.out.println("List of all employees:");
					for (Employee employee : employees) {
						if (employee != null) {
							System.out.println(employee);
						}
					}
				}
				break;
			case 3:
				System.out.println("Enter the id of employee to be searched");
				int id = sc.nextInt();
				sc.nextLine();
				e = eimpl.searchEmployeesById(id);

				if (e != null) {
					System.out.println("The employee found with given id: \n" + e);
				} else {
					System.err.println("Sorry we could not find any employee with this id !");
				}
				break;
			case 4:
				System.out.println("Enter the ID of the employee to update:");
				int idToUpdate = sc.nextInt();
				sc.nextLine();
				Employee updatedEmployee = eimpl.searchEmployeesById(idToUpdate);

				if (updatedEmployee != null) {
					System.out.println("What would you like to update for employee " + " (ID: "
							+ updatedEmployee.getEmpId() + ")?");
					System.out.println("1. Name");
					System.out.println("2. Designation");
					System.out.println("3. Salary");
					int updateChoice = sc.nextInt();
					sc.nextLine();

					switch (updateChoice) {
					case 1:
						System.out.print("Enter new Name: ");
						String newName = sc.nextLine();
						updatedEmployee.setEmpName(newName);
						break;
					case 2:
						System.out.print("Enter new Designation: ");
						String newDesignation = sc.nextLine();
						updatedEmployee.setDesignation(newDesignation);
						break;
					case 3:
						System.out.print("Enter new Salary: ");
						double newSalary = sc.nextDouble();
						sc.nextLine();
						updatedEmployee.setSalary(newSalary);
						break;
					default:
						System.err.println("Invalid choice. No updates were made.");
						break;
					}

					boolean isUpdated = eimpl.updateEmployees(updatedEmployee);
					if (isUpdated) {
						System.out.println("Employee details updated successfully.");
					} else {
						System.err.println("Error updating employee details.");
					}
				} else {
					System.err.println("Employee with ID " + idToUpdate + " not found.");
				}
				break;

			case 5:
				System.out.println("Enter the ID of the employee to delete:");
				int id1 = sc.nextInt();
				sc.nextLine();

				boolean deleted = eimpl.deleteEmployees(id1);
				if (deleted) {
					System.out.println("Employee with ID " + id1 + " deleted successfully.");
				} else {
					System.err.println("Employee with ID " + id1 + " not found.");
				}
				break;

			case 6:
				System.out.print("Enter the name of the employee to search: ");
				String searchName = sc.nextLine();
				Employee foundEmployee = eimpl.searchEmployeesByName(searchName);

				if (foundEmployee != null) {
					System.out.println("Employee found: " + foundEmployee);
				} else {
					System.err.println("No employee found with the name: " + searchName);
				}
				break;
			case 0:
				System.out.println("Sorry to see you ! visit again !");
				exit = true;
				break;
			default:
				System.err.println("You are entering wrong input !!! Please select correct and try again. Thank You !");
			}

		}
	}

	private static boolean isValidUser(String username, String password) {
		String validUsername = "root";
		String validPassword = "root123";

		boolean validated = username.equals(validUsername) && password.equals(validPassword);
		return validated;
	}
}
