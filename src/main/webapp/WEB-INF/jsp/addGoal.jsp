<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 29/09/2014
  Time: 02:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
</head>
<body>
<form:form commandName="goal">
    <table>
        <tr>
            <td>Enter Minutes</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Set Goal"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
