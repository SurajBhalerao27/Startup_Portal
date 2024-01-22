<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Sign Up</title>

<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<link rel="stylesheet" href="css/style1.css">
</head>

<body>

	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
						<form method="POST" class="register-form" id="register-form"
							action="MainController?action=register">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="uname" id="name" placeholder="Enter Name"
									size="20" required />
							</div>
							<div class="form-group">
								<label for="gender"><i
									class="zmdi zmdi-gender material-icons-gender"></i></label> <input
									type="text" name="gender" id="gender" placeholder="gender" />
							</div>
							<div class="form-group">
								<label for="birthday"><i class="zmdi zmdi-birthday"></i></label>
								<input type="date" name="birthday" id="birthday"
									placeholder="birthday" size="20" required />
							</div>
							<div class="form-group">
								<label for="Address"><i class=""></i></label> <input
									type="text" name="address" id="address" placeholder="address" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" placeholder="Your Email"
									pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"
									title="Invalid Emailid" required />
							</div>
							<div class="form-group">
								<label for="UserID"><i class="zmdi zmdi-user"></i></label> <input
									type="text" name="userid" placeholder="UserID" size="20"
									required />
							</div>
							<div class="form-group">
								<label for="psw"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="psw" placeholder="Password"
									pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
									title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
									required />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a
									href="https://www.startupindia.gov.in/content/sih/en/data-innovation-bazaar/terms-and-conditions.html"
									class="term-service">Terms of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/signup-image.jpg" alt="sing up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">I am already
							member</a>
					</div>
				</div>
			</div>
		</section>
	</div>

	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
</body>

</html>