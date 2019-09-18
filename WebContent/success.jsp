<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table  border="1" width="700">
		<tr align="center">
			
			<td>用户名</td>
			<td>性别</td>			
			<td>操作</td>
		</tr>
		
		<c:forEach items="${list }" var="stu">
		
			<c:if test=""></c:if>
			<tr align="center">
				
				<td>${stu.name }</td>
				
				<td>${stu.sex }</td>
				
				<td><a href="toupdate.do?id=${stu.id}">更新</a>   <a href="delete.do?id=${stu.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>