<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>AddNewAddress</title>
	</head>
	<body>
		<h2>添加地址</h2>
		<hr size="20" color="yellow">
		用户信息：${user.uid}--${user.name}--${user.age}--${user.phone}<br>
		<a href="${pageContext.request.contextPath}/listUser.do">返回</a>
			<table border="1">
				<tr>
					<td align="center" colspan="5">已经存在的地址</td>
				</tr>
				<c:forEach items="${user.addrs}" var="addr" varStatus="count">
					<tr>
						<td align="center">${count.count}</td>
						<td align="right">地址：</td>
						<td align="left">${addr.address}</td>
						<td align="right">邮编：</td>
						<td align="left">${addr.postCode}</td>
					</tr>
				</c:forEach>
			</table>
		<form action="${pageContext.request.contextPath}/addNewAddress.do" method="post">
			<table>
				<tr>
					<td>地址：</td>
					<td><input type="text" name="address"/></td>
				</tr>
				<tr>
					<td>邮编：</td>
					<td><input type="text" name="postCode"/></td>
				</tr>
				<tr>
					<td><input type="hidden" name="uid" value="${user.uid}"/></td>
					<td colspan="2" align="center"><input type="submit" value="完成添加" /></td>
				</tr>
			</table>
		</form>
	</body>
</html>