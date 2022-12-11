/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.main_3013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Main_3013 {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
            AsistenPraktikum_3013 A = new AsistenPraktikum_3013(null,null,null,0,null,0);
            StudentStaff_3013 S = new StudentStaff_3013(null,null,null,0,null,0);
            
            ArrayList <AsistenPraktikum_3013> asprak =new ArrayList<>();
            System.out.print("Jumlah Asisten Praktikum: ");
            int input = Integer.parseInt(br.readLine());
            System.out.println("\t== Input Data Asisten Praktikum ==");
            for (int i = 0; i<input; i++){ 
                System.out.print("NIM                     : " ); 
                A.nim_3013 = br.readLine();
                System.out.print("Nama                    : " );
                A.nama_3013 = br.readLine();
                System.out.print("Jurusan                 : " );
                A.jurusan_3013 = br.readLine();
                System.out.print("IPK                     : " );
                A.ipk_3013 = Float.parseFloat(br.readLine());
                System.out.print("MK Asistentsi           : " );
                A.setMkAsistensi_3013(br.readLine());
                System.out.print("Jumlah Pertemuan        : " );
                A.setJmlPertemuan_3013(Integer.parseInt(br.readLine()));
                asprak.add(A);
                System.out.println("");
            }
            ArrayList <StudentStaff_3013> stutaf =new ArrayList<>();
            System.out.print("Jumlah Student Staff    : ");
            int INPUT = Integer.parseInt(br.readLine());
            System.out.println("\t== Input Data Student Staff ==");
            for (int i = 0; i<INPUT; i++){ 
                System.out.print("NIM                     : "); 
                S.nim_3013 = br.readLine();
                System.out.print("Nama                    : ");
                S.nama_3013 = br.readLine();
                System.out.print("Jurusan                 : ");
                S.jurusan_3013 = br.readLine();
                System.out.print("IPK                     : ");
                S.ipk_3013 = Float.parseFloat(br.readLine());
                System.out.print("Unit Kerja              : ");
                S.setUnitKerja_3013(br.readLine());
                System.out.print("Jam Kerja               : ");
                S.setJamKerja_3013(Integer.parseInt(br.readLine()));
                stutaf.add(S);
                System.out.println("");
            }
            System.out.println("");
            System.out.println("\t== Data Asisten Praktikum ==");
            for(int i = 0; i < asprak.size(); i++){
                A.tampilDataMhs_3013();
            }
            System.out.println("");
            System.out.println("\t== Data Student Staff ==");
            for(int i = 0; i < stutaf.size(); i++){
                S.tampilDataMhs_3013();
            }
        }
        catch(IOException ex){
            System.out.println(); 
        }
    }
}
    


