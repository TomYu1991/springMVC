<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/2
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<div>

</div>
<form action="/login.action" method="post">
    <label for="username">用户名：</label>
    <input type="text" name="username" id="username">
    <label for="password">密码</label>
    <input type="password" name="password" id="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
