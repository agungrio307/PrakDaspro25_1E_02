package P11;
import java.util.Scanner;

public class TugasDua02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);

        int jumlahPesanan02;

        System.out.print("Masukkan jumlah pesanan : ");
        jumlahPesanan02 = agung.nextInt();
        agung.nextLine();

        String[] namaPesanan02 = new String[jumlahPesanan02];
        int[] hargaPesanan02 = new int[jumlahPesanan02];

        for (int i = 0; i < jumlahPesanan02; i++) {
            System.out.print("Nama pesanan ke-" + (i + 1) + " (Makanan/Minuman) : ");
            namaPesanan02[i] = agung.nextLine();
        }
        
        System.out.println();

        for (int i = 0; i < jumlahPesanan02; i++) {
            System.out.print("Harga " + namaPesanan02[i] + " : Rp. ");
            hargaPesanan02[i] = agung.nextInt();
        }

        int totalHarga02 = 0;

        for (int i = 0; i < jumlahPesanan02; i++) {
            totalHarga02 += hargaPesanan02[i];
        }

        System.out.println();

        for (int i = 0; i < jumlahPesanan02; i++) {
            System.out.println((i + 1) + ". "  + namaPesanan02[i] + " : Rp. " + hargaPesanan02[i]);
        }

        System.out.println();
        System.out.println("Total harga pesanan : Rp. " + totalHarga02);
        System.out.println();
    }
}
