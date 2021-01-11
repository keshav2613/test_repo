<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Login Form</h1>
		<form action="login">
			<input type="hidden" name="requestAction" value="login" />

			<table style="with: 100%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>

			</table>
			<input type="submit" value="Login" />
			<%if(null!=request.getAttribute("errormsg"))
        {%>
			<p>Invalid username or password</p>
			<% }
            %>
			<%if(null!=request.getAttribute("logoutmsg"))
        {%>
			<p>You have logged out successfully</p>
			<% }
            %>
		</form>
	</div>
</body>
</html>