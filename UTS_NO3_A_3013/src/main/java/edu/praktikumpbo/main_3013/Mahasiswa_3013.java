/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.main_3013;

/**
 *
 * @author ASUS
 */
public abstract class Mahasiswa_3013 {
    protected String nim_3013;
    protected String nama_3013;
    protected String jurusan_3013;
    protected float ipk_3013;
    
    public Mahasiswa_3013(String nim_3013,String nama_3013,String jurusan_3013,float ipk_3013){
        this.ipk_3013 = ipk_3013;
        this.jurusan_3013 = jurusan_3013;
        this.nama_3013 = nama_3013;
        this.nim_3013 = nim_3013;
    }
    public abstract void tampilDataMhs_3013();
}


