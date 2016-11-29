<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 11/28/16
  Time: 2:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
     <title>Books</title>
    </head>

    <body>
        What is the latest book you read?
        <br><br>
        Title: <c:out value="${book.title}" /> <br>
        Author: <c:out value="${book.author}" /> <br>
        Publication Date: <c:out value="${book.dateOfPublication}" /> <br>
        Genre: <c:out value ="${book.genre}" />
        <br><br>
        <a href="/mvc_cust/editBook">Edit book</a>
    </body>
</html>
