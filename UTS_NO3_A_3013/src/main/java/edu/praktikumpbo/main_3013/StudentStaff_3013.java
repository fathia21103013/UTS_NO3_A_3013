/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.main_3013;

/**
 *
 * @author ASUS
 */
public class StudentStaff_3013 extends Mahasiswa_3013 implements iPendapatan_3013 {
   private String unitKerja_3013;
    private int jamKerja_3013;
    double totalPendapatan_3013;
    
    public StudentStaff_3013(String nim_3013,String nama_3013,String jurusan_3013,float ipk_3013, String unitKerja_3013, int jmKerja_3013 ){
        super(nim_3013, nama_3013, jurusan_3013,ipk_3013);
        this.unitKerja_3013 = unitKerja_3013;
        this.jamKerja_3013 = jamKerja_3013;
    }
    public String getUnitKerja_3013() {
        return unitKerja_3013;
    }
    public void setUnitKerja_3013(String unitKerja_3013) {
        this.unitKerja_3013 = unitKerja_3013;
    }
    public int getJamKerja_3013() {
        return jamKerja_3013;
    }
    public void setJamKerja_3013(int jamKerja_3013) {
        this.jamKerja_3013 = jamKerja_3013;
    }
    public void tampilDataMhs_3013() {
        System.out.println("NIM                     : "+ nim_3013);
        System.out.println("Nama                    : "+ nama_3013);
        System.out.println("Jurusan                 : "+ jurusan_3013);
        System.out.println("IPK                     : "+ ipk_3013);
        System.out.println("Unit Kerja              : "+ unitKerja_3013);
        System.out.println("Jam Kerja               : "+ jamKerja_3013);
        System.out.println("--------------------------------------------");
        System.out.println("Total Pendapatan        : "+ totalPendapatan_3013());
        System.out.println("");
    }
    public double totalPendapatan_3013() {
        totalPendapatan_3013 = jamKerja_3013 * 30000;
        return totalPendapatan_3013;
    }
    
}


