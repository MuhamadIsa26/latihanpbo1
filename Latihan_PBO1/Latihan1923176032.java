/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;



/**
 * nama     : muhamad isa nurfadilah
 * nim      : 23176032
 * Matkul   : PBO1
 * @author Lenovo
 */
public class Latihan1923176032 {  // Nama kelas diawali huruf besar dan tanpa underscore
    public static void main(String[] args) {
        // Input saldo awal
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Made In : Muhamad Isa Nur Fadhilah");
            // Input saldo awal
            System.out.print("Masukkan saldo awal (Rp): ");
            double saldoAwal = scanner.nextDouble();
            // Input bunga per bulan
            System.out.print("Masukkan bunga per bulan (%) : ");
            double bungaPerBulan = scanner.nextDouble();
            // Input lama menabung dalam bulan
            System.out.print("Masukkan lama menabung (bulan): ");
            int lamaMenabung = scanner.nextInt();
            // Menghitung saldo setiap bulan
            double saldo = saldoAwal;
            for (int bulan = 1; bulan <= lamaMenabung; bulan++) {
                // Menghitung bunga untuk bulan ini
                saldo += saldo * (bungaPerBulan / 100);
                // Menampilkan saldo di bulan ini
                System.out.printf("Saldo di bulan ke-%d: Rp. %.2f%n", bulan, saldo);
                
            }
            // Menutup scanner
        }
    }
}