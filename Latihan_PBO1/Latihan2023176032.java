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
public class Latihan2023176032 {
     public static void main(String[] args) {
         // Input data
         try ( // Membuat scanner untuk input dari pengguna
                 Scanner scanner = new Scanner(System.in)) {
             // Input data
             System.out.print("Masukkan Saldo Awal (Rp): ");
             double saldoAwal = scanner.nextDouble();
             System.out.print("Masukkan Bunga/Bulan (%): ");
             double bunga = scanner.nextDouble();
             System.out.print("Masukkan Saldo Target (Rp): ");
             double saldoTarget = scanner.nextDouble();
             // Variabel untuk menyimpan saldo saat ini
             double saldo = saldoAwal;
             int bulan = 0;
             // Proses perhitungan saldo setiap bulan
             while (saldo < saldoTarget) {
                 bulan++;
                 saldo += saldo * (bunga / 100);
                 System.out.printf("Saldo di bulan ke-%d Rp. %.2f%n", bulan, saldo);
             }    // Menampilkan pesan jika saldo target tercapai
             System.out.println("Saldo target Rp. " + saldoTarget + " tercapai pada bulan ke-" + bulan + ".");
             System.out.println("Made In : Muhamad Isa Nur Fadhilah");
             // Menutup scanner
         }
    }
}
