<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<style type="text/css" title="currentStyle">
			@import "${pageContext.request.contextPath}/css/demo_page.css";
			@import "${pageContext.request.contextPath}/css/demo_table.css";
			@import "${pageContext.request.contextPath}/css/jquery-ui-1.8.6.custom.css";
		</style>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.3b1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.tablesorter.js"></script>
		<script type="text/javascript">
			function ajaxUser(){
				/*$.each( { name: "John", lang: "JS" }, function(i, n){
				  alert( "Name: " + i + ", Value: " + n );
				});*/
				getResponseJson();
				$("#name").val("");
				$("#age").val("");
				$("#phone").val("");
			}
			
			function getResponseJson(){
				var param = "name="+$('#name').val()+"&age="+$('#age').val()+"&phone="+$('#phone').val()+"";
				var url = "ajaxGetUser.do?"+param;
				//alert(param);
				$.getJSON(url, function(json){
					//alert(json);
					createTbody(json);
				});
			}
			
			function createTbody(json){
				var tableBody = $("tbody");
				tableBody.html("");
				var htm = "<tbody>";
				//处理JSON对象i=索引,n=内容
				$.each(json,function(i, n){
					if(i%2==0){
						tableBody.append('<tr class="gradeX"></tr>'); 
					}else{
						tableBody.append('<tr class="gradeC"></tr>'); 
					}
			　　		var tr = $('tr:last', tableBody); 
					var uid = json[i].uid;
			　　		tr.append('<td>' + uid + '</td>'); 
			　　		tr.append('<td>' + json[i].name + '</td>'); 
			　　		tr.append('<td>' + json[i].age + '</td>'); 
			　　		tr.append('<td>' + json[i].phone + '</td>'); 
			　　		tr.append("<td><a href=\"${pageContext.request.contextPath}/toUpdateUser.do?uid="+uid+"\">更新</a>|"+
									"<a href=\"${pageContext.request.contextPath}/deleteUser.do?uid="+uid+"\">删除</a>|"+
									"<a href=\"${pageContext.request.contextPath}/toAddNewAddress.do?uid="+uid+"\">添加新地址</a></td>");
				});
				fillTable();
			}
			
			function fillTable(){
                var oTable = $('#myTable').dataTable({   
                    "bProcessing": true,   
                    "bLengthChange": false,					//用户不可改变每页显示数量
                    "sPaginationType": "full_numbers",   
                    "oLanguage": { "sSearch": "Search the nominees:" },   
                    "iDisplayLength": 5,   
                    "bFilter": false,//搜索栏
                    "aaSorting":[],  //不加,浏览器(FireFox)会有 oColumn undefineded
                    "bRetrieve": true,
                    "bDestroy": true,
                    "oLanguage": {     
                        "sLengthMenu": "每页显示 _MENU_ 条记录",   
                        "sZeroRecords": "没有检索到数据",   
                        "sInfo": "当前数据为从第 _START_ 到第 _END_ 条数据；总共有 _TOTAL_ 条记录",   
                        "sInfoEmtpy": "没有数据",   
                        "sProcessing": "正在加载数据...",   
                        "oPaginate": {   
                            "sFirst": "首页",   
                            "sPrevious": "前页",   
                            "sNext": "后页",   
                            "sLast": "尾页"  
                        }   
                    }   
                }); 
			}
			
		</script>
		<title>ListUser</title>
	</head>
	<body onload="fillTable();">
		<h2>
			显示用户
		</h2>
		<hr size="20" color="yellow">
		<a href="${pageContext.request.contextPath}/addUser.do">添加用户</a>
		<div>
			
			<c:choose>
				<c:when test="${empty users}">
					尚无用户，请添加！
				</c:when>
				<c:otherwise>
					<table cellpadding="5" cellspacing="0" border="1" class="display"
						id="myTable" align="center" style="background: #ffffcc">
						<thead>
							<tr align="center">
								<th></th>
								<th><input type="text" id="name" name="name"/></th>
								<th><input type="text" id="age" name="age"/></th>
								<th><input type="text" id="phone" name="phone"/></th>
								<th><input type="button" name="submit" value="查询" onclick="ajaxUser();"/></th>
							</tr>
							<tr align="center">
								<th>ID</th>
								<th>姓名</th>
								<th>年龄</th>
								<th>电话</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody align="center">
							<c:forEach var="user" items="${users}" varStatus="count">
								<c:choose>
									<c:when test="${count.count%2==0}">
										<tr class="gradeX">
									</c:when>
									<c:otherwise>
										<tr class="gradeC">
									</c:otherwise>
								</c:choose>
									<td>${user.uid}</td>
									<td>${user.name}</td>
									<td>${user.age}</td>
									<td>${user.phone}</td>
									<td>
										<a href="${pageContext.request.contextPath}/toUpdateUser.do?uid=${user.uid}">更新</a>|
										<a href="${pageContext.request.contextPath}/deleteUser.do?uid=${user.uid}">删除</a>|
										<a href="${pageContext.request.contextPath}/toAddNewAddress.do?uid=${user.uid}">添加新地址</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					
				</c:otherwise>
			</c:choose>
		</div>
	</body>
</html>