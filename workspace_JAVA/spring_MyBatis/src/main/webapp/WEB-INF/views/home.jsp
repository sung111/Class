<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>

<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<button id="btn">버튼ㅋㅋ</button>

	<P>The time on the server is ${serverTime}.</P>
		<a href="">상세정보</a>
</body>
<script>

	document.querySelector('#btn').addEventListener('click', (e)=>{
		
		const xhr = new XMLHttpRequest();
		xhr.open('get', 'emp')
		xhr.setRequestHeader('Content-Type', 'application/json')
		xhr.send();
		xhr.onload = function(){
			console.log( JSON.parse(xhr.responseText) )
		}
	})

</script>
</html>
