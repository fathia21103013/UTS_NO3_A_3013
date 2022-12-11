/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.main_3013;

/**
 *
 * @author ASUS
 */
public class AsistenPraktikum_3013 extends Mahasiswa_3013 implements iPendapatan_3013 {
    private String mkAsistensi_3013;
    private int jmlPertemuan_3013;
    double totalPendapatan_3013;
    
    public AsistenPraktikum_3013(String nim_3013,String nama_3013,String jurusan_3013,float ipk_3013,String mkAsistensi_3013,int jmlPertemuan_3013){
        super(nim_3013,nama_3013,jurusan_3013,ipk_3013);
        this.jmlPertemuan_3013 = jmlPertemuan_3013;
        this.mkAsistensi_3013 = mkAsistensi_3013;
    }
    public void setMkAsistensi_3013(String mkAsistensi_3013) {
        this.mkAsistensi_3013 = mkAsistensi_3013;
    }
    public String getMkAsistensi_3013() {
        return mkAsistensi_3013;
    }
    public void setJmlPertemuan_3013(int jmlPertemuan_3013) {
        this.jmlPertemuan_3013 = jmlPertemuan_3013;
    }
    public int getJmlPertemuan_3013() {
        return jmlPertemuan_3013;
    }
    public void tampilDataMhs_3013() {
        System.out.println("NIM                     : " + nim_3013);
        System.out.println("Nama                    : " + nama_3013);
        System.out.println("Jurusan                 : " + jurusan_3013);
        System.out.println("IPK                     : " + ipk_3013);
        System.out.println("MK Asistentsi           : " + mkAsistensi_3013);
        System.out.println("Jumlah Pertemuan        : " + jmlPertemuan_3013);
        System.out.println("--------------------------------------------");
        System.out.println("Total Pendapatan        : "+ totalPendapatan_3013());
        System.out.println("");
    }

    public double totalPendapatan_3013() {
        totalPendapatan_3013 = jmlPertemuan_3013 * 50000;
        return totalPendapatan_3013;
    }

}


