/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasimpal;

/**
 *
 * @author LENOVO
 */
public class Mio extends AutoCarRPL {
    public Mio(String bahanBakar, int kecepatan) {
        super(bahanBakar, kecepatan);
    }

    @Override
    public void printDetails() {
        System.out.println("Mio menggunakan bahan bakar tipe: Pertamax");
        System.out.println("Mio mulai berjalan.");
        System.out.println("Mio sedang dikendarai dengan cepat.");
        System.out.println("Bahan bakar: " + super.getBahanBakar());
        System.out.println("Kecepatan: " + super.getKecepatan());
        System.out.println("Tipe mesin: Mesin Bensin");
    }

    @Override
    public void start() {
        System.out.println("Motor Mio dinyalakan");
    }

    @Override
    public void drive() {
        System.out.println("Motor Mio berjalan dengan kecepatan " + getKecepatan() + " km/jam dan bahan bakar " + getBahanBakar());
    }
}


