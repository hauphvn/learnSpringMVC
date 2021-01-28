<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <%--@elvariable id="fresher" type=""--%>
    <form:form action="dashboard" method="post" modelAttribute="fresher" cssStyle="justify-content: center;
    display: flex;">
        <table>
            <tr>
                <td>
                    <form:label path="username">Username</form:label>
                </td>
                <td>
                    <form:input path="username" name="username" id="username"/>
                </td>
            </tr>
            <tr>
                <td>
                    <form:label path="password">Password</form:label>
                </td>
                <td>
                    <form:input path="password" name="password" id="password"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><form:button name="login" id="login">Login</form:button></td>
            </tr>

        </table>
    </form:form>
        <c:if test="${param['error']}"><p style="text-align: center;">Mật khẩu/Tên đăng nhập không đúng<p></p></c:if>
</div>
</body>
</html>
