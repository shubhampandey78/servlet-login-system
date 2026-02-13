<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0
		response.setDateHeader("Expires", 0); // Proxies

		if(session.getAttribute("username")== null){
			response.sendRedirect("login.jsp");
			return;
		}
	%>
	<h1>Welcome ${username}</h1>
	<a href="videos.jsp">Videos</a></br>
	<a href="logout">Logout</a>
</body>
</html>