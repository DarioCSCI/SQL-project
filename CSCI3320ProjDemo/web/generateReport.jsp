<%-- 
    Document   : generateReport
    Created on : Apr 22, 2021, 9:36:47 AM
    Author     : jacobhall
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Account History</title>
    </head>
    <body>
       <h1>Recycle Green Dollar Account History:</h1>
        <table>
            <thread>
                <th>Item</th>
                <th>Model</th>
                <th>Size</th>
                <th>Value</th>
                <th>Post Date</th>
                <th>Expiration Date</th>
                <th>Status</th>
            </thread>
            <c:forEach items="${items}" var="item">
                <tr>
                    <td>
                        <c:out value="${item.getItemType()}" />
                    </td>
                    <td>
                        <c:out value="${item.getItemValue()}" />
                    </td>
                    <td>
                        <c:out value="${item.getItemPostDate()}" />
                    </td>
                    <td>
                        <c:out value="${item.getItemExpirationDate()}" />
                    </td>
                    <td>
                        <c:out value="${item.getItemStatus()}" />
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
