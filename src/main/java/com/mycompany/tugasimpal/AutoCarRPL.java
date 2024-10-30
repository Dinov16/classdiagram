/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasimpal;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class AutoCarRPL implements Transportasi {
    private String bahanBakar;
    private int kecepatan;
    private ArrayList<Roda> roda; // Agregasi dengan Roda
    private Setir setir; // Asosiasi dengan Setir
    private Mesin mesin; // Komposisi dengan Mesin

    public AutoCarRPL(String bahanBakar, int kecepatan) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        
        // Komposisi: Mesin dibuat bersama dengan AutoCarRPL
        this.mesin = new Mesin("Mesin Bensin");
        
        // Agregasi: Roda diinisialisasi di dalam AutoCarRPL, tetapi bisa ada di luar
        this.roda = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            this.roda.add(new Roda());
        }

        // Asosiasi: Setir diinisialisasi dan dapat ditambahkan
        this.setir = new Setir();
    }
    
    public String getBahanBakar() {
        return bahanBakar;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // Menambahkan setir (Asosiasi)
    public void addSetir(Setir s) {
        this.setir = s;
    }

    // Mengisi bahan bakar menggunakan Fuel (Dependency)
    public void isiBahanBakar(Fuel fuel) {
        System.out.println("Menggunakan bahan bakar tipe: " + fuel.getJenisBahanBakar());
    }

    public void printDetails() {
        System.out.println("Bahan bakar: " + this.bahanBakar);
        System.out.println("Kecepatan: " + this.kecepatan);
        this.isiBahanBakar(new Fuel("Pertamax"));
        System.out.println("Mobil mulai berjalan.");
        System.out.println("Mobil sedang dikendarai.");
        System.out.println("Setir sudah terpasang.");
        System.out.println("Jumlah roda: " + this.roda.size());
        System.out.println("Tipe mesin: " + mesin.getTipe());
        System.out.println("----");
    }

    @Override
    public void start() {
        System.out.println("Mobil dinyalakan");
    }

    @Override
    public void drive() {
        System.out.println("Mobil berjalan dengan kecepatan " + kecepatan + " km/jam dan bahan bakar " + bahanBakar);
    }
}
