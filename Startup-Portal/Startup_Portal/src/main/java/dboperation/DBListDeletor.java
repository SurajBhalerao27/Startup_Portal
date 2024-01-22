/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dboperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBListDeletor 
{
    public boolean deleteInvestorList(String tablename)
    {
        boolean flag=false;
        
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");
            Statement st=conn.createStatement();
            
            String query="Delete from"+" "+tablename;

               int x=st.executeUpdate(query);
               
             
            if(x>0)
                flag=true;
            else
                flag=false;
                       
          conn.close();
                     
        }
        
        catch(Exception e)
        {
            System.out.println("Exception in DBListDeletor Class is: "+e);
            flag=false;
        }
        
        
        
        return flag;
    }
    
}
