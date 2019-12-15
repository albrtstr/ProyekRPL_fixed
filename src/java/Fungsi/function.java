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
            String query = "INSERT INTO `booking`(`idBooking`, `idCustomer`, `nama`, `telepon`, `tanggalMasuk`, `tanggalKeluar`, `jumlahTamu`, `virtualAcc`, `cabang`, `tipeKamar`) "
                    + "VALUES ('" + booking.getIdBooking() + "','" + booking.getIdCustomer() + "','" + booking.getNama() + "','" + booking.getTelepon() + "','" + booking.getTanggalMasuk()
                    + "','" + booking.getTanggalKeluar() + "','" + booking.getJumlahTamu() + "','" + booking.getVirtualAcc() + "','" + booking.getCabang() + "','" + booking.getTipeKamar() + "')";

            java.sql.Statement statement = conn.getConnection().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(function.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
