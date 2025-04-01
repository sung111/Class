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
<style>
* {
	font-size: 30px;
}

#popup {
	border: 1px solid blue;
	width: 300px;
	height: 500px;
	position: absolute;
	top: 50px;
	left: 500px;
	box-shadow: 0 10px 500px 0 rgba(0, 0, 0, 0.4);
}

#popup .title {
	background-color: #888;
	color: white;
}

#popup .content {
	background-color: white;
}

#dim {
	width: 100vw;
	height: 100vh;
	background-color: rgba(172, 172, 172, 0.5);
	position: absolute;
	top: 0;
	left: 0;
	/* 	backdrop-filter : blur(5px); */
}
</style>

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
					<td style="border: 1px solid black;">${dto.empno}</td>
					<td style="border: 1px solid black;"><a
						href="resultt?empno=${ dto.empno }">${dto.ename}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="insert"><button type="button">생성</button></a>
	<button type="button" id="btn">진동</button>
	<div id="view"></div>

<!-- 	<div id="dim"> -->
<!-- 		<div id="popup"> -->
<!-- 			<div class="title">제목</div> -->
<!-- 			<div class="content"> -->
<!-- 				내용<br> 내용 -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->

	<script>
		document.querySelector('#btn').addEventListener('click', (e)=>{
			if(navigator.vibrate){
				navigator.vibrate(1000) // ms단위
			} else {
				alert('음슴');
			}
		})
		
		if(screen.orientation){
			screen.orientation.addEventListener('change', ()=>{
				document.querySelector('#view').innerHTML = `
					type :  \${screen.orientation.type} < br>
					angle :  \${screen.orientation.angle}
				`
			})
		}
		
// 		타이틀에서 왼쪽버튼을 누르면 왼쪽버튼이 눌렸다는걸 저장.
// 		타이틀에서 왼쪽버튼을 떼면 떨어진걸 저장
// 		마우스 최초로 눌렀을때 마우스 위치값저장
		let isDragable = false;
		let offsetX = 0;
		let offsetY = 0;
		document.querySelector('.title').addEventListener('mousedown', (e)=>{
			isDragable = true;
			console.log(isDragable)
			
			document.querySelector('#view').innerHTML=`
				x:\${e.clientX}<br>
				y:\${e.clientY}<br>
			`
			offsetX = e.clientX
			offsetY = e.clientY
		})
		document.querySelector('.title').addEventListener('mouseup', (e)=>{
			isDragable = false;
		})
		document.querySelector('.title').addEventListener('mousemove', (e)=>{
			console.log(isDragable)
			if(isDragable){
				let diff_X = e.clientX - offsetX
				let diff_Y = e.clientY - offsetY
				
// 				console.log( document.querySelector('#popup').style.top  )
				console.log( document.querySelector('#popup').offsetTop  )
				let popup = document.querySelector("#popup");
				
				popup.style.top = (popup.offsetTop + diff_Y)+'px'
				popup.style.left = (popup.offsetLeft + diff_X)+'px'
				
				offsetX = e.clientX
				offsetY = e.clientY
			}
		})

	</script>
</body>
</html>