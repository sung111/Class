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

#table {
	display: flex;
	justify-content: center;
}

td {
	border: 1px solid black;
}

body {
	background-color: #9674cc;
	color: white;
}

#dlf {
	display: flex;
	justify-content: center;
	text-align: center;
	margin-top: 50px;
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
		<tbody id="content">
		
		</tbody>

	</table>

	<hr>
	<script>
	drawList()
	function drawList(){
		
		const xhr = new XMLHttpRequest();
		xhr.open('get', 'json');
		xhr.send();
		xhr.onload = function(){
			console.log(xhr.responseText);
			
			const list = JSON.parse(xhr.responseText);
			console.log( list );
			
			const content = document.querySelector('#content');
			
/* 				let html1 = ''
 				html1 +=	`		<tr>`
				html1 +=	`			<th>`
				html1 +=	`				선택`
				html1 +=	`			</th>`
				html1 +=	`			<th>`
				html1 +=	`				번호`
				html1 +=	`			</th>`
				html1 +=	`			<th>`
				html1 +=	`				할일`
				html1 +=	`			</th>`
				html1 +=	`			<th>`
				html1 +=	`				날짜`
				html1 +=	`			</th>`
				html1 +=	`			<th>`
				html1 +=	`				모디파이 ㅋ`
				html1 +=	`			</th>`
				html1 +=	`			<th>`
				html1 +=	`				완료 여부`
				html1 +=	`			</th>`
				html1 +=	`			<th>`
				html1 +=	`				수정하기`
				html1 +=	`			</th>`
				html1 +=	`		</tr>` */
			for(let dto of list){
				const tr = document.createElement('tr');
				
				let html = ''
				html +=	`			<form method="post" action="todo">`
				html +=	`				<td><input type="checkbox" name="done" value="Y"></td>`
				html +=	`				<td>`
				html +=	`					<input type="hidden" value="\${dto.todo_id}" name="todo_id">`
				html +=	`					\${dto.todo_id}`
				html +=	`				</td>`
				html +=	`				<td>\${dto.todo}</td>`
				html +=	`				<td>\${dto.create_date}</td>`
				html +=	`				<td>\${dto.modify_date}</td>`
				html +=	`				<td>\${dto.done}</td>`
				html +=	`				<td>`
				html +=	`					<input type="hidden" name="command" value="update">`
				html +=	`					<input type="submit" value="수정">`
				html +=	`				</td>`
				html +=	`			</form>`
				
				tr.innerHTML = html;
				
				content.prepend(tr);
			}
			
		}
	}

</script>

</body>
</html>