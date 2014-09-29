<%--
  Created by IntelliJ IDEA.
  User: jahangiralamdiu
  Date: 28/09/2014
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form commandName="exercise">

    <table>
        <tr>
            <td><spring:message code="goal.text"/> </td>
            <td>
                <form:input path="minutes"/>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Add"/>
            </td>
        </tr>

    </table>

</form:form>

</body>
</html>
