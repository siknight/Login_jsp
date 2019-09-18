<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
<title>修改页面</title>

<style type="text/css">
	
</style>
  
</head>
<body>
	<div style="text-align: center;border:1px solid black;width:300px;margin:0 auto;margin-top:50px">
	          <h3>${username_r }</h3>
			<h2><span><button >修改页面</button></span></h2>
			<form id="login_f" method="post" action="update.do">
				<p>用户名：<input  type="text" placeholder="请输入用户名" name="username" value="${stud.name }"></p>
				<p>密&nbsp;&nbsp;&nbsp;&nbsp码 :<input type="password" placeholder="请输入密码" name="password"></p>
			 
				
				<p><input type="radio" name="sex" value="男" checked>男 <input type="radio" value="女" name="sex">女 </p>
				<p hidden><input type="text" name="id" value="${stud.id}"></p> 
				<input type="submit" value="修改" class="su">
			
			</form>
		
		
		
		</div>
		
		
</body>
</html>