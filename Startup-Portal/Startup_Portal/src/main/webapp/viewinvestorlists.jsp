<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html { 
  background: url(images1/image9.jpg) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
		
		img {
                max-width:100%;
                height:100%;
            }
			
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
}

.navbar {
     
  overflow: hidden;
  background-color: #333; 
}

.navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.subnav {
  float: left;
  overflow: hidden;
}

.subnav .subnavbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .subnav:hover .subnavbtn {
  background-color:#008000;
}

.subnav-content {
  display: none;
  position: absolute;
  left: 0;
  background-color: #008000;
  width: 17.3%;
  z-index: 1;
  text-align: left;
}

.subnav-content a {
  float: left;
  color: white;
  text-decoration: none;
}

.subnav-content a:hover {
  background-color: #eee;
  color: black;
}
td {
  border: 1px solid #dddddd;
  text-align: center;
  padding: 8px;
  background-color: white;
  color: black;
}
th {
  border: 1px solid #dddddd;
  text-align: center;
  padding: 8px;
  background-color: #728C00;
  color: white;
}

tr:nth-child(even) {
  background-color: #728C00;
}

.subnav:hover .subnav-content {
  display: block;
}
.style1 {font-family: Arial, Helvetica, sans-serif}

#Layer1 {
       
	position:absolute;
	width:60%;
	height:50%;
	z-index:2;
	left:20%;
	top: 10%;
        background-color: #728C00;
}
</style>
</head>
<body>

<div class="navbar">
  <div class="subnav">
    <button class="subnavbtn"><span class="style1">Manage Profile </span> </button>
    <div class="subnav-content">
      <a href="editprofile.jsp">Edit Profile</a>
    </div>
  </div> 
    
    
   
    <div class="subnav">
    <button class="subnavbtn"><span class="style1">Search Investors</span> </button>
    <div class="subnav-content">
      <a href="investors.jsp">Find Investors</a>
      <a href="startup.jsp">Find Startup</a>
   
    </div>
       </div> 
          
      <a href="login.jsp">Logout</a>
      </div> 

   
    
    
    
     <div id="Layer1">
          <form name="form1" method="get" action="#">
		  <table>
  <tr>
    <th>Gender</th>
     <th>Age</th>
    <th>Investment Avenues</th>
    <th>Stock Market</th>
    <th>Factor</th>
    <th>Objective</th>
    <th>Purpose</th>
    <th>Duration</th>
     <th>Invest Monitor</th>
     <th>Expect</th>
     
  </tr>
 
       <% 
Connection con=null;
ResultSet rs=null;

try
{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");
            Statement st1=con.createStatement();
           String query="Select *from investorlist";

            rs=st1.executeQuery(query);
            
     while(rs.next())
     {
        
%>
 <tr>
<td><%=rs.getString(1)%></td>
<td><%=rs.getString(2)%></td>
<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getString(5)%></td>
<td><%=rs.getString(6)%></td>
<td><%=rs.getString(7)%></td>
<td><%=rs.getString(8)%></td>
<td><%=rs.getString(9)%></td>
<td><%=rs.getString(10)%></td>
 </tr>
          
<%
     }
}catch(Exception e)
{    out.print(e);
}
%>
    
 
  
 
</table>
          </form>
        </div>
       
  

</body>
</html>
