<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REGISTRY</title>
</head>
<body>
<div style="display: flex; justify-content: center;">
    <%--@elvariable id="fresher" type="com.coderzero.model"--%>
    <form:form action="userRegistry" method="post" modelAttribute="fresher">
        <table>
            <tr>
                <td><form:label path="name">Name</form:label></td>
                <td><form:input path="name" name="name" id="name"/></td>
            </tr>
            <tr>
                <td><form:label path="username">Username</form:label></td>
                <td><form:input path="username" name="username" id="username"/></td>
            </tr>
            <tr>
                <td><form:label path="password">Password</form:label></td>
                <td><form:input path="password" name="password" id="password"/></td>
            </tr>
            <tr>
                <td><form:label path="location">Location</form:label></td>
                <td><form:input path="location" name="location" id="location"/></td>
            </tr>
            <tr>
                <td></td>
                <td><form:button name="registry" id="registry">Registry</form:button></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
