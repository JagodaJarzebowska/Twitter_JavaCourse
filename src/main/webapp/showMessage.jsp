<%@ page import="com.sda.twitter.Message" %><%--
  Created by IntelliJ IDEA.
  User: jagod
  Date: 26.08.2018
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Message</title>
</head>
<body>
<p>Message:<%=((Message)request.getAttribute("message")).getContent()%></p>
<p>Author:<%=((Message)request.getAttribute("message")).getAuthor()%></p>

</body>
</html>
