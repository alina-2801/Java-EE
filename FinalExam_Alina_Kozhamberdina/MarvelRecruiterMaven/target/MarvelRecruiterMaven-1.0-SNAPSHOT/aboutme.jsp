<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>

    <title>About Me</title>
  </head>
  <body>
    <h1>About Me</h1>    
    <p>Tell us more about yourself</p>
    <form name="contact" action="DecisionMaker" method="POST">
      <h3>IQ: </h3>
      <p><select name="iq">
        <option value="Less Than 120" selected="">Less Than 120</option>
        <option value="121 to 150">121 to 150</option>
        <option value="151 to 180">151 to 180</option>
        <option value="Greater than 180">Greater than 180</option>
        </select></p>
      <h3>Favorite Beverage</h3>
      <p><input type="radio" name="beverage" value="Water" checked="checked"/>Water
      <input type="radio" name="beverage" value="Juice" />Juice
      <input type="radio" name="beverage" value="Cola" />Cola
      <input type="radio" name="beverage" value="Beer" />Beer
      <input type="radio" name="beverage" value="Wine" />Wine</p>
      <h3>Super Power</h3>
      <input type="checkbox" name="superpower" value="Super Strength" />Super Strength<br>
      <input type="checkbox" name="superpower" value="Flight" />Flight<br>
      <input type="checkbox" name="superpower" value="Time Travel" />Time Travel<br>
      <input type="checkbox" name="superpower" value="Mind Control" />Mind Control<br>
      <input type="checkbox" name="superpower" value="Coding" />Coding<br>
      <input type="hidden" name="fullname" value="${fullname}" /><br>
      <input type="hidden" name="email" value="${email}" />
      <label></label>
      <input type="submit" value="Join Now" />
    </form>
    <a href="index.html">Go Back</a>  

  </body>
</html>
