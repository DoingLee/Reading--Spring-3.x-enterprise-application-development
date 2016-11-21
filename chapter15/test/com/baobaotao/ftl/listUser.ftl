<#import "spring.ftl" as spring />
<html>
	<head>
		<title>baobaotao</title>
	</head>
	<body>
		用户列表
		<table>
           <#list userList as user>
				<tr>
					<td>${user.userName}</td>
			        <td>${user.realName}</td>
				</tr>
           </#list>
		 <table>
	</body>
</html>
