<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title> <tiles:insertAttribute name="title" /> </title>
</head>
<body>
	<tiles:insertAttribute name="content" />
</body>
</html>