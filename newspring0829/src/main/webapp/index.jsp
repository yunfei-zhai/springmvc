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
<script type="text/javascript">
function del(id){
	if(confirm("是否删除？")){
		open("delete?id="+id,"_self")
	}
}
</script>
<form action="select" method="post">
<input name="txt">
<input type="submit" value="查询">
</form>
<form action="add">
<input type="submit" value="新增">
</form>
<table>
<tr><td>编号</td><td>姓名</td><td>性别</td><td>班级</td><td>操作</td></tr>
<c:forEach items="${list}" var="s">
<tr><td>${s.id}</td><td>${s.name}</td><td>${s.sexsname}</td><td>${s.classname}</td>
<td><a href="edit?id=${s.id}">编辑</a><a href="javascript:del(${s.id})">删除</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>