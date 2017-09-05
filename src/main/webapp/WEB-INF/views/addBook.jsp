<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add a book</title>
    <link href="<c:url value="/resources/main.css" />" rel="stylesheet">
    <style>
        .textError{
            color: red;
        }
        .inputError{
            border: double;
        }
        button{
            border: dotted;
            color: blue;
        }
    </style>
</head>

<body>
<h1>Add a book</h1>
<f:form method="post" modelAttribute="book">
    <div>Author: </div>
    <f:input path="author" cssErrorClass="inputError"/>
    <p>
        <f:errors path="author" cssClass="textError"/>
    </p>
    <div>Title: </div>
    <f:input path="title" cssErrorClass="inputError"/>
    <p>
        <f:errors path="title" cssClass="textError"/>
    </p>

    <div>ISBN: </div>
    <f:input path="isbn" cssErrorClass="inputError"/>
    <p>
        <f:errors path="isbn" cssClass="textError"/>
    </p>
    <button type="submit">Add</button>

</f:form>

</body>
</html>
