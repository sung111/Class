<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:set var="title" value="영일이삼사오륙칠팔구일" />
	\${ title } : ${ title }<br>
	\${ fn:length(title) eq 11 } : ${ fn:length(title) eq 11 }<br>
	\${ fn:length(title) < 3 } : ${ fn:length(title) < 3 }<br>
	\${ fn:substring(title, 3, 5) } : ${ fn:substring(title, 3, 5) }<br>
	\${ fn:replace(title, "오", "5") } : ${ fn:replace(title, "오", "5") }<br>
	\${ fn:indexOf(title, "팔") } : ${ fn:indexOf(title, "팔") }<br>
	\${ fn:indexOf(title, "백") } : ${ fn:indexOf(title, "백") }<br>
	

</body>
</html>