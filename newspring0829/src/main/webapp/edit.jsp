<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${info==null}">
<form action="student/insert" method="post">
<input name="name">
<select name="sex">
<c:forEach items="${sexs}" var="r" varStatus="v">
<option value="${v.index}">${r}</option>
</c:forEach>
</select>
<select name="classid">
<c:forEach items="${myclass}" var="c">
<option value="${c.classid}">${c.classname}</option>
</c:forEach>
</select>
<input type="submit">
</form>
</c:if>

<c:if test="${info!=null}">
<form action="update" method="post">
<input name="id" type="hidden" value="${info.id}">
<input name="name" value="${info.name}">
<select name="sex">
<c:forEach items="${sexs}" var="r" varStatus="v">
<option value="${v.index}" <c:if test="${info.sex==v.index}">selected="selected"</c:if>>${r}</option>
</c:forEach>
</select>
<select name="classid">
<c:forEach items="${myclass}" var="c">
<option value="${c.classid}" <c:if test="${info.classid==c.classid}">selected="selected"</c:if>>${c.classname}</option>
</c:forEach>
</select>
<input type="submit">
</form>
</c:if>
</body>
</html>