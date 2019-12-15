/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Tools.booking;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROG
 */
public class Pembayaran extends HttpServlet {

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
            out.println("<title>Servlet Pembayaran</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Pembayaran at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        String nama = request.getParameter("namaCust");
        String phone = request.getParameter("teleponCust");
        String email = request.getParameter("emailCust");
        String checkinCust = request.getParameter("checkinCust");
        String checkoutCust = request.getParameter("checkoutCust");
        String jumlahTamu = request.getParameter("jumlahTamu");
        String Cabang = request.getParameter("Cabang");
        String JenisKamar = request.getParameter("JenisKamar");
        String catatanCust = request.getParameter("catatanCust");
        //int harga = Integer.parseInt(request.getParameter("harga"));
        String harga = request.getParameter("harga");
        int max1 = 500;
        int min1 = 100;
        booking book = new booking();

        int virAnd1 = (int) (Math.random() * ((max1 - min1) + 1) + min1);

        System.out.println(virAnd1);
        out.println("<!DOCTYPE HTML>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <meta charset=\"utf-8\">\n"
                + "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "        <title>Aria Rooms and Swimming Pool</title>\n"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n"
                + "        <meta name=\"description\" content=\"\" />\n"
                + "        <meta name=\"keywords\" content=\"\" />\n"
                + "        <meta name=\"author\" content=\"\" />\n"
                + "        <link rel=\"stylesheet\" type=\"text/css\" href=\"//fonts.googleapis.com/css?family=|Roboto+Sans:400,700|Playfair+Display:400,700\">\n"
                + "\n"
                + "        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/animate.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/aos.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"css/fancybox.min.css\">\n"
                + "\n"
                + "        <link rel=\"stylesheet\" href=\"fonts/ionicons/css/ionicons.min.css\">\n"
                + "        <link rel=\"stylesheet\" href=\"fonts/fontawesome/css/font-awesome.min.css\">\n"
                + "\n"
                + "        <!-- Theme Style -->\n"
                + "        <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                + "    </head>\n"
                + "    <body>\n"
                + "\n"
                + "        <header class=\"site-header js-site-header\">\n"
                + "            <div class=\"container-fluid\">\n"
                + "                <div class=\"row align-items-center\">\n"
                + "                    <div class=\"col-6 col-lg-4 site-logo\" data-aos=\"fade\">Aria Rooms & Swimming Pool</div>\n"
                + "                    <div class=\"col-6 col-lg-8\">\n"
                + "\n"
                + "\n"
                + "                        <div class=\"site-menu-toggle js-site-menu-toggle\"  data-aos=\"fade\">\n"
                + "                            <span></span>\n"
                + "                            <span></span>\n"
                + "                            <span></span>\n"
                + "                        </div>\n"
                + "                        <!-- END menu-toggle -->\n"
                + "\n"
                + "                        <div class=\"site-navbar js-site-navbar\">\n"
                + "                            <nav role=\"navigation\">\n"
                + "                                <div class=\"container\">\n"
                + "                                    <div class=\"row full-height align-items-center\">\n"
                + "                                        <div class=\"col-md-6 mx-auto\">\n"
                + "                                            <ul class=\"list-unstyled menu\">\n"
                + "                                                <li><a href=\"profil.html\">Profil</a></li>\n"
                + "                                                <li><a href=\"halut.html\">Halaman Utama</a></li>\n"
                + "                                                <li><a href=\"kamar.html\">Kamar</a></li>                      \n"
                + "                                                <li><a href=\"booking.html\">Booking</a></li>\n"
                + "                                                <li class=\"active\"><a href=\"pembayaran.html\">Pembayaran</a></li>\n"
                + "                                                <li><a href=\"login.html\">Logout</a></li>\n"
                + "                                            </ul>\n"
                + "                                        </div>\n"
                + "                                    </div>\n"
                + "                                </div>\n"
                + "                            </nav>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </header>\n"
                + "        <!-- END head -->\n"
                + "\n"
                + "        <section class=\"site-hero inner-page overlay\" style=\"background-image: url(images/hero_4.jpg)\" data-stellar-background-ratio=\"0.5\">\n"
                + "            <div class=\"container\">\n"
                + "                <div class=\"row site-hero-inner justify-content-center align-items-center\">\n"
                + "                    <div class=\"col-md-10 text-center\" data-aos=\"fade\">\n"
                + "                        <h1 class=\"heading mb-3\">PEMBAYARAN</h1>\n"
                + "                        <ul class=\"custom-breadcrumbs mb-4\">\n"
                + "                        </ul>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "\n"
                + "            <a class=\"mouse smoothscroll\" href=\"#next\">\n"
                + "                <div class=\"mouse-icon\">\n"
                + "                    <span class=\"mouse-wheel\"></span>\n"
                + "                </div>\n"
                + "            </a>\n"
                + "        </section>\n"
                + "        <!-- END section -->\n"
                + "\n"
                + "        <section class=\"section contact-section\" id=\"next\">\n"
                + "            <div class=\"container\">\n"
                + "                <div class=\"row\">\n"
                + "                    <div class=\"col-md-7\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n"
                + "                            \n"
                + "                        <form action=\"#\" method=\"post\" class=\"bg-white p-md-5 p-4 mb-5 border\">\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"name\">Total Pembayaran</label>\n"
                + "                                    <input type=\"text\" id=\"totalBayar\" name=\"bayarTotal\" class=\"form-control\" value='"+harga+"' readonly>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"phone\">Nomor Virtual Account</label>\n"
                + "                                    <input type=\"text\" id=\"noVircount\" name=\"notualCount\" class=\"form-control \" value='" + virAnd1 + "' readonly>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                            \n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <button type=\"submit\" value=\"OK\" class=\"btn btn-primary text-white py-3 px-5 font-weight-bold\">OK</button>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                        </form>\n"
                + "\n"
                + "                    </div>\n"
                + "                    <div class=\"col-md-5\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                + "                        <div class=\"row\">\n"
                + "                            <div class=\"col-md-10 ml-auto contact-info\">\n"
                + "                                <p><span class=\"d-block\">Alamat:</span> <span class=\"text-black\"> Jalan Stadion Nomor 331, Tajem, Maguwoharjo, Depok, Sleman, Yogyakarta</span></p>\n"
                + "                                <p><span class=\"d-block\">Nomor Telepon:</span> <span class=\"text-black\"> (0274) 433 2059</span></p>\n"
                + "                                <p><span class=\"d-block\">Email:</span> <span class=\"text-black\"> ariarooms@gmail.com</span></p>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </section>\n"
                + "\n"
                + "        <section class=\"section bg-image overlay\" style=\"background-image: url('images/hero_4.jpg');\">\n"
                + "            <div class=\"container\" >\n"
                + "                <div class=\"row align-items-center\">\n"
                + "                    <div class=\"col-12 col-md-6 text-center mb-4 mb-md-0 text-md-left\" data-aos=\"fade-up\">\n"
                + "                        <h2 class=\"text-white font-weight-bold\">A Best Place To Stay. Reserve Now!</h2>\n"
                + "                    </div>\n"
                + "                    <div class=\"col-12 col-md-6 text-center text-md-right\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                + "                        <a href=\"reservation.html\" class=\"btn btn-outline-white-primary py-3 text-white px-5\">Reserve Now</a>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "            </div>\n"
                + "        </section>\n"
                + "\n"
                + "\n"
                + "        <script src=\"js/jquery-3.3.1.min.js\"></script>\n"
                + "        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n"
                + "        <script src=\"js/popper.min.js\"></script>\n"
                + "        <script src=\"js/bootstrap.min.js\"></script>\n"
                + "        <script src=\"js/owl.carousel.min.js\"></script>\n"
                + "        <script src=\"js/jquery.stellar.min.js\"></script>\n"
                + "        <script src=\"js/jquery.fancybox.min.js\"></script>\n"
                + "\n"
                + "\n"
                + "        <script src=\"js/aos.js\"></script>\n"
                + "\n"
                + "        <script src=\"js/bootstrap-datepicker.js\"></script> \n"
                + "        <script src=\"js/jquery.timepicker.min.js\"></script> \n"
                + "\n"
                + "\n"
                + "\n"
                + "        <script src=\"js/main.js\"></script>\n"
                + "    </body>\n"
                + "</html>");

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
