/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.sql.Date;

/**
 *
 * @author ROG
 */
public class booking {

    private String idBooking;
    private String idCustomer;
    private String nama;
    private String telepon;
    private Date tanggalMasuk;
    private Date tanggalKeluar;
    private int jumlahTamu;
    private String idKamar;
    private String virtualAcc;

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public Date getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(Date tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    public int getJumlahTamu() {
        return jumlahTamu;
    }

    public void setJumlahTamu(int jumlahTamu) {
        this.jumlahTamu = jumlahTamu;
    }

    public String getIdKamar() {
        return idKamar;
    }

    public void setIdKamar(String idKamar) {
        this.idKamar = idKamar;
    }

    public String getVirtualAcc() {
        return virtualAcc;
    }

    public void setVirtualAcc(String virtualAcc) {
        this.virtualAcc = virtualAcc;
    }

}
