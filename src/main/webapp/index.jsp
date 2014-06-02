<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String context = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
使用通配符，将配置量降到最低<br />
<a href="<%=context %>/actions/Studentadd">添加学生</a>
<a href="<%=context %>/actions/Studentdelete">删除学生</a>
<br />
不过，一定要遵守"约定优于配置"的原则
<br />
<a href="<%=context %>/actions/Teacher_add">添加老师</a>
<a href="<%=context %>/actions/Teacher_delete">删除老师</a>
<a href="<%=context %>/actions/Course_add">添加课程</a>
<a href="<%=context %>/actions/Course_delete">删除课程</a>
</body>
</html>