<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>List of books</title>
</head>
<body>
<h1>List of books:</h1>

<table>
    <thead>
    <tr>
        <th>No.</th>
        <th>Id</th>
        <th>Author</th>
        <th>Title</th>
        <th>ISBN</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book">
        <tr>
            <%--<td>${status.index + 1}</td>--%>
            <td>${book.id}</td>
            <td>${book.author}</td>
            <td>${book.title}</td>
            <td>${book.isbn}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<td><a href="addBook.html">Add</a></td>

</body>
</html>
