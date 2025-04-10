<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<form 
		method="post"
		action="uploads"
		enctype="multipart/form-data"
		accept-charset="utf-8"
	>
	
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
<!-- 		첨부파일 : <input type="file" name="file1"><br> -->
		첨부파일 : <input type="file" name="file1" multiple="multiple"><br>
		<input type="submit" value="등록">
	</form>
	
</body>
</html>