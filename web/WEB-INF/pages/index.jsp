<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/21 0021
  Time: 下午 4:11
  To change this template use File | Settings | File Templates.

  Something important:
  1 Needs to modify the original page: $Title$ to ${Title} $END$ to ${END}
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>System Login</title>
</head>
<body>
<h1>Pokemon Administration</h1>
<h2>Log in</h2>
<form:form action="/login" method="post" modelAttribute="user">
  <table>
    <tr>
      <td><form:label path="name">name</form:label></td>
      <td><form:input path="name"/></td>
    </tr>
    <tr>
      <td><form:label path="password">password</form:label></td>
      <td><form:input path="password"></form:input></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>
</form:form>
<br/>
</body>
</html>

