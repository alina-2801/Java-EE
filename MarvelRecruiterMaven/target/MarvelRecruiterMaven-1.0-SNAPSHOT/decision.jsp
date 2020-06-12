<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
    <title>Decision</title>
  </head>
  <body>
    <h1>Thank You!</h1>
    <h3>Applicant Info</h3>
    <p>Name: ${applicant.name}</p>
    <p>Email: ${applicant.email}</p>
    <p>IQ: ${applicant.iq}</p>
    <p>Favorite Beverage: ${applicant.beverage}</p>
    <p>Super Power: ${applicant.superPower}</p>
    <h3>Your Score is: ${score}</h3>
    <h3>${decision}</h3>
    <a href="index.html">Next Applicant</a>  
  </body>
</html>
