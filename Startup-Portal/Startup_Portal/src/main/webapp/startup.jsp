<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html {
	background: url(images1/startup.jpg) no-repeat top right fixed;
	background-position: calc(100% - 2px) top;
	background-size: 50%;
	width: 100%;
	height: 90px;
}

img {
	max-width: 100%;
	height: 100%;
}

body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

.container { 
	width: 650px;
	height:600px;
	background: #fff;
	margin-left: 100 px;
	padding-left: 40px;
	box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);
	-moz-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);
	-webkit-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);
	-o-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);
	-ms-box-shadow: 0px 15px 16.83px 0.17px rgba(0, 0, 0, 0.05);
	border-radius: 20px;
	-moz-border-radius: 20px;
	-webkit-border-radius: 20px;
	-o-border-radius: 20px;
	-ms-border-radius: 20px;
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
	background-color: #008000;
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

.subnav:hover .subnav-content {
	display: block;
}

.style1 {
	font-family: Arial, Helvetica, sans-serif
}

input[type=text], [type=number] {
	width: 30%;
	padding: 10px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	margin-left: 16px;
	background: #f1f1f1;
}

#Layer1 {
	position: absolute;
	width: 40%;
	height: 87%;
	z-index: 2;
	left: 30%;
	top: 10%;
	background-color: #728C00;
}

label {
	margin-left: 1em;
	padding-bottom: 14px 16px;
}

select {
	margin-left: 30px;
}

.button1 {
	background-color: #FF6700;
	color: white;
	padding: 10px 20px;
	margin: 3px 0;
	border: none;
	width: 18%;
	font-size: 16px;
	border-radius: 25px;
}
</style>
</head>
<body>

	<div class="navbar">
		<div class="subnav">
			<button class="subnavbtn">
				<span class="style1">Manage Profile </span>
			</button>
			<div class="subnav-content">
				<a href="editprofile.jsp">Edit Profile</a>
			</div>
		</div>



		<div class="subnav">
			<button class="subnavbtn">
				<span class="style1">Search Investors</span>
			</button>
			<div class="subnav-content">
				<a href="investors.jsp">Find Investors</a> <a href="startup.jsp">Find
					Startup</a>
			</div>
		</div>

		<a href="login.jsp">Logout</a>
	</div>





	<div class="container">

		<form name="form1" method="post"
			action="MainController?action=investor">
			<center>
				
				<h1 style="font-size: 20px">Please Give The Answers To Find
					Startups List</h1>
				<pre>
                    
                </pre>
				&emsp;


			</center>
			<div>
				<label for="investmentamount"><b>Amount you want to
						invest (Rs Crore) :</b></label> <input name="investmentamount" type="number"
					step="any" id="name" placeholder="Enter Investment Amount"
					size="20" required>
			</div>
			&nbsp;

			<div>
				<label for="returntype"><b>Return Type :</b></label> <select
					name="returntype" id="stocks"
					style="min-height: 35px; min-width: 33%; margin-left: 211px;">
					<option value="Monthly">Monthly</option>
					<option value="Quarterly">Quarterly</option>
					<option value="Yearly">Yearly</option>
				</select>

			</div>

			&nbsp;


			<div>
				<label for="returnpercentage"><b>Return Expected in
						Percentage (%) :</b></label> <input name="returnpercentage" type="number"
					step="any" id="name" placeholder="Enter Expected Return"
					style="margin-left: 39px" size="20" required>

			</div>


			<pre>
                    
                </pre>
			&emsp;
			<center>
				<button type="submit" class="button1">Submit</button>
			</center>
		</form>

	</div>



</body>
</html>
