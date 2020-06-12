/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Phone;

/**
 *
 * @author ChiLin Ma
 */
public class Lab2Servlet extends HttpServlet {

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
        
        
        HttpSession session = request.getSession();
        
        if(request.getParameter("killSession")!= null){
            if(session != null){
                session.invalidate();
            }
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        
        ArrayList<Phone> phoneList = (ArrayList<Phone>)session.getAttribute("phoneList");
        if(phoneList == null){
            phoneList = new ArrayList<>();
        }
        
        //get the attributes
        String model = request.getParameter("model");
        int year = Integer.parseInt(request.getParameter("year"));
        int price = Integer.parseInt(request.getParameter("price"));
        String note = request.getParameter("note");
        
        Phone newPhone = new Phone(model, year, price, note);
        phoneList.add(newPhone);
        
        session.setAttribute("phoneList", phoneList);
        session.setAttribute("countPhone", phoneList.size());
        
        //set up the cost
        //int cost = Integer.parseInt(session.getAttribute("cost").toString());
        int cost = 0;
        if(session.getAttribute("cost") == null){
            cost = price;
        }else{
            cost = Integer.parseInt(session.getAttribute("cost").toString()) + price;
        }
        session.setAttribute("cost", cost);
        
        
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
