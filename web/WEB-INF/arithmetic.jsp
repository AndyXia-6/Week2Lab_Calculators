<%-- 
    Document   : arithmatic
    Created on : Sep 25, 2020, 5:16:49 PM
    Author     : 762212
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form method="post" action="arithmetic">
            
        <label for="first">First: </label>
        <input type="number" id="first" name="first">
        <br>
        <br>
        <label for="second">Second: </label>
        <input type="number" id="second" name="second">
        <br>
        
        <input type="submit" value="+" name="addition">
        
        <p>Result:</p>  <p>${message}</p>
     
        </form>
        
        <div>
            <a href="AgeCalculator">Age Calculator</a>
        </div>
        
    </body>
</html>
