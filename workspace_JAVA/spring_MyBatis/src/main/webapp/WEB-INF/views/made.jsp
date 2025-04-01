<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
*{
	font-size:30px;
}
</style>
</head>
<body>
	<form method="post" action="insert2">
		<table>
			<tr>
				<td>empno</td>
				<td><input type="number" name="empno"></td>
			</tr>
			<tr>
				<td>ename</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>job</td>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<td>mgr</td>
				<td><input type="number" name="mgr"></td>
			</tr>
			<tr>
				<td>hiredate</td>
				<td><input type="date" name="hiredate"></td>
			</tr>
			<tr>
				<td>sal</td>
				<td><input type="number" name="sal"></td>
			</tr>
			<tr>
				<td>comm</td>
				<td><input type="number" name="comm"></td>
			</tr>
			<tr>
				<td>deptno</td>
				<td>
					<select name="deptno" id="deptno">
						<option value="10">10</option>
						<option value="20">20</option>
						<option value="30">30</option>
						<option value="40">40</option>
					</select>
				</td>
			</tr>
		</table>
		<input type="submit" value="생성">
	</form>
</body>
</html>