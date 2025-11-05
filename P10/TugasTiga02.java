package P10;
import java.util.Scanner;

public class TugasTiga02 {
    public static void main(String[] args) {
    
        int jumlah02;
        int totalPelanggan02 = 0;
        int totalItem02 = 0;
        Scanner agung = new Scanner(System.in);

        System.out.print("Jumlah cabang cafe: ");
        jumlah02 = agung.nextInt();

        System.out.println(); 
        System.out.println("==== Input Penjualan Per Cabang ====");
        // System.out.println();

        for (int i = 1; i <= jumlah02; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah Pelanggan: ");
            int jumlahPelanggan02 = agung.nextInt();

            int totalItemDariCabang02 = 0;

            for (int j = 1; j <= jumlahPelanggan02; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item02 = agung.nextInt();
                totalItemDariCabang02 += item02;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan   : " + jumlahPelanggan02 + " orang");
            System.out.println("- Item terjual: " + totalItemDariCabang02);

            totalPelanggan02 += jumlahPelanggan02;
            totalItem02 += totalItemDariCabang02;
        }

        System.out.println();
        System.out.println("TOTAL SELURUH CABANG : ");
        System.out.println("Pelanggan : " + totalPelanggan02 + " orang");
        System.out.println("Item terjual : " + totalItem02 + " item");

    }
}
