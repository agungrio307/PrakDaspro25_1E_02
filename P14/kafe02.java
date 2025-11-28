package P14;
import java.util.Scanner;

public class kafe02 {
    public static void Menu02(String namaPelanggan02, boolean isMember02, String kodePromo02) {
        System.out.println("Selamat datang, " + namaPelanggan02 + "!");
        
        if (isMember02) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        } 

        if (kodePromo02.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon tambahan 50%!");
        } else if (kodePromo02.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon tambahan 30%!");
        } else {
            System.out.println("Kode promo invalid atau tidak tersedia.");
        }



        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");   
        System.out.println("5. Roti Bakar - Rp 10,000");   
        System.out.println("6. Mie Goreng - Rp 18,000");   
        System.out.println("=".repeat(20));   
        System.out.println("Silahkan plih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga02(int pilihanMenu02, int banyakItem02) {
        int[] hargaItems02 = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal02 = hargaItems02[pilihanMenu02 - 1] * banyakItem02;
        return hargaTotal02;
    }
        
        public static void main(String[] args) {
            Scanner agung = new Scanner(System.in);

            Menu02("Andi", true, "DISKON50");
            Menu02("Budi", true, "DISKON30");
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu02 = agung.nextInt();  
            System.out.print("Masukkan banyak item yang ingin Anda pesan: ");
            int banyakItem02 = agung.nextInt();
        
            int totalHarga02 = hitungTotalHarga02(pilihanMenu02, banyakItem02);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga02);
        }
    }