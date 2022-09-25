<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 25, 2022, 8:45:33 AM
    Author     : fricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First:<input type="text" name="first" value="${userFirst}"><br>
            Second:<input type="text" name="second" value="${userSecond}"><br>
            <input type="submit" name="button" value="+">
            <input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*">
            <input type="submit" name="button" value="%">
        </form>
        <br>
        <p>${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
