package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Applicant;
import model.ApplicantIO;

/**
 *
 * @author ThinkPad
 */
public class DecisionMaker extends HttpServlet {

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
    String fullname = request.getParameter("fullname");
    String email = request.getParameter("email");
    String iq = request.getParameter("iq");
    String beverage = request.getParameter("beverage");
    ArrayList<String> superpower = new ArrayList<>();
    String[] spArr = request.getParameterValues("superpower");
    if (spArr != null) 
      superpower = new ArrayList<>(Arrays.asList(spArr));
    Applicant applicant = new Applicant(fullname, email, iq, beverage, superpower);
    String filepath = getServletContext().getInitParameter("filepath");
    final String path = request.getServletContext().getRealPath(filepath);
    ApplicantIO.writeToFile(applicant, path);
    int score = applicant.getScore();
    String pass = "Congratulations! Welcome to Marvel!";
    String fail = "Thank you for your interest. Good luck.";
    String decision = score >= 60 ? pass : fail;
    request.setAttribute("decision", decision);
    request.setAttribute("applicant", applicant);
    request.setAttribute("score", score);
    getServletContext().getRequestDispatcher("/decision.jsp").forward(request, response);
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

  public void print(String str) {
    log(str);
  }
}
