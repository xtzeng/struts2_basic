<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%String contextPath = request.getContextPath();%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
访问属性
	<a href="<%=contextPath %>/tags.action?username=u&password=p">tags</a>
	<a href="<%=contextPath %>/el.action?param1=1&param2=2">el表达式</a>
</body>
</html>