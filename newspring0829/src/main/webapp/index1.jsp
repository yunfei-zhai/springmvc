<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
function ok(o){
	if(o.contentWindow.location.href.indexof("login")>0){
		open("login.html","_self")
	}
}
</script>
<style type="text/css">
.left{
height: 800px;
width: 15%;
}
.right{
height: 800px;
width: 85%;
position: absolute; left: 15%;top: 0;
}
</style>
</head>
<body>
<a href="outlogin">注销</a>
<div class="left">
<a href="student/select" target="iframe1">同学</a>
<br>
<a href="https://www.taobao.com" target="iframe1">淘宝</a>
</div>
<div class="right">
<iframe  src="student/select" name="iframe1" height="300px" onload="ok(this)"></iframe>
</div>

</body>
</html>