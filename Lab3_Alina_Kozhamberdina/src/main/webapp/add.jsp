<%-- 
    Document   : add
    Created on : Mar. 25, 2020, 1:37:02 p.m.
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Pets</title>
    </head>
    
    <body>
        <form action="add" method="POST">
     
        <h1>Add A New Pet</h1>
        <p>ID: <input type="text" name="id" value="" /></p>
        <p>Name:<input type="text" name="name" value="" /> </p>
        <p>Age: <input type="number" name="age" value="" /></p>
        <p>Type: <select name="type">
                <option checked = "">  </option>
                <option>Dog</option>
                <option>Cat</option>
                <option>Tiger</option>
                <option>Lion</option>
                <option>Elephant</option>
            </select></p>
            <p> <input type="submit" value="Add A New Pet" /></p>
             </form>
        <p><a href="index.html">Go Back </p>
          
    </body>
</html>
