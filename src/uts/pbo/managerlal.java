/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author ASUS
 */
public class managerlal extends karyawbil {
    private String divisi;
    public managerlal(String nip, String nama, String jabatan, int gaji, String divisi) {
        super(nip, nama, jabatan, gaji);
        this.divisi = divisi;
    }

    /**
     * @return the divisi
     */
    public String getDivisi() {
        return divisi;
    }

    /**
     * @param divisi the divisi to set
     */
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}
