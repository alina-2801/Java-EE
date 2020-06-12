<%-- 
    Document   : add
    Created on : Apr. 15, 2020, 7:54:04 a.m.
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add JSP Page</title>
    </head>
    <body>
        <form action="add" method="POST">
            <p>ID: <input type="text" name="id" value="" /></p>
            <p>Full Name: <input type="text" name="name" value="" /></p>
            <p><input type="text" name="marks" value="" /></p>
            <p>  <input type="submit" value="Add to DB" name = "add"/></p>
        
        
        
        </form>
        
       
    </body>
</html>
