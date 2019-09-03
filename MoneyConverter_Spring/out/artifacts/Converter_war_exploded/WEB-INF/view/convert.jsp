<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form:form method="post" action="rateConverted" modelAttribute="rateConverted">
    <tr>
        <td><form:label path="firstCurrencyValue">First Currency Value</form:label></td>
        <td><form:input path="firstCurrencyValue"/></td>

        <td><form:select path="firstCurrency"></td>
        <form:option value="VND"/>
        <form:option value="USD"/>
        <form:option value="EUR"/>
        </form:select>
    </tr>
    <tr>
        <td><form:select path="secondCurrency"></td>
        <form:option value="VND"/>
        <form:option value="USD"/>
        <form:option value="EUR"/>
        </form:select>
    </tr>
    <tr>
        <form:button>Submit</form:button>
    </tr>
</form:form>
</body>
</html>