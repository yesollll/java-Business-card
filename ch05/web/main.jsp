<%@page import="sun.awt.RepaintArea"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if(session.getAttribute("loginUser")==null){
			response.sendRedirect("loginForm.jsp");
		}else{
	%>
	<%=session.getAttribute("loginUser") %>님안녕<br>
	저희홈페이지에방문해주셔서 ㄳㄳ<br>
	즐거운시간 ㄱㄱ<br>
	<form method="post" action="logout.jsp">
	<input type="submit" value="로그아웃">
	</form>
	<%
		}
	%>
</body>
</html>