<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add a book</title>
    <link href="<c:url value="/resources/main.css?version=6" />" rel="stylesheet">
</head>

<body>
<h1>Add a book</h1>
<f:form method="post" modelAttribute="book">
    <div>Author: </div>
    <f:input path="author"/>
    <p>
        <f:errors path="author"/>
    </p>
    <div>Title: </div>
    <f:input path="title"/>
    <p>
        <f:errors path="title"/>
    </p>

    <div>ISBN: </div>
    <f:input path="isbn"/>
    <p>
        <f:errors path="isbn"/>
    </p>
    <button type="submit">Add</button>

</f:form>

</body>
</html>
