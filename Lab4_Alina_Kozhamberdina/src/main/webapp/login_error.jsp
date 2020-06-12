<%-- 
    Document   : login_error
    Created on : Apr 7, 2020, 11:22:53 AM
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page - Error</title>
    </head>
    <body>
        <h1>Login Page - Error</h1>
        <b><h2>Try Again!</h2></b>
        <form action="j_security_check" method="POST">
            <p><input type="text" name="j_username" value="" /></p>
            <p><input type="text" name="j_password" value="" /></p>
            <input type="submit" value="Login" />
        </form>
        <p>For testing login with <b>vip1/vip1</b></p>
        <p><a href="index.jsp">Go Back</a></p>
    </body>
</html>
