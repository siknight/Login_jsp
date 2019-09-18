<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="jquery-1.11.1.min.js"></script>
<title>首页</title>

<style type="text/css">
	
</style>
  
</head>
<body>
	<div style="text-align: center;border:1px solid black;width:300px;margin:0 auto;margin-top:50px">
	        <h3>${username_r }</h3>
			<h2><span><button id="login_page">登录页面</button></span><span><button id="register_page">注册页面</button></span></h2>
			<form id="login_f" method="post" action="login.do">
				<p>用户名：<input  type="text" placeholder="请输入用户名" name="username"></p>
				<p>密&nbsp;&nbsp;&nbsp;&nbsp码 :<input type="password" placeholder="请输入密码" name="password"></p> 
				
				<input type="submit" value="登录" class="su">
			
			</form>
		
		
		<form id="login_r" method="post" action="register.do">
				<p>用户名:<input  type="text" placeholder="请输入用户名" name="username"></p>
				<p>密&nbsp;&nbsp;&nbsp;码:<input type="password" placeholder="请输入密码" name="password"></p> 
				<p><input type="radio" name="sex" value="男" checked>男 <input type="radio" value="女" name="sex">女 </p>
				
				<input type="submit" value="注册" class="su">
			
			</form>
		
		</div>
		
		<script type="text/javascript">
			$(function(){
				
				$("#login_f").show();
				$("#login_r").hide();
			});
			$("#login_page").click(function(){
				
				$("#login_f").show();
				$("#login_r").hide();
			});
			
			$("#register_page").click(function(){
				
				$("#login_f").hide();
				$("#login_r").show();
			});
		</script>
</body>
</html>