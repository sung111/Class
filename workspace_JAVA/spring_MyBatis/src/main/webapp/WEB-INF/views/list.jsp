<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<table>
		<THead>
			<tr>
				<th>empno</th>
				<th>ename</th>
			</tr>
		</THead>
		<tbody>
			<c:forEach var="dto" items="${list}" varStatus="loop">
				<tr>
<%-- 					<td>${loop.begin}</td> --%>
<%-- 					<td>${loop.first}</td> --%>
<%-- 					<td>${loop.count}</td> --%>
					<td>${dto.empno}</td>
					<td>${dto.ename}</td>
				</tr>
			</c:forEach>
			<tr>
				<td></td>
			</tr>
		</tbody>
	</table>
</body>

</html>