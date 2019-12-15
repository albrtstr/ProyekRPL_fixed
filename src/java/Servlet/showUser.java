/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Fungsi.DataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class showUser extends HttpServlet {

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
            out.println("<title>Servlet showUser</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet showUser at " + request.getContextPath() + "</h1>");
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
        try {
            String query = "select * from customer";
            Statement statement = conn.getConnection().createStatement();
            ResultSet result = statement.executeQuery(query);

            out.print("<html>");
            out.print("<body>");
            out.print("<center><table border=3>");
            out.print("<tr>");
            out.print("<td>ID Akun</td>");
           out.print("<td>Nama</td>");
            out.print("<td>Username</td>");
            out.print("<td>Password</td>");
            out.print("<td>Alamat</td>");
            out.print("</tr>");

            while (result.next()) {
                out.print("<tr>");
                out.print("<form action ='hapusAkun'>");
                out.print("");
                out.print("<td><input type=\"text\" name='idAkun' value='" + result.getString(1) + "' readonly></td>");
                out.print("<td>" + result.getString(2) + "</td>");
                out.print("<td>" + result.getString(3) + "</td>");
                out.print("<td>" + result.getString(4) + "</td>");
                out.print("<td>" + result.getString(5) + "</td>");
                out.print("<td><input type='submit' value='hapus'></td>");
                out.print("</form>");
                out.print("</tr>");
                
            }

            out.print("</table>");
            out.print("</center>");
            out.print("</body");
            out.print("</html>");
            statement.close();
        } catch (Exception ex) {
            System.out.println("Message: " + ex.getMessage());
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
