<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="update">
		<table>
			<tr>
				<td>empno</td>
				<td id="empno">${dto.empno }</td>
			</tr>
			<tr>
				<td>ename</td>
				<td id="ename">${dto.ename }</td>
			</tr>
			<tr>
				<td>sal</td>
				<td id="sal">${dto.sal }</td>
			</tr>
			<tr>
				<td>comm</td>
				<td id="comm">${dto.comm }</td>
			</tr>
		</table>
		<div>
			<button type="button" id="modify">수정</button>
		</div>
	</form>

</body>
<script>
	document.querySelector("#modify").addEventListener('click',(e)=>{
		let empno = document.querySelector("#empno").innerText
		let ename = document.querySelector("#ename")
		let sal = document.querySelector("#sal")
		let comm =document.querySelector("#comm")
		
		let a = ename.innerText
		let b = sal.innerText
		let c = comm.innerText
		console.log(a,b,c, ename,sal,comm, empno)
		
		ename.innerHTML = `<input type='text' name='ename' value='\${a}'>
							<input type='hidden' name='empno' value='\${empno}'>`
		sal.innerHTML = `<input type='text' name='sal' value='\${b}'>`
		comm.innerHTML = `<input type='text' name='comm' value='\${c}'>`
		
		let modify = document.querySelector("#modify")
		modify.parentNode.innerHTML = `<input type="submit" value="완료">`
		
	})
</script>
</html>