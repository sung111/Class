<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 액션태그 -->
<!--
	class 의 클래스를 생성해서
	id를 key로
	scope 에 setAttribute 해줌
	scope 속성을 생략하면 page가 기본값
-->

<jsp:useBean id="dto" class="kr.or.human.a.MemberDTO" scope="page"></jsp:useBean>
<jsp:setProperty name="dto" property="id" value="idid" />
<!-- 함수를 실행해서 console에 찍기 -->
\${ dto.id } : ${ dto.id }<br>
\${ dto["id"] } : ${ dto["id"] }<br>

<jsp:setProperty name="dto" property="pw" value='<%= request.getParameter("pw") %>' />
<jsp:setProperty name="dto" property="pw" value="${ param.pw }" />
jsp:getProperty ::: <jsp:getProperty name="dto" property="pw" /><br>


<jsp:useBean id="dto4" class="kr.or.human.a.MemberDTO" scope="page"></jsp:useBean>
<jsp:setProperty name="dto4" property="*" /><br>
${ dto4.id }<br>
${ dto4.pw }<br>


</body>
</html>