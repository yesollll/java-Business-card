<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	당신이 선택한 항목
	<hr>
		<c:forEach var="item" items="${paramValues.item}" varStatus="status">
			${item} 
			<c:if test= "${not status.last}">, </c:if>
		</c:forEach>
</body>
</html>