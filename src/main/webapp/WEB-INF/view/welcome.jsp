<%@ page import="org.springframework.web.context.request.SessionScope" %><%--
  Created by IntelliJ IDEA.
  User: poshyed2
  Date: 2017/6/27
  Time: 10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<%=session.getAttribute("userid")%>
<%=session.getAttribute("username")%>
<h1 style="align-content: center">welcome!</h1>
<a href="/user/usercenter">用户中心</a>
<a href="${pageContext.request.contextPath}/game/list">游戏列表</a>
<%--<a href=""--%>
<iframe id="mainframe" class="mainframe embed-responsive-item" name="mainframe" src="/usercenter/" __idm_frm__="27"></iframe>
</body>
</html>
