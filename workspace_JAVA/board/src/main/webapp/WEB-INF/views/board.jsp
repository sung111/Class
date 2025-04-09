<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="stylesheet" href="resources/board.css" />
</head>

<body>
	<div class="box">
		<h1>일반 게시판</h1>
		<div class="postbtn">
			<!--             <button type="button" class="newpost">글 쓰기</button> -->
			<a href="write" class="newpost">글쓰기</a>
		</div>
		<div style="display: flex; gap: 10px;">
			<div>번호</div>
			<div style="flex-grow: 1;">제목</div>
			<div>작성일자</div>
			<div>작성자</div>
		</div>
		<hr>
		<!-- 게시물 목록 -->
		<div class="post">
			<span class="num" style="padding: 0 15px 0 10px;">1</span> <span
				class="content">사내 동호회 활동 사진 공유</span> <span class="date">2025-02-02</span>
			<span class="author">박혜성</span>
		</div>
		<c:forEach var="dto" items="${ list }">
			<div class="post">
				<span class="num" style="padding: 0 15px 0 10px;">${ dto.bc }</span>
				<span class="content">${ dto.title }</span> <span class="date">
					${ dto.createdate }</span> <span class="author">${ dto.person }</span>
			</div>
		</c:forEach>
	</div>
	<script>
		
	</script>
</body>

</html>