/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.praktikumujian;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Tampil {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        Vaksin k = new Vaksin();
        k.namaDesa= "Bacem";
        k.uu="laki laki dan perempuan (wajib)";
        System.out.println("Nomor Puskesmas : ");
        k.np=scan.nextInt();
        
        k.AgendaVaksin();
        k.AcaraVaksin();
        System.out.println("Sudah Vaksin : "+k.Vaksin(42));
        System.out.println("Belum Vaksin : "+k.Vaksin(8));
        System.out.println("Dimohon yang merasa belum vaksin segera melaksanakan vaksin");
    }

}