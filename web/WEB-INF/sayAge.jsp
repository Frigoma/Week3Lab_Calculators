<%-- 
    Document   : sayAge
    Created on : Sep 25, 2022, 7:41:02 AM
    Author     : fricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <br>
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>Your age next birthday will be ${userAge}</p>
        <a href="arithmeticCalculator">Arithmetic Calculator</a>
    </body>
</html>
