<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% String context = request.getContextPath(); %>

    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts Global_Results</title>
</head>
<body>
Result类型
<ol>
	<li><a href="user/user.action?type=1">返回success</a></li>
	<li><a href="user/user.action?type=2">返回error</a></li>
	<li><a href="user/user.action?type=3">返回global result</a></li>
	<li><a href="admin/admin.action">admin,继承user包</a></li>
</ol>

</body>
</html>