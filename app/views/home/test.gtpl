<html>
<head>
<title></title>
</head>
<body>
<form action="/login" method="post">
    用户名:<input type="text" name="username" value="{{.}}">
    密码:<input type="password" name="password" value="{{.}}">
    <input type="submit" value="Login">
</form>
</body>
</html>
