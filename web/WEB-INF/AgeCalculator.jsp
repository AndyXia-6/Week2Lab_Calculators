<%-- 
    Document   : test
    Created on : Sep 24, 2020, 1:49:11 PM
    Author     : 762212
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
        <br>
        <form method="post" action="AgeCalculator">
            <label for="age">Enter your age here: </label>
            <input type="number" id="age" name="age">
            
            <br>
            
            <p>${message}</p>
            
            <input type="submit" value="Age Next Birthday">
        </form>
        
    </body>
</html>
