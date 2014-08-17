<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<style type="text/css">
<!--
body {
	background-color: #939292;
}
-->
a {font-size: 12pt; text-decoration: none}
</style>
	<body>
		<center>
			<br><br>
			<table>
				<tr>
					<td><s:text name="language" />:</td>
					<td>
						<a href="changeLocale.action?key=1"><s:text name="chinese" /> </a>
						<a href="changeLocale.action?key=0"><s:text name="english" /> </a>
					</td>
				</tr>
			</table>
			<h1><s:property value="%{getText('login')}" /></h1>
			<s:actionerror/>
			<s:form action="login">
			<s:textfield name="u.name" key="username"/>
			<s:password name="u.psw" key="password"/>
			<s:submit key="submit"/>
			</s:form>
		</center>
	</body>
</html>