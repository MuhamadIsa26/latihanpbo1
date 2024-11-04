/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
/**
 * nama     : muhamad isa nurfadilah
 * nim      : 23176032
 * Matkul   : PBO1
 * @author Lenovo
 */


public class Latihan2623176032 {

    public static void main(String[] args) {
        // Mendapatkan waktu saat ini berdasarkan zona waktu default
        LocalDateTime waktuSaatIni = LocalDateTime.now(ZoneId.systemDefault());

        // Memformat waktu ke dalam format yang diinginkan
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss", Locale.forLanguageTag("id-ID")); 
        String waktuTerformat = waktuSaatIni.format(formatter);

        // Menampilkan waktu yang telah diformat
        System.out.println("Hari ini adalah hari: " + waktuTerformat);
        System.out.println("Made In : Muhamad Isa Nur Fadhilah");
    }
}