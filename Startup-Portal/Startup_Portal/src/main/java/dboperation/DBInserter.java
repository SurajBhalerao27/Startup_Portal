/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dboperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBInserter {
    
     public boolean insertInvestorinfo(String stock,String factor, String objective,String duration,String monitor,String expect)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");
            Statement st=conn.createStatement();
            
            String query="Insert into startup_requirementinfo values('"+stock+"','"+factor+"','"+objective+"','"+duration+"','"+monitor+"','"+expect+"')";
            
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
            System.out.println("Exception in InvestorDBInserter Class is: "+e);
            flag=false;
        }
        
        
        
        return flag;
    }
     
     public boolean insertStartupinfo(String investmentamount,String rtype, String rper)
    {
        boolean flag=true;
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");
            Statement st=conn.createStatement();
            
            String query="Insert into investor_requirementinfo values('"+investmentamount+"','"+rtype+"','"+rper+"')";
            
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
            System.out.println("Exception in InvestorDBInserter Class in insertStartupinfo ()cis: "+e);
            flag=false;
        }
        
        
        
        return flag;
    }
    
    
}
