

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
public class Latihan1723176032 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Berapa gaji pokok anda perbulan?: ");
    double gajiPokok = scanner.nextDouble();
    System.out.print("Status Anda?(Menikah/Belum): ");
    String status = scanner.next();
    
    if (status.equalsIgnoreCase("Menikah")){
    double tunjangan = gajiPokok * 0.35;
    System.out.println("""
                       Gaji PokokHasil Perhitungan Gaji Anda
                       """ + gajiPokok + "\n" + "Tunjangan " + tunjangan + "\n" + "Total Gaji " + (gajiPokok + tunjangan));
    }else{
    System.out.println("Anda belum menikah, sehingga tidak mendapatkan tunjangan.");
     System.out.println("Made In : Muhamad Isa Nur Fadhilah");
            // Menutup scanner
    }
    }
}
        
  
