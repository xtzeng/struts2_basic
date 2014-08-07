<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts 2 Form Tags - Edit Person</title>

</head>
  
  <body>
<h1>Update Information</h1>

<p>Use the form below to edit your information.</p>

<s:form action="save" method="post" id="formId" name="formName">
<s:textfield key="personBean.firstName" /> 
<s:textfield key="personBean.lastName" /> 
<s:select key="personBean.sport" list="sports" />
<s:radio key="personBean.gender" list="genders" />
<s:select key="personBean.residency" list="states" listKey="stateAbbr" listValue="stateName" />
<s:checkbox key="personBean.over21" />
<s:checkboxlist key="personBean.carModels" list="carModelsAvailable"  />
<s:submit key="submit" />
</s:form>
  </body>
</html>
