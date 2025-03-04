<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	font-size: 20px;
}
#table{
	display:flex;
	justify-content : center;
}
td{
	border : 1px solid black;
}
body{
background-color : #9674cc;
color : white;
}
#dlf{
display:flex;
justify-content : center;
text-align:center;
margin-top : 50px;
}
</style>
</head>
<body>
	<form method="post" action="todo" id="dlf">
		할일 : <input type="text" name="todo"> <input type="submit"
			value="추가">
	</form>
<hr>
<table id="table">
	<tr>
		<th>
		선택
		</th>
		<th>
		번호
		</th>
		<th>
		할일
		</th>
		<th>
		날짜
		</th>
		<th>
		모디파이 ㅋ
		</th>
		<th>
		완료 여부
		</th>
		<th>
		수정하기
		</th>
	</tr>
	<c:forEach var="dto" items="${resultList}">
		<tr>
			<form method="post" action="todo">
				<td><input type="checkbox" name="done" value="Y"></td>
				<td>
					<input type="hidden" value="${dto.todo_id}" name="todo_id">
					${dto.todo_id}
				</td>
				<td>${dto.todo}</td>
				<td>${dto.create_date}</td>
				<td>${dto.modify_date}</td>
				<td>${dto.done}</td>
				<td>
					<input type="hidden" name="command" value="update">
					<input type="submit" value="수정">
				</td>
			</form>
		</tr>
	</c:forEach>
</table>
<hr>


</body>
</html>