<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 10;
	/* pageContext, request, session, application */
	pageContext.setAttribute("a1", a);
	
	int b = 20;
%>

\${ a } : ${ a }<br>
\${ a1 } : ${ a1 }<br>

<c:set var="b1" value="<%= b %>" scope="page"></c:set>
\${ b1 } : ${ b1 }<br>

<c:set var="id" value="idid" scope="page"></c:set>
<c:set var="id2" value="${ id }"></c:set>
<%
System.out.println( pageContext.getAttribute("id2") );
%>

<!-- 우선순위 page > request > session > application 순으로 찾음 // 없으면 null -->
<c:set var="game" value="LOL" scope="page"></c:set>
<c:set var="game" value="Overwatch" scope="request"></c:set>
<c:set var="game" value="SuddenAttack" scope="session"></c:set>
<c:set var="game" value="LostArk" scope="application"></c:set>
\${ game } : ${ game }<br>
pageScope : ${ pageScope.game }<br>
requestScope : ${ requestScope.game }<br>
sessionScope : ${ sessionScope.game }<br>
applicationScope : ${ applicationScope.game }<br>
<hr>
<c:if test="true"> <strong>항 참</strong> </c:if><br>
<c:if test="flase"> <strong>항 불</strong> </c:if><br>
<c:if test="${ game eq 'LOL' }"> <strong>LOL</strong> </c:if><br>
<c:if test="${ requestScope.game ne 'LOL' }"> <strong>LOL아님ㅋㅋ</strong> </c:if><br>
<c:if test="${ not (game ne 'LOL') }"> <strong>LOL</strong> </c:if><br>

<c:choose>
	<c:when test="${ game eq 'LOL' }">gd</c:when>
	<c:when test="${game eq 'Overwatch' }">zz</c:when>
	<c:otherwise> 게임 좀 하자!</c:otherwise>
</c:choose>
<hr>
<%
	List list = new ArrayList();
	for(int i = 0 ; i < 10 ; i++){
		Map map = new HashMap();
		map.put("사번", 100 + (i * i) );
		map.put("이름", "이름" + i );
		map.put("나이", 20 + i );
		
		list.add(map);
		
		
	}

%>
<!-- el  태그로 사용할수있게 메모리의 띄어놓기 시전 -->
<c:set var="list2" value="<%= list %>" />
<c:forEach var="emp" items="${ list2 }" >
	사번 : ${ emp.사번 }<br>
	이름 : ${ emp.이름 }<br>
	나이 : ${ emp.나이 }<br><hr>
</c:forEach>
<c:forEach var="i" begin="0" end="10">
	i : ${ i }<br>
</c:forEach>

<hr>

<c:forEach var="i" begin="0" end="10" step="3">
	i : ${ i }<br>
</c:forEach>

<hr>

<c:forEach var="i" begin="0" end="10" step="3" varStatus="loop">
	i : ${ i }<br>
	loop.index : ${ loop.index }<br>
	loop.count : ${ loop.count }<br>
	loop.first : ${ loop.first }<br>
	loop.last : ${ loop.last }<br>
</c:forEach>

<hr>

items 랑 begin, end 같이 사용가능<br>
end가 items 개수보다 커도 items 만큼만 돌고 오류가 없음<br>
<c:forEach var="map" items="${list2}" begin="0" end="15" step="3">
	${map}<br>
</c:forEach>

<hr>
<a href="/jstl.jsp?name=한글">click me</a><br>
param.name : ${ param.name }<br>
<c:url var="url2" value="/jstl.jsp">
	<c:param name="a" value="한글"></c:param>
</c:url>
<a href="${url2}"> url 2 </a>
<br>
c:url을 사용하는 이유<br>
<ol>
	<li>영어나 숫자 외의 한글이나 특수문자를 encode 해줌</li>
	<li>context path 자동추가 (/proj4_forward) </li>
	<li>쿠키 금지일때 ;jsessionid= 을 자동으로 붙여줌</li>
</ol>
<hr>
<c:set var="hack" value="<strong>abc</strong><script>alert(1)</script>"></c:set>
${hack}님환영합니다.<br><br><br>

c:out을 사용하는이유는 <br>
특수문자를 치환해서 문자 그 그체로 출력하게 해줌<br>
즉. innerText처럼 나오게함.<br>
<c:out value="${hack}"></c:out>





</body>
</html>