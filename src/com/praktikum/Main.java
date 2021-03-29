/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum;
import java.util.Scanner;

/**
 *
 * @author cemil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String nama,nim;
        int uts,uas,usia;
        int menu;
        boolean selesai = false;
        
        Scanner getInput = new Scanner(System.in);
        Scanner getMenu = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = getInput.nextLine();
        System.out.print("Masukkan NIM Mahasiswa : ");
        nim = getInput.next();
        System.out.print("Masukkan Usia Mahasiswa : ");
        usia = getInput.nextInt();
        System.out.print("Masukkan Nilai UTS Mahasiswa : ");
        uts = getInput.nextInt();
        System.out.print("Masukkan Nilai UAS Mahasiswa : ");
        uas = getInput.nextInt();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama,nim,usia,uts,uas);
        
        do{
            System.out.println("======== MENU =========");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            menu = getMenu.nextInt();
            
           switch(menu){
               case 1:
                    mahasiswa.showMahasiswa();
               break;
               case 2:
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    nama = getInput.next();
                    System.out.print("Masukkan NIM Mahasiswa : ");
                    nim = getInput.next();
                    System.out.print("Masukkan Usia Mahasiswa : ");
                    usia = getInput.nextInt();
                    System.out.print("Masukkan Nilai UTS Mahasiswa : ");
                    uts = getInput.nextInt();
                    System.out.print("Masukkan Nilai UAS Mahasiswa : ");
                    uas = getInput.nextInt();
                    mahasiswa.updateMahasiswa(nama, nim, usia, uts, uas);
               break;
               case 3:
                    selesai = true;
               break;
           }
        } while(!selesai);
    }
}
