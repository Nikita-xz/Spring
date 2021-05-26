<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>

	
<style type="text/css">
header {
	height: 50px;
	background-color: blue;
	display: flex;
	justify-content: space-between;
	position: fixed;
	width: 98.5%;
	border: dashed;
	border-color: black;
}
body {
	background-repeat: no-repeat;
	background-image:url(img/image.jpg);
	background-size: 100%;
	font-size: 20px;
	color:Black;
}
.center-screen>div {
	padding: 2px;
}
.company-name {
	height: 100px;
	display: inline-block;
	width: 60%;
	text-align: center;
	font-size: 40px;
	color: Black;
	text-transform: uppercase;
	position: absolute;
}
input, textarea {
	height: 30px;
	width: 250px;
	
	text-align: center;
	font-size: 16px;
	margin-bottom: 10px;
	padding: 2px;
	color: black;
	background-color: white;
	
	font-weight: bold;
}
.submit {
	background-color: white;
	height: 39px;
	width: 209px;
	
	font-size: 20px;
	color: white;
	margin-bottom: 5px;
}
form {
	display: inline;
}
form input[type="radio"] {
	width: 20px;
	margin-right: 0px;
}
form lable {
	float: left;
	width: 100%;
	margin-right: 30px;
	margin-left: 10px;
}
form input[type="submit"], [type="reset"] {
	height: 40px;
	width: 100px;
	margin-left: 40px;
	background-color: white;
	width: 100px;
	margin-left: 40px;
	
}
.div {
	width: 120px;
	padding-left: 40px;
	padding-top: 10px;
}
footer {
	height: 20px;
	background-color:blue;
	text-align: center;
	padding-top: 10px;
	padding-bottom: 10px;
	margin-top: 20% px;
	position: fixed;
	width: 98.5%;
	color: black;
	border: dashed;
	border-color: black;
	font-weight: bold;
}
</style>
</head>
<body>
	<header>
		<div style="padding-left: 40px; padding-top:5px; font-size: 30px;font-weight:bold; color: Black;"> World Wonder</div>
		<div class="div"><a href="#" style="color: black">SignIn</a></div>
	</header>
	<marquee style="font-size: 40px; font-weight: bold; margin-top: 10px; padding-top: 40px; color: red; font-style: italic;">Welcome To Register Page</marquee>
	
	<form action="registration.do" method="post">
		<table>
			<div>
				<tr>
					<th><label>FullName :</label></th>
					<th><input type="text" name="fullname"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>EmailId :</label></th>
					<th><input type="email" name="Emailid"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>ContactNo :</label></th>
					<th><input type="number" name="contact"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>DateOfBirth :</label></th>
					<th><input type="date" name="DOB"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>Address :</label></th>
					<th><textarea name="address" rows="2" cols="20"></textarea></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>Gender :</label></th>
					 <th>
					 <input type="radio" name="gender" value="male">Male
					 <input type="radio" name="gender" value="female">Female
					 <input type="radio" name="gender" value="others">Others
					 </th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>Password :</label></th>
					<th><input type="password" name="password"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>ConfirmPassword :</label></th>
					<th><input type="password" name="confirmpassword"></th>
				</tr>
			</div>
		</table>
		<div>
			<input type="submit" value="Register"> <input type="reset"
				value="Reset">
		</div>
	</form>
	<marquee
		style="color:maroon; font-size: 40px; font-stretch: wider; font-weight: bolder; font-style: oblique; margin-top: 2px;"> ${message}</marquee>

	<footer>Copyrights @copy 2021</footer>
</body>
</html>