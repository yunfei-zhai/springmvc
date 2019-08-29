<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="select" method="post">
<input name="txt">
<input type="submit" value="查询">
</form>
<table>
<tr><td>编号</td><td>姓名</td><td>性别</td><td>班级</td></tr>
<c:forEach items="${list}" var="s">
<tr><td>${s.id}</td><td>${s.name}</td><td>${s.sexsname}</td><td>${s.classname}</td></tr>
</c:forEach>
</table>
</body>
</html>