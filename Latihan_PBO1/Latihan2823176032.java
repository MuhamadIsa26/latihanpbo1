import java.util.Scanner;

/**
 * nama     : muhamad isa nurfadilah
 * nim      : 23176032
 * Matkul   : PBO1
 * @author Lenovo
 */
public class Latihan2823176032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata : ");
        String kataAsli = scanner.nextLine();

        System.out.print("Menjadi Kata : ");
        String kataBaru = scanner.nextLine();

        String kalimatBaru = kalimat.replaceAll(kataAsli, kataBaru);

        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimatBaru);
        System.out.println("Made In : Muhamad Isa Nur Fadhilah");
    }
}