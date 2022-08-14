<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8"/>
		<title>用户注册</title>
	</head>
	<body>
		<form action="register/register" method="POST">
			<table>
				<caption align="center">注册</caption>
				<tr>
					<td><label>用户名</label></td>
					<td><input type="text" name="user.username" placeholder="请输入用户名" id="username"></td>
				</tr>
				
				<tr>
					<td><label>密码</label></td>
					<td><input type="password" name="user.password" placeholder="请输入密码" id="password"></td>
				</tr>
				
				<tr>
					<td><label>性别</label></td>
					<td>
						<input type="radio" name="user.gender" value="1">男
						<input type="radio" name="user.gender" value="2">女
					</td>
				</tr>
				
				<tr>
					<td><label>出生日期</label></td>
					<td><input type="date" name="user.birthday"> </td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="注册">
					</td>
				</tr>
				
			</table>
		</form>

	</body>
<script>


</script>
</html>
