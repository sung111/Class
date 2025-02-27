<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.List"
    import="java.util.ArrayList"
    import="java.util.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 스크립틀릿 scriptlet-->
<%
// java 영역
System.out.println("java 크랙!");
%>

<%@ include file="header.jsp" %>
<!-- jsp에 직접 text에 1234라는 값을보내고
	jsp 에서 html로 그 값을 출력하시오 -->
	
<% 
	String text = request.getParameter("text");
	response.getWriter().println(text);
	out.println(text);
%><br>
	<%= text %>

	
	
	
	
	
</body>
</html>