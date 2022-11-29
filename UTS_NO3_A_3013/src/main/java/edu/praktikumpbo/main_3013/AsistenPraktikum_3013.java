/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.main_3013;

/**
 *
 * @author ASUS
 */
public class AsistenPraktikum_3013 extends Mahasiswa_3013 implements Pendapatan_3013{
    String mkAsistensi;
    private int jmlPertemuan;
    String unitKerja;

    public AsistenPraktikum_3013(String nim, String nama, String jurusan, int Ipk) {
        this(Ipk, 0, nim, nama, 0);
    }

    public AsistenPraktikum_3013(int Ipk, int par1, String nim, String nama, int par4) {
        super(nim, nama, jurusan, Ipk);
    }

    public String getMkAsistensi() {
        return mkAsistensi;
    }

    public void setMkAsistensi(String mkAsistensi) {
        this.mkAsistensi = mkAsistensi;
    }

    public int getJmlPertemuan() {
        return jmlPertemuan;
    }

    public void setJmlPertemuan(int jmlPertemuan) {
        this.jmlPertemuan = jmlPertemuan;
    }

    public void tampilDataMhs() {
        System.out.println("NIM                     : " + nim);
        System.out.println("Nama                    : " + nama);
        System.out.println("Jurusan                 : " + jurusan);
        System.out.println("IPK                     : " + Ipk);
        System.out.println("MK Asistentsi           : " + mkAsistensi);
        System.out.println("Jumlah Pertemuan        : " + jmlPertemuan);
        System.out.println("-----------------------------------------");
    }

    @Override
    public double totalPendapatan() {
        double totalPendapatan;

        return totalPendapatan = jmlPertemuan * 50000;

    }

    @Override
    public void showData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mkAsistensi(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void jmlPertemuan(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void jamKerja(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
