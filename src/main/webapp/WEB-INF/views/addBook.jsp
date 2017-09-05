<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add new record</title>
    <link href="<c:url value="/resources/main.css" />" rel="stylesheet">
</head>

<body>
<div>ADD NEW RECORD</div>
<div>
<f:form method="post" modelAttribute="book">
    <div id="labelForInput">Author: </div>
    <f:input path="author" cssErrorClass="inputError"/>
    <p><f:errors path="author" cssClass="textError"/></p>

    <div id="labelForInput">Title: </div>
    <f:input path="title" cssErrorClass="inputError"/>
    <p><f:errors path="title" cssClass="textError"/></p>

    <div id="labelForInput">ISBN: </div>
    <f:input path="isbn" cssErrorClass="inputError"/>
    <p><f:errors path="isbn" cssClass="textError"/></p>

    <div><button type="submit">Add</button></div>
    <div><button onclick="location.href='allBooks.html'" type="button">Back to the list page</button></div>
</f:form>
</div>
</body>
</html>
