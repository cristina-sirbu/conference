<%--
  Created by IntelliJ IDEA.
  User: p3700556
  Date: 12/05/2020
  Time: 08:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
    <style>
        .error {
            color: #ff0000
        }
        .errorBlock {
            collor: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
    <h1>Registration</h1>
    <form:form modelAttribute="registration">
        <form:errors path="*" cssClass="errorBlock" element="div" />
        <table>
            <tr>
                <td>
                    <spring:message code="name" />:
                </td>
                <td>
                    <form:input path="name" />
                </td>
                <td>
                    <form:errors path="name" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Add registration">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
