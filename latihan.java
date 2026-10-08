/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul09;

/**
 *
 * @author Dante
 */
import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Scanner rentalMobil = new Scanner(System.in);
        System.out.print("Masukkan jumlah jam sewa: ");
        int jamSewa = rentalMobil.nextInt();
        System.out.print("Masukkan tarif perjam: ");
        int tarifJam = rentalMobil.nextInt();
        int totalBiaya = jamSewa*tarifJam;
        System.out.println();
        System.out.println("_________________________");
        System.out.println("Total biaya sewa: "+totalBiaya);
    }
}
