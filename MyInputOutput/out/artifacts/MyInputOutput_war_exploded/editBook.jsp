<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 11/28/16
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Book</title>
</head>
<body>
Please enter in the book's information.
<br><br>
<form name="updateBook" method="POST" action="/mvc_cust/updateBook"
      Title: <input type="text" name="title" value="<c:out value="${book.title}"/>" <br>
    Author: <input type="text" name="author" value="<c:out value="${book.author}"/>" <br>
    Publication Date: <input name="dateOfPublication" type="text" value="<c:out value="${book.dateOfPublication}"/>" <br>
    Genre: <input type="text" name="genre" value="<c:out value ="${book.genre}"/>" <br>
<input type="submit"
<br>
<a href="/mvc_cust/editBook">Edit book</a>
</body>
</html>
