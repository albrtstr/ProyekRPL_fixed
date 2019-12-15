/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import Tools.CostumerID;
import Tools.booking;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebParam;

/**
 *
 * @author ROG
 */
public class function {

    private DataBaseConnection conn;
//    Connection con = conn.getConnection();

    public CostumerID profilCostumer(String username) {

        try {
            conn = new DataBaseConnection();
            String query = "SELECT * FROM CUSTOMER WHERE username LIKE '" + username + "'";
            java.sql.Statement statement = conn.getConnection().createStatement();
            java.sql.ResultSet result = statement.executeQuery(query);
            result.next();
            if (result.first()) {
                CostumerID p = new CostumerID();
                p.setIdCustomer(result.getString("idCustomer"));
                p.setUsername(result.getString("username"));
                p.setPassword(result.getString("password"));
                p.setNama(result.getString("nama"));
                p.setNoTelp(result.getString("noTelp"));
                p.setAlamat(result.getString("alamat"));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean cekCostumer(String username, String password) {

        try {
            conn = new DataBaseConnection();
            String query = "SELECT * FROM `customer` WHERE username like '" + username + "' AND password like '" + password + "'";
            java.sql.Statement statement = conn.getConnection().createStatement();
            java.sql.ResultSet result = statement.executeQuery(query);
            result.next();
            return result.isFirst();
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void booking(booking booking) {

        try {
            conn = new DataBaseConnection();
//            Connection con = conn.getConnection();
//            PreparedStatement state = con.prepareStatement("insert into booking values(?,?,?,?,?,?,?,?,?)");
//            state.setString(1, booking.getIdBooking());
//            state.setString(2, booking.getIdCustomer());
//            state.setString(3, booking.getNama());
//            state.setString(4, booking.getTelepon());
//            state.setString(5,  booking.getTanggalMasuk());
//            state.setString(6, booking.getTanggalKeluar());
//            state.setString(7, (Integer.toString(booking.getJumlahTamu())));
//            state.setString(8, booking.getIdKamar());
//            state.setString(9, booking.getVirtualAcc());
//            state.executeUpdate();
//            state.close();
            String query = "INSERT INTO `booking`(`idBooking`, `idCustomer`, `nama`, `telepon`, `tanggalMasuk`, `tanggalKeluar`, `jumlahTamu`, `virtualAcc`, `cabang`, `tipeKamar`) "
                    + "VALUES ('" + booking.getIdBooking() + "','" + booking.getIdCustomer() + "','" + booking.getNama() + "','" + booking.getTelepon() + "','" + booking.getTanggalMasuk()
                    + "','" + booking.getTanggalKeluar() + "','" + booking.getJumlahTamu() + "','" + booking.getVirtualAcc() + "','" +booking.getCabang()+ "','"+booking.getTipeKamar()+"')";
            
            
            java.sql.Statement statement = conn.getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
