<%-- 
    Document   : index
    Created on : Feb. 21, 2020, 4:13:31 p.m.
    Author     : alina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Boxing The Bottles</title>
    </head>
    
    <body>
        <p>${greetings}</p>
        <h1>Put bottles into the 2 wood boxes</h1>
       
       <form action="main" method="POST">
          
  <table border="1" cellspacing="1" cellpadding="1">
    <thead>
      <tr>
        <th>Alcohol Type</th>
        <th>Produced</th>
        <th>Box Weight(kg)</th>
        <th>Bottle Weight(kg)</th>
         <th>Bottles</th>
      </tr>
    </thead>
    <tbody>
    
        <tr>
            <td> <p><input type="text" name="alcohol" value="" /></p>
            <p><input type="text" name="alcohol" value="" /></p></td>
            <td> <p><select name="country">
                    <option>China</option>
                    <option>France</option>
                    <option>Italy</option>
                    <option>Spain</option>
                    <option>USA</option>
                    <option>other</option>
                </select></p>
          <select name="country">
                    <option>China</option>
                    <option>France</option>
                    <option>Italy</option>
                    <option>Spain</option>
                    <option>USA</option>
                    <option>other</option>
                </select>
            </td>
            <td>
              <p>  <input type="text" name="boxWeight" value="" /></p>
               <p>  <input type="text" name="boxWeight" value="" /></p>
            </td>
          <td>
            <p>  <input type="text" name="bottleWeight" value="" /></p>
             <p>  <input type="text" name="bottleWeight" value="" /></p>
          </td>
          <td>
                <p>  <input type="number" name="bottlenum" value="" /></p>
             <p>  <input type="number" name="bottlenum" value="" /></p>
              </td>
        </tr>
     
  </tbody>
</table>
        <p><input type="submit" value="submit" name =" submit"/>
        <input type="reset" value="reset" name = "reset" /></p>
  </form> 
    </body>
   
</html>
