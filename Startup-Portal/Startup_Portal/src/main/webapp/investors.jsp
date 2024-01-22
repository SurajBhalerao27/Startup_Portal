<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html {
	background: url(images1/investor.jpg) no-repeat top right fixed;
	background-position: calc(100% - 60px) top;
	background-size: 40%;
	width: 100%;
	height: 90px;
	background-size: 40%;
}

body {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
}

.container {
	width: 650px;
	background: #ffff;
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

#Layer1 {
	position: absolute;
	width: 50%;
	height: 100%;
	z-index: 2;
	left: 10%;
	top: 13%;
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
			action="MainController?action=startup">
			<center>

				<h1 style="font-size: 20px">Please Select The Answers To Find
					Investors List</h1>
				<br> <br>

				<pre>
                    
                </pre>
				&emsp;

			</center>
			<div>
				<label for="stock"><b>Are your Company is in Stock
						Market :</b></label> <select name="stocks" id="stocks"
					style="min-height: 30px; min-width: 150px; margin-left: 30px;">
					<option value="Yes">Yes</option>
					<option value="No">No</option>
				</select>
			</div>
			&nbsp;

			<div>
				<label for="factor"><b>Investment Factor :</b></label> <select
					name="factor" id="stocks"
					style="min-height: 30px; min-width: 150px; margin-left: 175px;">
					<option value="Returns">Returns</option>
					<option value="Locking Period">Locking Period</option>
					<option value="Risk">Risk</option>
				</select>

			</div>

			&nbsp;

			<div>
				<label for="Objective"><b>Investment Objective :</b></label> <select
					name="Objective" id="Objective"
					style="min-height: 30px; min-width: 150px; margin-left: 155px;">
					<option value="Capital Appreciation">Capital Appreciation</option>
					<option value="Income">Income</option>
					<option value="Growth">Growth</option>
				</select>

			</div>

			&nbsp;

			<div>
				<label for="duration"><b>Investment Duration :</b></label> <select
					name="duration" id="duration"
					style="min-height: 30px; min-width: 150px; margin-left: 162px;">
					<option value="1-3 years">1-3 years</option>
					<option value="3-5 years">3-5 years</option>
					<option value="Less than 1 year">Less than 1 year</option>
					<option value="More than 5 years">More than 5 years</option>
				</select>

			</div>

			&nbsp;

			<div>
				<label for="monitor"><b>Investment Monitor :</b></label> <select
					name="monitor" id="monitor"
					style="min-height: 30px; min-width: 150px; margin-left: 171px;">
					<!-- <option value="Daily">Daily</option> -->
					<option value="Weekly">Weekly</option>
					<option value="Monthly">Monthly</option>
					<option value="Monthly">Quarterly</option>
				   <!-- <option value="Monthly">Yearly</option> -->	

				</select>

			</div>

			&nbsp;

			<div>
				<label for="return"><b>Return :</b></label> <select name="return"
					id="return"
					style="min-height: 30px; min-width: 150px; margin-left: 265px;">
					<!-- <option value="10%-20%">0%-5%</option>
					<option value="10%-20%">5%-10%</option> -->
					<option value="10%-20%">10%-20%</option>
					<option value="20%-30%">20%-30%</option>
					<option value="30%-40%">30%-40%</option>
					<option value="10%-20%">40%-50%</option>
				</select>

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
