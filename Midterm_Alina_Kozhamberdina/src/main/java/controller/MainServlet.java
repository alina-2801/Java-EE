/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ShippingBox;

/**
 *
 * @author alina
 */
public class MainServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
       String type = request.getParameter("type");
       String country = request.getParameter("country");
       Double boxWeight = Double.parseDouble(request.getParameter("boxWeight"));
       Double bottleWeight = Double.parseDouble(request.getParameter("bottleWeight"));
       int bottlenum = Integer.parseInt(request.getParameter("bottlenum"));
       
       ShippingBox box = new ShippingBox(type,country,boxWeight,bottleWeight, bottlenum);
      
       
      HttpSession session = request.getSession();
       ArrayList<ShippingBox> list = (ArrayList<ShippingBox>)request.getSession().getAttribute("list");
      if (list == null) list = new ArrayList<>();
      list.add(box);
      session.setAttribute("list", list);
      session.setAttribute("size", list.size());
      double subtotal = 0.0;
      for (ShippingBox b : list) subtotal = b.getBottlenum() * (b.getBoxWeight() + b.getBottleWeight());
      session.setAttribute("subtotal", subtotal);
      
      double total = 0.0;
      for (ShippingBox b : list) total += subtotal;
      session.setAttribute("total", total);
       
    
       
      //cookies part      
   Cookie lastvisit = null;
    Cookie[] cookies = request.getCookies();
    String greetings = "";
    for (Cookie c : cookies) { //search the cookie to see if this is a previous user
      if (c.getValue().equals("lastvisit")) {
        greetings = "<p>You used this application  " + c.getValue() + " times. Welcome back. </p>";
        break;
      }
    }
    
    if (greetings.isEmpty()) { //new user, since the cookie is not found in the request
      greetings = "<p>Welcome, first-time user</p>";
    }
     //response.addCookie(lastvisit); //add to response so that the browser can store it
        request.setAttribute("box", box);
     request.setAttribute("greetings", greetings);

 //   request.setAttribute("type", type);
   // request.setAttribute("country", country);
    //request.setAttribute("boxWeight", boxWeight);
   // request.setAttribute("bottleWeight", bottleWeight);
    //request.setAttribute("bottlenum", bottlenum);

   
        
         getServletContext().getRequestDispatcher("/thankyou.jsp").forward(request, response);
        

    
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
