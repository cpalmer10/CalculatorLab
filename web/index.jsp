<%-- 
    Document   : index
    Created on : Jan 30, 2017, 12:30:40 PM
    Author     : Chris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator!</h1>
        <form id=”calculatorForm” name=”calculatorForm” method=”POST” action=”calculate”>
            Enter Width: <input type="text" name="width" value="">
            Enter Length: <input type="text" name="length" value="">
            <br>          
            <input type="submit" name="submit" value="Submit">
        </form>
        
        
    </body>
</html>
