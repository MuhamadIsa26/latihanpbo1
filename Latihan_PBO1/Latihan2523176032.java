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


public class Latihan2523176032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();

        System.out.println("Ejaan untuk \"" + nama + "\" adalah:");

        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }
        long startTime = 0;

        System.out.println("BUILD SUCCESSFUL (total time: " + (System.currentTimeMillis() - startTime) + " milliseconds)");
        System.out.println("Made In : Muhamad Isa Nur Fadhilah");
    }
}