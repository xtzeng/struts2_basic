<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
<html>
	<head>
		<title>Insert title here</title>
		<%@ include file="/common/meta.jsp"%>
	</head>
	<body>
		<s:form action="save" namespace="user">
			<table>
				<tr>
					<td>
						姓名
					</td>
					<td>
						<s:textfield name="user.username" />
					</td>
				</tr>
				<tr>
					<td>
						密码
					</td>
					<td>
						<s:password name="user.password" />
					</td>
				</tr>
				
				<tr>
					<td>
						UserId
					</td>
					<td>
						<s:textfield name="user.userId" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="saveButton" value="提交">
					</td>
				</tr>
			</table>
		</s:form>
	</body>
</html>
