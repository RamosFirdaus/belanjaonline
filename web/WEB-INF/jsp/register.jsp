<%-- 
    Document   : register
    Created on : 15-Dec-2017, 10:17:04
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Register Please</h1>
        <form:form action="register/save" modelAttribute="registerBean" method="POST">
            <table>
                <tr><td><form:label path="namaLengkap">Nama Lengkap</form:label></td>
                    <td><form:input path="namaLengkap"/></td></tr>
                <tr><td><form:label path="email">E-mail</form:label></td>
                    <td><form:input path="email"/></td></tr>
                <tr><td><form:label path="noTelp">No Telpon</form:label></td>
                    <td><form:input path="noTelp"/></td></tr>
                <tr><td><form:label path="userName">Username</form:label></td>
                    <td><form:input path="userName"/></td></tr>
                <tr><td><form:label path="password">Password</form:label></td>
                    <td><form:input path="password"/></td></tr>
                <tr><td></td><td><form:button name="submitButton" value="Submit">Submit</form:button></td></tr>
                </table>
        </form:form>
    </body>
</html>
