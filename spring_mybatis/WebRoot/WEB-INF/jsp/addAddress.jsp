<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>AddAddress</title>
	</head>
	<body>
		<h2>添加地址</h2>
		<hr size="20" color="yellow">
		用户信息：姓名：${user.name}--年齡：${user.age}--电话：${user.phone}<br/>
		<a href="${pageContext.request.contextPath}/listUser.do">返回</a>
		<form action="${pageContext.request.contextPath}/addUserStepTwo.do" method="post">
			<table>
				<tr>
					<td>地址：</td>
					<td><input type="text" name="address" value="${address}"/></td>
				</tr>
				<tr>
					<td>邮编：</td>
					<td><input type="text" name="postCode" value="${postCode}"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="生成用户" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>