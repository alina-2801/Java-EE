<%-- 
    Document   : index1
    Created on : Feb. 14, 2020, 4:11:57 p.m.
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP</title>
    </head>
    <body>
        <h1>Phones I have used</h1>
        <form action="main" method="POST">
       <p>Enter a phone below</p>
       <p>Model: <input type="text" name="model" value="" required /></p>
        <p>Year: <input type="number" name="year" value="" required/></p>
        <p>Price: <input type="number" name="price" value="" required /></p>
        <p>Notes: <input type="text" name="note" value="" required/></p>
        <p><input type="submit" value="Add to list" name ="add"required/></p>
        </form>
        
    </body>
</html>
