/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Fungsi.DataBaseConnection;
import Fungsi.function;
import Tools.kamar;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
public class cekKetersidaan extends HttpServlet {

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
        DataBaseConnection conn = new DataBaseConnection();
        Connection connect = conn.getConnection();
        String jenisKamar = request.getParameter("JenisKamar");
        PrintWriter out = response.getWriter();
        
        kamar kamar = new kamar();
        function func = new function();
        kamar.setTipeKamar(jenisKamar);
        func.cekJumlahKamar(String.valueOf(jenisKamar));
        int jml = func.cekJumlahKamar(String.valueOf(jenisKamar));;
        System.out.println("Result "+jml);
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
        response.setContentType("text/html");
//        DataBaseConnection conn = new DataBaseConnection();
//        Connection connect = conn.getConnection();
//        String jenisKamar = request.getParameter("JenisKamar");
//        PrintWriter out = response.getWriter();
//        
//        kamar kamar = new kamar();
//        function func = new function();
//        kamar.setTipeKamar(jenisKamar);
//        func.cekJumlahKamar(jenisKamar);
//        int jml = func.cekJumlahKamar(String.valueOf(jenisKamar));;
//        System.out.println("Result :"+jml);
        
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
