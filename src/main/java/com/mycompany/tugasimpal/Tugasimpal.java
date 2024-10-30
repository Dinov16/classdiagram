/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugasimpal;

/**
 *
 * @author LENOVO
 */
public class Tugasimpal {

    public static void main(String[] args) {
        // Membuat objek mobil
        AutoCarRPL mobil = new AutoCarRPL("Solar", 100);
        mobil.printDetails();

        // Membuat objek Mio (motor) yang merupakan subclass dari AutoCarRPL (Pewarisan)
        Mio mio = new Mio("Pertamax", 50);
        mio.printDetails();
    }
}
