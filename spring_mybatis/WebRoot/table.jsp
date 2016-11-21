<%@ page language="java" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<title>DataTables example</title>
		<style type="text/css" title="currentStyle">
			@import "${pageContext.request.contextPath}/css/demo_page.css";
			@import "${pageContext.request.contextPath}/css/demo_table.css";
			@import "${pageContext.request.contextPath}/css/jquery-ui-1.8.6.custom.css";
		</style>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.3b1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
		<script type="text/javascript" charset="utf-8">
			$(document).ready(function() {
				$('#example').dataTable( {
					"oLanguage": {
						"sUrl": "css/cn.txt"
					},
					"bStateSave": true,
					//"bJQueryUI": true,   //使用jqueryui 。我用的时候显示的不是很好
					"sPaginationType": "full_numbers"//分页
				} );
			} );
		</script>
	</head>
	<body id="dt_example">
		<div id="container" align="center">
			<h1>物品种类管理</h1>
		<div id="demo">
		<table cellpadding="5" cellspacing="0" border="1" class="display" id="example" align="center">
			<thead>
				<tr>
					<th>物品编号</th>
					<th>物品名称</th>
					<th>物品单位</th>
					<th>编辑状态</th>
					<th>随便</th>
				</tr>
			</thead>
			<tbody>
				<tr class="gradeB">
					<td>Trident</td>
					<td>Internet Explorer 4.0</td>
					<td>Win 95+</td>
					<td class="center">4</td>
					<td class="center">X</td>
				</tr>
				<tr class="gradeA">
					<td>Trident</td>
					<td>Internet Explorer 5.0</td>
					<td>Win 95+</td>
					<td class="center">5</td>
					<td class="center">C</td>
				</tr>
				<tr class="gradeB">
					<td>Trident</td>
					<td>Internet Explorer 5.5</td>
					<td>Win 95+</td>
					<td class="center">5.5</td>
					<td class="center">A</td>
				</tr>
			</tbody>
			<tfoot>
			</tfoot>   
		</table>
		</div>       
		</div>
	</body>
</html>