<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	\${5+2} : ${5+2} <br>
	\${5/2} : ${5/2} <br>
	<%-- \${5 div 2} : ${5 div 2} <br> --%>
	\${5 mod 2} : ${5 mod 2} <br>
	\${5 > 2} : ${5 > 2} <br>
	\${2 gt 10} : ${2 gt 10} <br>
	\${(5>2)?5:2} : ${(5>2)?5:2} <br>
	\${(5>2) || (2<10)} : ${(5>2) || (2<10)} <br>
	<%
		String input=null;
	%>
	\${empty input } : ${empty input }<br>
	input= 
	<%if(input != null){ %>
		<%= input %><br>
	<%} %>
	input= ${input }<br>
	자바코드: <%=request.getParameter("id") %><br>
	EL 식: ${param.id }
</body>
</html>