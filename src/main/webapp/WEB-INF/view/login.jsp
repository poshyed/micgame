<%--
  Created by IntelliJ IDEA.
  User: poshyed2
  Date: 2017/6/27
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${massage}</h1>
<form style="align-content: center" action="/user/login" method="post" id="myform" >
    <input type="text" id="username" name="username"/>
    <input type="password" id="password" name="password"/>
    <input type="submit" value="提交" id="login" />
</form>
</body>
</html>
