/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class SignUpPageDBInserter {
    
     @SuppressWarnings("deprecation")
	public boolean insertRegistrationinfo(String name,String gender, String dob,String address,String email,String uid,String pass)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");
            Statement st=conn.createStatement();
            
            String query="Insert into registerinfo values('"+name+"','"+gender+"','"+dob+"','"+address+"','"+email+"','"+uid+"','"+pass+"')";
            
//            
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
            st.close();
            conn.close();
            
        }
        
        catch(Exception e)
        {
            System.out.println("Exception in SignUpPageDBInserter Class is: "+e);
            flag=false;
        }
        
        
        
        
        return flag;
    }
    
    
}
