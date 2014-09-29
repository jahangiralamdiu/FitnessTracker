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
    <title>Add Minutes</title>
    <script type="text/javascript" src="jquery-1.11.1.js"></script>

    <script type="text/javascript">

        $(document).ready(
          function(){
              $.getJSON('http://localhost:8080/activities.json',
                      {
                          ajax: 'true'
                      }, function(data){
                          var html = '<option value="">--Please select one--</option> ';
                          var len = data.length;
                          for(var i=0; i<len; i++)
                          {
                              html+= '<option value="'+data[i].desc+'">'+data[i].desc+'</option>';
                          }
//
                          $('#activities').html(html);
                      });
          });

    </script>
</head>
<body>

Language : <a href="?language=en">English</a> | <a href="?language=es">Spanish</a>

<form:form commandName="exercise">

    <table>
        <tr>
            <td><spring:message code="goal.text"/> </td>
            <td>
                <form:input path="minutes"/>
            </td>
            <td>
                <form:select id="activities" path="activity"/>
            </td>
        </tr>

        <tr>
            <td colspan="3">
                <input type="submit" value="Add"/>
            </td>
        </tr>

    </table>

</form:form>
<h3>The target is ${goal.minutes}</h3>
</body>
</html>
