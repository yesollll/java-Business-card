<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id="pinksung";
    	String pwd="1234";
    	String name="홍길동";
    	if(id.equals(request.getParameter("id"))&&pwd.equals(request.getParameter("pwd"))){
    		session.setAttribute("loginUser", name);
    		response.sendRedirect("main.jsp");
    	}else{
    		response.sendRedirect("loginForm.jsp");
    	}
    %>
