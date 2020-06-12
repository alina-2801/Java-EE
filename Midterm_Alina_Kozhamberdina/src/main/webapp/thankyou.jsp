<%-- 
    Document   : thankyou
    Created on : Feb. 21, 2020, 4:04:16 p.m.
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thank you!</title>
    </head>
    <body>
        <h1>Boxing Info</h1>
         <table border="1">
                <thead>
                    <tr>
        <th>Alcohol Type</th>
        <th>Produced</th>
        <th>Box Weight(kg)</th>
        <th>Bottle Weight(kg)</th>
         <th>Bottles</th>
         <th>Subtotal</th>

                    </tr>
                </thead>
                <tbody>
                   
                    <c:forEach var="box" items="${list}">

                        <tr>
                           
                            <td><c:out value = "${box.type}"/></td>
                            <td><c:out value="${box.country}" /></td>
                            <td><c:out value="${box.boxWeight}" /></td>
                            <td><c:out value="${box.bottlWeight}" /></td>
                            <td><c:out value="${box.bottlenum}" /></td>
                            <td><c:out value="${subtotal}" /></td>


                        </tr>


                    </c:forEach>
                    
                </tbody>
            </table>
          <p>${total}</p>                  
         <a href="index.jsp">Start Over</a>  
    </body>
</html>
