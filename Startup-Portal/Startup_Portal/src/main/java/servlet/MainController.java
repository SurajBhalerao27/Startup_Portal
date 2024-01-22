package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dboperation.LoginChecker;
import dboperation.UserProfileUpdate;
import dboperation.DBInserter;
import dboperation.TableRowCounter;
import dboperation.DBListDeletor;
import dboperation.SignUpPageDBInserter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.ServletException;
import java.io.PrintWriter;

public class MainController extends HttpServlet {
	private static final long serialVersionUID = 7010844742552968948L;
	int count = 0;
	String rating1 = "";
	String rating2 = "";
	String rating3 = "";

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	// if method=GET call doPost
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Inside doGet ");

		invokeActionClass(request, response);
	}

	// if method=POST call doPost
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Inside doPost");

		invokeActionClass(request, response);
	}

	// this method transfers control to specific classes
	private void invokeActionClass(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");
		System.out.println("=i am in invoke method==============");
		PrintWriter out = response.getWriter();

		try {
			String action = request.getParameter("action");
			System.out.println("action is : --- > " + action);

			// ------------------------------------------------------------------USER
			// REGISTRATION------------------------------------------------
			if (action.equals("register")) {

				System.out.println("Action in if  =" + action);

				String uname = request.getParameter("uname");
				String gender = request.getParameter("gender");
				String dob = request.getParameter("birthday");
				String address = request.getParameter("address");
				String email = request.getParameter("email");
				String uid = request.getParameter("userid");
				String pass = request.getParameter("psw");

				System.out.println("Username is  " + uname);
				System.out.println("Email is  " + email);
				System.out.println("User ID: is  " + uid);
				System.out.println("Password is  " + pass);

				SignUpPageDBInserter ri = new SignUpPageDBInserter();
				if (ri.insertRegistrationinfo(uname, gender, dob, address, email, uid, pass)) {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Data Submitted Successfully');");
					out.println("location='login.jsp';");
					out.println("</script>");
				} else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Oops there is some error');");
					out.println("location='signup.jsp';");
					out.println("</script>");

				}

			}
			// ------------------------------------------------------------------USER
			// LOGIN------------------------------------------------
			if (action.equals("login")) {

				String userid = request.getParameter("username");
				String pass = request.getParameter("password");

				System.out.println("Username is  " + userid);
				System.out.println("Password is  " + pass);

				LoginChecker lc = new LoginChecker();

				if (lc.checkLogin(userid, pass)) {
					request.getSession().setAttribute("username", userid);
					response.sendRedirect("/investmentsuggestions/operation.jsp");

				} else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Password is not correct');");
					out.println("location='login.jsp';");
					out.println("</script>");

				}

			}

			// ------------------------------------------------------------------USER
			// UPDATE------------------------------------------------
			if (action.equals("updateuser")) {

				System.out.println("Action in if  =" + action);

				String uname = request.getParameter("uname");
				String gender = request.getParameter("gender");
				String dob = request.getParameter("birthday");
				String address = request.getParameter("address");
				String email = request.getParameter("email");
				String uid = request.getParameter("userid");
				String pass = request.getParameter("psw-repeat");

				UserProfileUpdate ri = new UserProfileUpdate();
				if (ri.updateInfo(uname, gender, dob, address, email, uid, pass)) {

					// response.sendRedirect("/evoting/editprofile.jsp");
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Data Updated Successfully');");
					out.println("location='operation.jsp';");
					out.println("</script>");
				} else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Oops there is some error');");
					out.println("location='editprofile.jsp';");
					out.println("</script>");

				}

			}
//------------------------------------------------------------------Startup Info--------------------------------------       
			if (action.equals("startup")) {

				System.out.println("Action in if  =" + action);

				String stocks = request.getParameter("stocks");
				String factor = request.getParameter("factor");
				String Objective = request.getParameter("Objective");
				String duration = request.getParameter("duration");
				String monitor = request.getParameter("monitor");
				String returns = request.getParameter("return");

				System.out.println(returns);

				new DBListDeletor().deleteInvestorList("investorlist");
				DBInserter id = new DBInserter();
				if (id.insertInvestorinfo(stocks, factor, Objective, duration, monitor, returns)) {

					while (true) {
						if (new TableRowCounter().isRowAdded("investorlist"))

							break;
					}

					out.println("<script type=\"text/javascript\">");
					out.println("alert('Investors Search Completed Successfully');");
					out.println("location='viewinvestorlists.jsp';");
					out.println("</script>");

				}

				else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Oops there is some error');");
					out.println("location='investors.jsp';");
					out.println("</script>");

				}

			}

			// ------------------------------Investor
			// Info--------------------------------------
			if (action.equals("investor")) {

				System.out.println("Action in if  =" + action);

				String investmentamount = request.getParameter("investmentamount");
				String returntype = request.getParameter("returntype");
				String returnpercentage = request.getParameter("returnpercentage");

				System.out.println(returnpercentage);

				new DBListDeletor().deleteInvestorList("startuplist");
				DBInserter id = new DBInserter();
				if (id.insertStartupinfo(investmentamount, returntype, returnpercentage)) {

					while (true) {
						if (new TableRowCounter().isRowAdded("startuplist"))
							break;
					}

					out.println("<script type=\"text/javascript\">");
					out.println("alert('Startup Search Completed Successfully');");
					out.println("location='viewstartuplists.jsp';");
					out.println("</script>");

				}

				else {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Oops there is some error');");
					out.println("location='startup.jsp';");
					out.println("</script>");

				}

			}
		}

		catch (Exception e) {
			System.out.println("Error at MainController " + e);
		}
	}

}
