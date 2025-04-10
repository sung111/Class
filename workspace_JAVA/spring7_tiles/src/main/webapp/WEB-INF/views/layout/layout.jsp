<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
.side {
	border: 1px solid red;
	display: inline-block;
	width: 20%;
}

.content {
	border: 1px solid red;
	display: inline-block;
	width: 78%;
	vertical-align: top;
}
</style>

</head>
<body>
	<!-- header -->
	<div>
		<tiles:insertAttribute name="header" />
	</div>

	<!-- main -->
	<div>
		<!-- side -->
		<div class="side">
			<tiles:insertAttribute name="side" />
		</div>
		<!-- content -->
		<div class="content">
			<tiles:insertAttribute name="content" />
		</div>
	</div>

	<!-- footer -->
	<div>
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>