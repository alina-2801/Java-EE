<%-- 
    Document   : index
    Created on : Feb 7, 2020, 7:11:23 PM
    Author     : ChiLin Ma
--%>

<%@include file ="header.jsp" %>
    <body>
        <h1>Welcome to Lab2</h1>
        <form action="Lab2Servlet" method="POST">
            <h3>Enter a phone below</h3>
            <p>Model: <input type="text" name="model" value="" required/></p>
            <p>Year: <input type="number" name="year" value="" required/></p>
            <p>Price: <input type="number" name="price" value="" required/></p>
            <p>Note: <input type="text" name="note" value="" /></p>
            <input type="submit" value="Add to List" />
        </form>
        
        <form action="Lab2Servlet" method="POST">
            <input type="submit" value="kill this Session" name="killSession" />
        </form>
        
        <div>
            <c:if test="${empty phoneList}">
                <p>You Don't Have Any Phone
                </c:if>

                <c:if test="${not empty phoneList}">
                <p>you have used ${countPhone} Phones</p>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Model</th>
                            <th>Year</th>
                            <th>Price</th>
                            <th>Notes</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="phone" items="${phoneList}">
                            <tr>
                                <td><c:out value="${phone.model}" /></td>
                                <td><c:out value="${phone.year}" /></td>
                                <td><c:out value="${phone.price}" /></td>
                                <td><c:out value="${phone.note}" /></td>
                            </tr>
                        </c:forEach >
                    </tbody>
                </table>
                <h3>Total Cost: ${cost}</h3>
            </c:if>
        </div>
        
    </body> 
<%@include file ="footer.jsp" %>
