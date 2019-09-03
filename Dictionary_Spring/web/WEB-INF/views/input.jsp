<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: SonHT
  Date: 9/3/2019
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Searching for the words</title>
</head>
<body>
<form:form method="post" action="output" modelAttribute="output">
    <form:input path="word"/>
    <form:button>Search</form:button>
</form:form>
</body>
</html>
