/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Fungsi.DataBaseConnection;
import Fungsi.function;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROG
 */
public class bookingS extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet bookingS</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bookingS at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        response.setContentType("text/html");
        DataBaseConnection conn = new DataBaseConnection();
        PrintWriter out = response.getWriter();
//        Connection con = conn.getConnection();
//        String a = request.getParameter("JenisKamar");
//        function s = new function();
//        try {
//            int cek = s.cekJumlahKamar(a);
//            
//            out.println("<html>"
//                    + "<head></head>"
//                    + "<body>"
//                    + cek
//                    + "</body>"
//                    + "</html>");
//        } catch (Exception ex) {
//
//        }
        try {
            String querykamar = "select * from kamar";
            Statement statement = conn.getConnection().createStatement();
            ResultSet result = statement.executeQuery(querykamar);
            out.print("<html>");
                   
            out.print("<body>");
            out.print("<form method = 'GET'>");
            out.print("<center> <h1> KAMAR ARIA ROOM AND SWIMMING POOL </h1> <table border=3>");
            out.print("<tr>");
            out.print("<td>Tipe Kamar</td>");
            out.print("<td>Jumlah Kamar</td>");
            out.print("</tr>");
            while (result.next()) {
                out.print("<tr>");
                out.print("<td>" + result.getString(2) + "</td>");
                out.print("<td>" + result.getString(4) + "</td>");
                out.print("</tr>");

            }
            out.print("</table><br>");
            out.print("<a href = 'booking.jsp'>Kembali</center>");
            out.print("</form>");
            out.print("</body>");
            out.print("</html>");
        } catch (SQLException e) {
            out.print("Message :" + e.getMessage());
        }
        
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
