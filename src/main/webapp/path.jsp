<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Path</title>
</head>
<body>
struts2中的路径问题是根据action的路径而不是jsp路径来确定，所以尽量不要使用相对路径。<br />
<a href="<%=basePath %>index.jsp">index.jsp</a>
<a href="index.jsp">首页</a>
<br />
虽然可以用redirect方式解决，但redirect方式并非必要。
<br />
解决办法非常简单，统一使用绝对路径。（在jsp中用request.getContextRoot方式来拿到webapp的路径）
<br />
或者使用myeclipse经常用的，指定basePath
</body>
</html>