<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>webtoon</title>
<link rel="stylesheet" href="resources/css/index.css">
</head>

<body>
	<div class="pageName">webtoon</div>

	<div class="btns">
		<form method="post" action="weblist">
			<input type="submit" name="create" class="btn" id="create" value="추가">
<!-- 			<button class="btn" id="delete">제거</button> -->
<!-- 			<button class="btn" id="search">조회</button> -->
		</form>
	</div>
	<div class="warrap">
		<div class="category">
			<div>카테고리</div>
			<div>어쩌고</div>
			<div>저쩌고</div>
		</div>
		<div class="mainPage">
			<table>
				<tbody>
					<tr>
						<c:forEach var="item" items="${ list }">
							<td>
								<div>
									<img src="${ item.img }" />
								</div>
								<div>${ item.title }</div>
								<div>${ item.person }</div>
								<div class="content">${ item.content }</div>
								<div>${ item.tag }</div>
							</td>
						</c:forEach>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
<script>
// 	document.querySelector(".create").addEventListener('click', (e)=>{
// 	})
</script>

</html>