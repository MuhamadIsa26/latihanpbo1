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
public class Latihan2223176032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("======Perhitungan Lingkaran=====\n");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String input = scanner.nextLine();

            try {
                double diameter = Double.parseDouble(input);
                if (diameter <= 0) {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                } else {
                    double jariJari = diameter / 2;
                    double luas = Math.PI * jariJari * jariJari;
                    double keliling = 2 * Math.PI * jariJari;

                    System.out.println("======Hasil Perhitungan Lingkaran=====");
                    System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
                    System.out.println("Luas Lingkaran = " + luas + " cm");
                    System.out.println("Keliling Lingkaran = " + keliling + " cm");
                    System.out.println("BUILD SUCCESSFUL");
                    System.out.println("Made In : Muhamad Isa Nur Fadhilah");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
                
            }
        }
    }
}
