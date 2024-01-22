<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html { 
  background: url(images/edit-image.jpg) no-repeat center center fixed; 
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
.container {  
    padding: 50px;  
 
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
  width: 8%;
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

.subnav:hover .subnav-content {
  display: block;
}
input[type=text], input[type=date], input[type=password], textarea { 
 
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  border-radius: 25px;
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus, input[type=date]:focus, textarea:focus {  
  background-color: orange;  
  outline: none;  
}  
 input[type=text], input[type=date], input[type=password], textarea { 
 
  width: 100%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  border-radius: 25px;
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus, input[type=date]:focus, textarea:focus {  
  background-color: orange;  
  outline: none;  
}  
 hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn { 
    background-color: #FF6700; 
        color: white; 
        padding: 16px 20px; 
        margin: 8px 0; 
        border: none; 
        cursor: pointer; 
        width: 20%; 
         border-radius: 25px;  
        opacity: 0.9; 
        font-size: 16px;  
}  
#message {
  display:none;
  background: #f1f1f1;
  color: #000;
  position: relative;
  padding: 20px;
  margin-top: 10px;
}

#message p {
  padding: 10px 35px;
  font-size: 18px;
}
#Layer1 {
	position:absolute;
	width:619px;
	height:125%;
        border-radius: 35px;
	z-index:1;
	left: 30%;
	top: 8%;
        
        background-color: #ffffff00;
}
.style1 {font-family: Arial, Helvetica, sans-serif}
</style>
</head>
<body>

<div class="navbar">

  <div class="subnav">
    <button class="subnavbtn"><span class="style1">Manage Profile </span> </button>
    <div class="subnav-content">
      <a href="Signup.jsp">Sign Up</a>
    </div>  
  </div> 
     
    <div class="navbar">
          <a href="login.jsp">Logout</a>
      </div> 

     </div> 
    </div> 
    
    <div id="Layer1">
        <%

String name="", gender="", dob="", address="", email="", pass="",uname="";
try
	{
	 uname=(String)	request.getSession().getAttribute("username");
         System.out.println("uname: "+uname);
	
	        Class.forName("com.mysql.jdbc.Driver").newInstance();     
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/investmentsuggestions","root","root");			
            Statement st=con.createStatement();
			
            String str="select * from registerinfo where userid='"+uname+"'";
		
			System.out.println(str);
			
            ResultSet rs=st.executeQuery(str);
			//fname, lname, caddress, email, contact, username, password
            if(rs.next())  
            {//
                                name=rs.getString(1);
				gender=rs.getString(2);		
				dob=rs.getString(3);
				address=rs.getString(4);
                                email=rs.getString(5);
                                pass=rs.getString(6);
				
				
				System.out.println("name: "+name);
                                System.out.println("gender "+gender);
                                System.out.println("dob "+dob);
                                System.out.println("address "+address);
                                System.out.println("email "+email);
                                System.out.println("pass "+pass);
        				
            }
	      		   
		  }
		 catch(Exception e)
		 {
		 System.out.println("Exception in editprofile.."+e);
		 } 
%>
            
           <form name="form1" method="post" action="MainController?action=updateuser">
		  <div class="container">
		             
           						
			 <label for="name"><b style="color:white">Name:</b></label>   
			 <input name="uname" type="text" id="name" value="<%=name%>" placeholder="Enter Name" size="20" required> 
			 
		    <div>  
                       
			 <label for="gender"><strong style="color:white">Gender:</strong></label>
                        
			 <p style="color:white">
			   <input type="radio" value="Male"  id="gender" name="gender" > 
			   Male
			   <input type="radio" value="Female" id="gender" name="gender"> 
			   Female
			   <input type="radio" value="Other" id="gender" name="gender"> 
			   Other			 </p>
			 </div>
			 
			 <label for="birthday"><strong style="color:white">Birthday:</strong></label>
                         <input name="birthday" type="date" id="birthday" value="<%=dob%>" placeholder="Enter Birthday" size="20" required>  
			 
			 <label for="address"><strong style="color:white">Address:</strong></label>
			 <textarea name="address" cols="20" rows="5" placeholder="Current Address"  required><%=address%></textarea> 
			               
			 <label for="email"><b style="color:white">Email:</b></label>  
			 <input type="text" placeholder="Enter Email" name="email" value="<%=email%>" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" title="Invalid Emailid" required>  
			 
			 
			 <label for="userid"><b style="color:white">User ID:</b></label> 
			 <input type="text" name="userid" placeholder="Enter Userid" value="<%=uname%>" size="20" required>  
			 
			 <label for="psw"><b style="color:white">Password:</b></label>  
   			 <input type="password" placeholder="Enter Password" name="psw" value="<%=pass%>" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"required>  
  
   			<label for="psw-repeat"><b style="color:white">Confirm Password:</b></label>  
   			<input type="password" placeholder="Enter Confirm Password" name="psw-repeat" value="<%=pass%>"required> 
			
                        <button type="submit"  class="registerbtn">Update</button>  
			
        
        
    </div>
                         </form>

        </div>
    <div id="message">
  <h3>Password must contain the following:</h3>
  <p id="letter" class="invalid">A <b>lowercase</b> letter</p>
  <p id="capital" class="invalid">A <b>capital (uppercase)</b> letter</p>
  <p id="number" class="invalid">A <b>number</b></p>
  <p id="length" class="invalid">Minimum <b>8 characters</b></p>
</div>
        
       
  

</body>
</html>
