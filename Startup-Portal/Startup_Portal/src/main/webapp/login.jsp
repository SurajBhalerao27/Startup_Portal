<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login Form </title>
    
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">

 
    <link rel="stylesheet" href="css/style1.css">
</head>
<body>
<!-- ---login  -->
    <div class="main">
    
        <section class="sign-in">
            <div class="container">
                <div class="signin-content">
                    <div class="signin-image">
                        <figure><img src="images/signin-image.jpg" alt="sing up image"></figure>
                        <a href="Signup.jsp" class="signup-image-link">Create an account</a>
                    </div>

                    <div class="signin-form">
                        <h2 class="form-title">Login</h2>
                        <form method="POST" class="input-container" id="login-formd" action=MainController?action=login>
                            <div class="form-group">
                                <label for="name"><i class="input-field"></i></label>
                                <input type="text" name="username" id="userid" placeholder="User Name"/>
                            </div>
                            <div class="form-group">
                                <label for="your_pass"><i class="input-field"></i></label>
                                <input type="password" name="password" id="pass" placeholder="Password"/>
                            </div>
                            <div class="form-group">
                                <input type="checkbox" name="remember-me" id="remember-me" class="agree-term" />
                                <label for="remember-me" class="label-agree-term"><span><span></span></span>Remember me</label>
                            </div>
                            <div class="form-group form-button">
                                <input type="submit" name="signin" id="signin" class="form-submit" value="Log in"/>
                                <input type="reset" name="clear" id="Clear" class="form-submit" value="Clear"/>
                            </div>
                            
                        </form>
                        
                    </div>
                </div>
            </div>
        </section>
   
    </div>
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>