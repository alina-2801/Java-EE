<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>JSTL Intro</h1>
    <%-- 
    JSTL - JSP Standard Tag Libraries
    - EL: in JSP manage data 
    - JSTL: in JSP common tasks 
    - 5 libraries: core, function, format, XML, SQL
      - we will core only 
    - like html/xml tags: <tags>
    --%>
    <form action="main" method="POST">
      Course Name: <input type="text" name="name" required /><br>
      Course Marks: <input type="number" min="0" max="100" step="any" name="marks" required /><br>
      <input type="submit" value="Submit" />  
    </form>

    <c:forEach var ="i" begin = "0" end = "20" step ="3">
    ${i}<br>
        </c:forEach>
    <c:if test="${empty list}">
      <p>No course entered.</p>  
    </c:if>
    <c:if test="${not empty list}">
      <table border="1">
        <thead>
          <tr>
            <th>Name</th>
            <th>Marks</th>
            <th>Grade</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach var="course" items="${list}">  
            <tr>
              <td><c:out value="${course.name}"/></td>
              <td><c:out value="${course.marks}"/></td>
              <td>${course.grade}</td>
            </tr>
          </c:forEach>  
        </tbody>
      </table>
    </c:if>
  </body>
</html>
