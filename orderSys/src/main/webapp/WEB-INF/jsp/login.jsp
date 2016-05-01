<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>login</title>
</head>
<body>

	<form:form method="POST" commandName="user" action="/user/login">
		<table>
			<tr>
				<td><form:label path="username">username</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">password</form:label></td>
				<td><form:input type="password" path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>