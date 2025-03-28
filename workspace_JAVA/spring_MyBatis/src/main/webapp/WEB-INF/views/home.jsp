<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>
<button id="btn">버튼ㅋㅋ</button>

<P>  The time on the server is ${serverTime}. </P>
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
