/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugasimpal;

/**
 *
 * @author LENOVO
 */
public class Mesin {
    private String tipe;

    public Mesin(String tipe) {
        this.tipe = tipe;
        System.out.println("Mesin dibuat dengan tipe: " + tipe);
    }

    public String getTipe() {
        return tipe;
    }
}
