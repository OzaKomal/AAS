<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function validate(){
		if(document.loginform.username.value==""){
			alert("Username should not be blank");
			document.loginform.username.focus();
			return false;
		}else if(document.loginform.password.value==""){
			alert("Password should not be blank");
			document.loginform.password.focus();
			return false;
		}		
	}	
</script>
</head>
<body>
<h3 align="center">Login page</h3>
<div style="margin:0 auto;width:75%;text-align:left;">
	<center>
	<div id="error" style="color:red"></div>
	<form action="Login" name="loginform" onsubmit="return validate();" method="post">		
		Username : <input type="text" name="username"/><br>
		Password : <input type="password" name="password"/><br>
		<input type="submit" value="Login" name="submit"/><br>	
		<a href="Forgot.jsp"  > Forgot Password </a>		
	</form>
	
	</center>
</div>
</body>
</html>