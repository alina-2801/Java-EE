<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Questions and Answers</h1>
    <p>${greetings}</p>
    <p>${message}</p>
    <form action="askme" method="POST">
      <p>Question: <input type="text" name="question" value="" /></p>
      <input type="submit" value="Submit" />
    </form>    
  </body>
</html>
