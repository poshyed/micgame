<%--
  Created by IntelliJ IDEA.
  User: poshyed2
  Date: 2017/6/27
  Time: 13:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户中心</title>
</head>
<body>
<form action="/user/changeaccount" method="post">
    <input type="text" id="username" name="username"/>
    <input type="password" id="password" name="password"/>
    <input type="submit" value="提交" id="change" />
</form>
</body>
</html>
