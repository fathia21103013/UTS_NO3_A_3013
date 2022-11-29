/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.main_3013;

/**
 *
 * @author ASUS
 */
public class StudentStaff_3013 {
    private int unitKerja;
    private int jamKerja;
    private String nama;
    private String jurusan;
    private String Ipk;
    private String nim;

    StudentStaff_3013(int i, int i0, Object object, Object object0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(int unitKerja) {
        this.unitKerja = unitKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

 
    public void tampilDataMhs() {
        System.out.println("NIM                     : " + nim);
        System.out.println("Nama                    : " + nama);
        System.out.println("Jurusan                 : " + jurusan);
        System.out.println("IPK                     : " + Ipk);
        System.out.println("Unit Kerja              : " + unitKerja);
        System.out.println("Jam Kerja               : " + jamKerja);
        System.out.println("-----------------------------------------");
    }

    public double totalPendapatan() {
        double totalPendapatan;

        return totalPendapatan = jamKerja * 30000;

    }

    void showData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
