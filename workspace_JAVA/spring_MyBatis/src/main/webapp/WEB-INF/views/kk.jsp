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
	<button id="btn">버튼ㅋㅋ</button>
	<div id="view">
		<table>
			<thead>
				<tr>
					<td>EMPNO</td>
					<td>ENAME</td>
					<td>JOB</td>
					<td>MGR</td>
					<td>HIREDATE</td>
					<td>SAL</td>
					<td>COMM</td>
					<td>DEPTNO</td>
				</tr>

			</thead>
			<tbody>
				<c:forEach var="item" items="${ list }">
					<tr>
						<td style="border: 1px solid black;">${ item.empno }</td>
						<td style="border: 1px solid black;">${ item.ename }</td>
						<td style="border: 1px solid black;">${ item.job }</td>
						<td style="border: 1px solid black;">${ item.mgr }</td>
						<td style="border: 1px solid black;">${ item.hiredate }</td>
						<td style="border: 1px solid black;">${ item.sal }</td>
						<td style="border: 1px solid black;">${ item.comm }</td>
						<td style="border: 1px solid black;">${ item.deptno }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>

<script>
	// 	document.querySelector('#btn').addEventListener('click', (e)=>{

	// 		const xhr = new XMLHttpRequest();
	// 		xhr.open('get', 'emp')
	// 		xhr.setRequestHeader('Content-Type', 'application/json')
	// 		xhr.send();
	// 		xhr.onload = function(){
	// 			console.log( JSON.stringify(xhr.responseText) )
	// 			console.log( JSON.parse(xhr.responseText) )

	// 			const jsonObj = JSON.parse(xhr.responseText);
	// 			console.log( JSON.stringify(jsonObj, null, 50) )
	// 			document.querySelector('#view').innerHTML = JSON.stringify(jsonObj, null, '\n');
	// 		}
	// // 			if(xhr.status === 200) {
	// // 		        // JSON 문자열을 객체로 변환
	// // 		        const jsonObj = JSON.parse(xhr.responseText);
	// // 		        // 객체를 다시 문자열로 변환(포맷팅 적용)
	// // 		        console.log(JSON.stringify(jsonObj, null, 2));
	// // 		    }
	// // 		}
	// 	})
</script>

</html>