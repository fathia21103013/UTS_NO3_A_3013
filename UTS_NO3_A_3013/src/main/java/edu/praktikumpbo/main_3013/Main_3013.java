/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.main_3013;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ASUS
 */
public class Main_3013 {

    public static void main(String[] args) {
    try{
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            AsistenPraktikum_3013 d = new AsistenPraktikum_3013(0,0,null,null,0);
            StudentStaff_3013 s = new StudentStaff_3013(0,0,null,null,0);
            
            System.out.println("\t== INPUT DATA ASISTEN PRAKTIKUM ==");
            System.out.print("NIM                : " );
            d.nim = br.readLine();
            System.out.print("NAMA                : " );
            d.nama = br.readLine();
            System.out.print("JURUSAN               : " );
            d.jurusan = br.readLine();
            System.out.print("MK ASISTENSI              : " );
            d.mkAsistensi = br.readLine();
            System.out.print("JUMLAH PERTEMUAN  : " );
            d.jmlPertemuan(Integer.parseInt(br.readLine()));
            System.out.println("");
            System.out.println("\t== DATA DOSEN ==");
            d.showData();
            System.out.println("");
            System.out.println("\t== INPUT DATA STUDENT STAFF ==");
             System.out.print("NIM                : " );
            d.nim = br.readLine();
            System.out.print("NAMA                : " );
            d.nama = br.readLine();
            System.out.print("JURUSAN               : " );
            d.jurusan = br.readLine();
            System.out.print("UNIT KERJA              : " );
            d.unitKerja = br.readLine();
            System.out.print("JAM KERJA : " );
            d.jamKerja(Integer.parseInt(br.readLine()));
            System.out.println("");
            System.out.println("\t== DATA STAFF ==");
            s.showData();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
