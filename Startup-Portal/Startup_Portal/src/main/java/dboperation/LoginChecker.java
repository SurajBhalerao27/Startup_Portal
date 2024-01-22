/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;
import java.sql.*;

public class LoginChecker {


    @SuppressWarnings("deprecation")
	public boolean checkLogin(String uid, String pass)
    {
        boolean flag=true;

        try
        {

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");
            Statement st=conn.createStatement();

            String query="Select * from registerinfo where userid='"+uid+"'and password='"+pass+"'";
            System.out.println("Login Query:"   +query);
            ResultSet rs=st.executeQuery(query);
            
            if(rs.next())
            {
             flag=true;   
            }
            
            else
            {
                flag=false;
            }
          

        }

        catch(Exception e)
        {
            System.out.println("Exception in LogicChecker Class is: "+e);
            flag=false;
        }




        return flag;
    }

}
