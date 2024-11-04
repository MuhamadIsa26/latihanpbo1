/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * nama     : muhamad isa nurfadilah
 * nim      : 23176032
 * Matkul   : PBO1
 * @author Lenovo
 */
import java.util.Scanner;

public class Latihan3023176032 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("run:\nKamu ngerjain sendiri latihan 17 sampe latihan 30 ini?\nJawab (Yoi/Enggak): ");
            String jawab = scanner.nextLine();
            System.out.println("Made In : Muhamad Isa Nur Fadhilah");
                System.out.println("Muhamad Isa Nur Fadhilah ANAK BAIK");
            
            if (jawab.equalsIgnoreCase("Yoi")) {
                System.out.println("Cakep Bener. Good Job");
            } else if (jawab.equalsIgnoreCase("Enggak")) {
                System.out.println("Tetep cakep sih.\nSing penting paham konsep nya yee.\nKeep the code works dude");
            } else {
                System.out.println("Harap jawab Yoi atau Enggak!");
                
            }
        }
    }
}

