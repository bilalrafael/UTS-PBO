/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author ASUS
 */
public class karyawbil {
    private String nip;
    private String nama;
    private String jabatan;
    private int gaji;
    //enkapsulasi private agr tidk bisa di akses di kuar
    
    
    public karyawbil(String nip, String nama, String jabatan, int gaji){
        this.nip = nip;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
        //this digunakan untuk membedakan antara variabel lokal dan variabel instance.
    }
       // get mengambil niali set mengubahh nilai
    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jabatan
     */
    public String getJabatan() {
        return jabatan;
    }

    /**
     * @param jabatan the jabatan to set
     */
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    /**
     * @return the gaji
     */
    public int getGaji() {
        return gaji;
    }

    /**
     * @param gaji the gaji to set
     */
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    
}
