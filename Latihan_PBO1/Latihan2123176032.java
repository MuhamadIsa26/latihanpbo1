/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 * nama     : muhamad isa nurfadilah
 * nim      : 23176032
 * Matkul   : PBO1
 * @author Lenovo
 */
public class Latihan2123176032 {

    public static void main(String[] args) {
        // Meminta input jumlah mahasiswa
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta input jumlah mahasiswa
            System.out.print("Masukkan Banyaknya Mahasiswa: ");
            int jumlahMahasiswa = scanner.nextInt();
            // Array untuk menyimpan nilai mahasiswa
            double[] nilaiMahasiswa = new double[jumlahMahasiswa];
            double totalNilai = 0;
            // Menginput nilai mahasiswa
            for (int i = 0; i < jumlahMahasiswa; i++){
                System.out.print("Nilai Mahasiswa ke-" + (i + 1) + ": ");
                nilaiMahasiswa[i] = scanner.nextDouble();
                totalNilai += nilaiMahasiswa[i]; // Menambahkan nilai ke total
            }   // Menghitung rata-rata
            double rataRata = totalNilai / jumlahMahasiswa;
            // Menampilkan hasil
            System.out.printf("Maka, Rata-rata Nilainya adalah %.2f%n", rataRata);
            System.out.println("Made In : Muhamad Isa Nur Fadhilah");
            // Menutup scanner
        }
        }
        
    }
    

