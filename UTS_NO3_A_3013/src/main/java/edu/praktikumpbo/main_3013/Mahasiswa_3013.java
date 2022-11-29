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
    protected String nim;
    protected String nama;
    protected String jurusan;
    protected int Ipk;
    
    public Mahasiswa_3013(String nim, String nama, String jurusan, int Ipk){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.Ipk = Ipk;
    }
    public abstract void showData();
}

