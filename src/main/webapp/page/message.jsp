<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>上传成功</title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
  </head>
  
  <body>
    上传成功！
    <br/><br/>
    <!-- ${pageContext.request.contextPath} tomcat部署路径，
          如：D:\apache-tomcat-6.0.18\webapps\struts2_upload\ -->
    <img src="../photos/<c:out value="${imageFileName}"/>">

  </body>
</html>