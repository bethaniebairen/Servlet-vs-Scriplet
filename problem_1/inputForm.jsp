<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CSE 640 Assignment 01  </title>
</head>
<body>
<body>
	<%
		String error_message = "";
		Object error = request.getAttribute("error");
		if (error != null)
			error_message = error.toString();
	%>
	
	<form>
		<table Style="border-collapse: separate; border-spacing: 20px; background-color: #F1F2F6;">
			<tr>
				<td>Please enter your name:</td>
				<td><input name="user" type="text" size="50"></td>
					<td style="color: red"><%=error_message%></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"></td>
				<td></td>
			</tr>
		</table>
	</form>
	<%
		String inputString = request.getParameter("user");
		if (inputString != null && !inputString.isEmpty()){
			String reverseString = new StringBuilder(inputString).reverse().toString();
			session.setAttribute("ReverseName",reverseString);
			response.sendRedirect("outputFor.jsp");
		}
		
	%>
	
</body>
</body>
</html>