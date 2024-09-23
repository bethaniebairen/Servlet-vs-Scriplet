<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CSE 640 Assignment 01</title>
</head>
<body>
	<%
		Object ReverseName = session.getAttribute("ReverseName");
	
				%>
		<table Style="border-collapse: separate; border-spacing: 20px; background-color: #F1F2F6;">
			<tbody>
				<tr>
					<td> Name:</td>
					<td><%= ReverseName %></td>
				</tr>
			</tbody>
		</table>
</body>
</html>