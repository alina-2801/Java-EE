package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class NewServlet extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    //handle cookies 
    Cookie lastvisit = null;
    Cookie[] cookies = request.getCookies();
    String greetings = "";
    for (Cookie c : cookies) { //search the cookie to see if this is a previous user
      if (c.getName().equals("lastvisit")) {
        greetings = "<p>You were here at: " + c.getValue() + ". Welcome back. </p>";
        break;
      }
    }
    
    if (greetings.isEmpty()) { //new user, since the cookie is not found in the request
      greetings = "<p>Welcome, new user. Enjoy</p>";
    }
    
    request.setAttribute("greetings", greetings);
    
    lastvisit = new Cookie("lastvisit", //make cookie to store the current time
      LocalDateTime.now().format(
        DateTimeFormatter.ofPattern("yyyy-MM-dd/hh:mm:ss")));
    
    lastvisit.setMaxAge(60 * 3); //3 min
    response.addCookie(lastvisit); //add to response so that the browser can store it

//=================================
    
    //handle session
    String message = request.getParameter("question");
    message = "<p>You: " + message + "</p>"
      + "<p>Server: Yes, Sir!</p>";
    HttpSession session = request.getSession();
    String oldMessage = null;
    synchronized (session) { //to make it thread-safe
      //lock session
      oldMessage = (String) session.getAttribute("message");
    }
    
    if (oldMessage != null) { //if not null, there are previous questions stored in session attribute
      message = oldMessage + message;
    }
    
    synchronized (session) { //to make it thread-safe
      session.setAttribute("message", message);
    }
    
    getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    
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
