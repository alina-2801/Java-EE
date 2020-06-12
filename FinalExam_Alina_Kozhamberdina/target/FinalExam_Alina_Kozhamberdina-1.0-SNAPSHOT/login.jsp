<%-- 
    Document   : login
    Created on : Apr 7, 2020, 11:22:41 AM
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="j_security_check" method="POST">
            <p><input type="text" name="j_username" value="" /></p>
            <p><input type="text" name="j_password" value="" /></p>
            <input type="submit" value="Login" />
        </form>
        <p>For testing login with <b>vip1/vip1</b></p>
        <p><a href="index.jsp">Go Back</a></p>
    </body>
</html>
