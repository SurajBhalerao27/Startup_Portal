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


public class TableRowCounter 
{
    public boolean isRowAdded(String tablename)
    {
        boolean flag=false;
        int count=0;
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");
            Statement st=conn.createStatement();
            
            String query="SELECT COUNT(*) AS rowcount FROM"+" "+tablename;
                   // "Select * from investorlist";

                 
              ResultSet rs=st.executeQuery(query);
              rs.next();
              count=rs.getInt("rowcount"); 
              rs.close();
                            
             if(count>0)
                 flag=true;
                       
            // System.out.println("count: "+count);
          conn.close();
                     
        }
        
        catch(Exception e)
        {
            System.out.println("Exception in InvestorDBList Class is: "+e);
            flag=false;
        }
        
        
        
        return flag;
    }
    
}
