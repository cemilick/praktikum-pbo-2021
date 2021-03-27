/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum;

/**
 *
 * @author cemil
 */
public class Mahasiswa {
    private String nama,nim;
    private int usia;
    private float rata2;
    
    Mahasiswa(String nama, String nim, int usia, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.rata2 = this.hitungRata2(uts,uas);
    }
    
    public void updateMahasiswa(String nama, String nim, int usia, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.rata2 = this.hitungRata2(uts,uas);
    }
    
    public void showMahasiswa(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("NIM         : " + this.nim);
        System.out.println("Usia        : " + this.usia + " tahun");
        System.out.println("Nilai Rata2 : " + this.rata2);
    }
    
    public float hitungRata2(int uts, int uas){
        return (float)((uts+uas)/2);
    }
    
}
