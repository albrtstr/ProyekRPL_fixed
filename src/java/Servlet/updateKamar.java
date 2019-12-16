/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Fungsi.DataBaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ROG
 */
@WebServlet(name = "updateKamar", urlPatterns = {"/updateKamar"})
public class updateKamar extends HttpServlet {

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
            out.println("<title>Servlet updateKamar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet updateKamar at " + request.getContextPath() + "</h1>");
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
        PrintWriter out = response.getWriter();
        String a = request.getParameter("idKamar");
        System.out.println("idKamar " + a);
        out.print("\n"
                + "<%@page contentType=\"text/html\" pageEncoding=\"UTF-8\"%>\n"
                + "<!DOCTYPE html>\n"
                + "<html>\n"
                + "    <head>\n"
                + "        <script type=\"text/javascript\">\n"
                + "            function notifDaftar() {\n"
                + "                var id_kamar = document.forms[\"tambahKamar\"][\"idKamar\"].value;\n"
                + "                var tipe_kamar = document.forms[\"tambahKamar\"][\"tipeKamar\"].value;\n"
                + "                var harga_kamar = document.forms[\"tambahKamar\"][\"hargaKamar\"].value;\n"
                + "\n"
                + "\n"
                + "                if ((id_kamar && tipe_kamar && harga_kamar) === \"\") {\n"
                + "                    alert(\"Data belum diisi dengan lengkap!\");\n"
                + "                    return false;\n"
                + "                }\n"
                + "                if ((id_kamar && tipe_kamar && harga_kamar) !== null) {\n"
                + "                    alert(\"Kamar berhasil ditambahkan!\");\n"
                + "                }\n"
                + "            }\n"
                + "        </script>\n"
                + "\n"
                + "        <% String idKamar = request.getParameter(\"idKamar\");%>\n"
                + "        <% String tipeKamar = request.getParameter(\"tipeKamar\");%>\n"
                + "        <% String hargaKamar = request.getParameter(\"hargaKamar\");%>\n"
                + "        <% String jumlahKamar = request.getParameter(\"jumlahKamar\");%>\n"
                + "        \n"
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
                + "                    <div class=\"col-6 col-lg-4 site-logo\" data-aos=\"fade\"><a href=\"index.html\">Aria Rooms & Swimming Pool</a></div>\n"
                + "                    <div class=\"col-6 col-lg-8\">\n"
                + "\n"
                + "\n"
                + "                        <div class=\"site-menu-toggle js-site-menu-toggle\"  data-aos=\"fade\">\n"
                + "                            <span></span>\n"
                + "                            <span></span>\n"
                + "                            <span></span>\n"
                + "                        </div>\n"
                + "                        <!-- END menu-toggle -->\n"
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
                + "                        <h1 class=\"heading mb-3\">UPDATE DATA KAMAR</h1>\n"
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
                + "                        <form name=\"updateKamar\" method=\"GET\" action=\"./updateKamar\" class=\"bg-white p-md-5 p-4 mb-5 border\">\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"id\">ID KAMAR</label>\n"
                + "                                    <input type=\"text\" id=\"id\" name=\"idKamar\" class=\"form-control\" value=<%=idKamar%>>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"tipe\">TIPE KAMAR</label>\n"
                + "                                    <input type=\"text\" id=\"tipe\" name=\"tipeKamar\" class=\"form-control\" value=<%=tipeKamar%>>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"harga\">HARGA KAMAR</label>\n"
                + "                                    <input type=\"text\" id=\"harga\" name=\"hargaKamar\" class=\"form-control\" value=<%=hargaKamar%>>\n"
                + "                                </div>\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <label class=\"text-black font-weight-bold\" for=\"harga\">JUMLAH KAMAR</label>\n"
                + "                                    <input type=\"text\" id=\"jumlah\" name=\"jumlahKamar\" class=\"form-control\" value=<%=jumlahKamar%>>\n"
                + "                                </div>\n"
                + "\n"
                + "                            </div>\n"
                + "\n"
                + "\n"
                + "                            <div class=\"row\">\n"
                + "                                <div class=\"col-md-6 form-group\">\n"
                + "                                    <button onclick=\"return notifDaftar()\" type=\"submit\" value=\"Update\" class=\"btn btn-primary text-white py-3 px-5 font-weight-bold\">Update</button>\n"
                + "                                </div>\n"
                + "                            </div>\n"
                + "                        </form> \n"
                + "                    </div>\n"
                + "                    <div class=\"col-md-5\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n"
                + "                        <div class=\"row\">\n"
                + "                            <div class=\"col-md-10 ml-auto contact-info\">\n"
                + "                                <p><span class=\"d-block\">Alamat:</span> <span class=\"text-black\"> Jalan Stadion Nomor 331, Tajem, Maguwoharjo, Depok, Sleman, Yogyakarta</span></p>\n"
                + "                                <p><span class=\"d-block\">Phone:</span> <span class=\"text-black\"> (0274) 433 2059</span></p>\n"
                + "                                <p><span class=\"d-block\">Email:</span> <span class=\"text-black\"> ariarooms@gmail.com</span></p>\n"
                + "                            </div>\n"
                + "                        </div>\n"
                + "                    </div>\n"
                + "                </div>\n"
                + "        </section>\n"
                + "\n"
                + "\n"
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
                + "        <script src=\"js/jquery-3.3.1.min.js\"></script>\n"
                + "        <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n"
                + "        <script src=\"js/popper.min.js\"></script>\n"
                + "        <script src=\"js/bootstrap.min.js\"></script>\n"
                + "        <script src=\"js/owl.carousel.min.js\"></script>\n"
                + "        <script src=\"js/jquery.stellar.min.js\"></script>\n"
                + "        <script src=\"js/jquery.fancybox.min.js\"></script>\n"
                + "        <script src=\"js/aos.js\"></script>\n"
                + "        <script src=\"js/bootstrap-datepicker.js\"></script> \n"
                + "        <script src=\"js/jquery.timepicker.min.js\"></script> \n"
                + "        <script src=\"js/main.js\"></script>\n"
                + "    </body>\n"
                + "</html>\n"
                + "");

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
        PrintWriter out = response.getWriter();
        System.out.println("ad");
        response.setContentType("text/html");
        DataBaseConnection conn = new DataBaseConnection();
        Connection connect = conn.getConnection();
        String idKamar = request.getParameter("idKamar");
        String tipeKamar = request.getParameter("tipeKamar");
        int hargaKamar = Integer.parseInt(request.getParameter("hargaKamar"));
        int jumlahKamar = Integer.parseInt(request.getParameter("jumlahKamar"));

        String button = request.getParameter("button");

        try {
            PreparedStatement update = connect.prepareStatement("update KAMAR set tipeKamar=?, hargaKamar=?, jumlahKamar=? where idKamar=?");

            update.setString(1, tipeKamar);
            update.setInt(2, hargaKamar);
            update.setInt(3, jumlahKamar);
            update.executeUpdate();
            response.sendRedirect("showKamar1");
            connect.close();
        } catch (Exception ex) {
            out.print("Message : " + ex.getMessage());
        }
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
