import java.util.Scanner;

/**
 * nama     : muhamad isa nurfadilah
 * nim      : 23176032
 * Matkul   : PBO1
 * @author Lenovo
 */
public class Latihan2923176032 {

    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String MERAH = "\u001B[31m"; // Red
    public static final String HIJAU = "\u001B[32m"; // Green
    public static final String KUNING = "\u001B[33m"; // Yellow
    public static final String BIRU = "\u001B[34m"; // Blue
    public static final String UNGU = "\u001B[35m"; // Purple

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display color menu vertically
        System.out.println("YUK CEK KEPRIBADIANMU DARI WARNA FAVORITMU");
        System.out.println(MERAH + "MERAH" + RESET);
        System.out.println(HIJAU + "HIJAU" + RESET);
        System.out.println(KUNING + "KUNING" + RESET);
        System.out.println(BIRU + "BIRU" + RESET);
        System.out.println(UNGU + "UNGU" + RESET);

        // Ask user to choose a favorite color
        System.out.print("PILIH WARNA FAVORITMU: ");
        String warnaFavorit = scanner.nextLine().toUpperCase();

        // Prompt for user's name
        System.out.print("MASUKKAN NAMA ANDA: ");
        String nama = scanner.nextLine();

        // Display personality test results
        System.out.println("===HASIL TEST KEPRIBADIAN===");
        System.out.println("Nama: " + nama);
        System.out.println("Warna Favoritmu adalah " + warnaFavorit);
        System.out.println("Made In : Muhamad Isa Nur Fadhilah");

        switch (warnaFavorit) {
            case "MERAH":
                System.out.println(MERAH + "1. Berani dan penuh semangat" + RESET);
                System.out.println(MERAH + "2. Pemimpin yang kuat dan penuh percaya diri" + RESET);
                System.out.println(MERAH + "3. Suka menjadi pusat perhatian" + RESET);
                System.out.println(MERAH + "4. Mudah tersinggung" + RESET);
                System.out.println(MERAH + "5. Bersemangat dan energik" + RESET);
                break;
            case "HIJAU":
                System.out.println(HIJAU + "1. Bertanggung jawab dan pekerja keras" + RESET);
                System.out.println(HIJAU + "2. Suka menolong dan peduli terhadap orang lain" + RESET);
                System.out.println(HIJAU + "3. Penyayang dan penyabar" + RESET);
                System.out.println(HIJAU + "4. Mudah merasa cemas" + RESET);
                System.out.println(HIJAU + "5. Memprioritaskan keseimbangan dan harmoni" + RESET);
                break;
            case "KUNING":
                System.out.println(KUNING + "1. Optimis dan positif" + RESET);
                System.out.println(KUNING + "2. Ceria dan suka bergaul" + RESET);
                System.out.println(KUNING + "3. Kreatif dan penuh ide" + RESET);
                System.out.println(KUNING + "4. Mudah bosan dan ingin mencoba hal baru" + RESET);
                System.out.println(KUNING + "5. Suka berbagi kebahagiaan" + RESET);
                break;
            case "BIRU":
                System.out.println(BIRU + "1. Tenang dan damai" + RESET);
                System.out.println(BIRU + "2. Suka berpikir dan analitis" + RESET);
                System.out.println(BIRU + "3. Setia dan dapat diandalkan" + RESET);
                System.out.println(BIRU + "4. Terkadang bisa terlalu serius" + RESET);
                System.out.println(BIRU + "5. Menghargai kejujuran dan integritas" + RESET);
                break;
            case "UNGU":
                System.out.println(UNGU + "1. Kreatif dan imajinatif" + RESET);
                System.out.println(UNGU + "2. Suka misteri dan hal-hal yang tidak biasa" + RESET);
                System.out.println(UNGU + "3. Memiliki jiwa seni yang tinggi" + RESET);
                System.out.println(UNGU + "4. Terkadang bisa merasa terasing" + RESET);
                System.out.println(UNGU + "5. Memiliki pemikiran yang unik dan berbeda" + RESET);
                break;
            default:
                System.out.println("Warna yang Anda pilih tidak dikenali. Silakan pilih dari warna yang tersedia.");
                
                break;
        }

        // Menutup scanner
        scanner.close();
    }
}