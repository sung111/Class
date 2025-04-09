<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
*{
font-size : 20px;
}
</style>
</head>
<body>
<form method="post" action="">
	카테고리 : <select>
		<option value="공지">공지사항</option>
		<option value="가입인사">가입인사</option>
		<option value="일반게시판">일반게시판</option>
		</select><br>
	<input type="text" name="title" placeholder="제목">
	<br>
	<textarea rows="10" cols="60" placeholder="내용"></textarea><br>
	<input type="submit" value="등록">
</form>	
</body>
</html>