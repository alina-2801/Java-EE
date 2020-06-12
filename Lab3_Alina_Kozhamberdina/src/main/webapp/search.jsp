<%-- 
    Document   : search
    Created on : Mar. 25, 2020, 1:37:19 p.m.
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search for pets</title>
    </head>
   
    <body>
         <form action="search" method="POST">
        <h1>Search for pets</h1>
        <p>Type:<select name="type"> 
                <option checked =""> </option>
                <option>Dog</option>
                <option>Cat</option>
                <option>Tiger</option>
                <option>Lion</option>
                <option>Elephant</option>
            </select> </p>
            <p>Min Age (if empty, then 0) <input type="text" name="maxage" value="" /> </p>
            <p>Max Age(if empty, then 100) <input type="text" name="minage" value="" /> </p>
            <p> <input type="submit" value="Search for pets" /></p>
             </form>
            <p><a href="index.html">Go Back </p>
           
    </body>
    
</html>
