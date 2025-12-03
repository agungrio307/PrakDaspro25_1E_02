package P14;
import java.util.Scanner;

public class NilaiMahasiswa02 {
    static void isianArray02(int[] nilai02) {
        Scanner agung = new Scanner(System.in);

        for (int i = 0; i < nilai02.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + " : ");
            nilai02[i] = agung.nextInt();
        }
    }

    static void tampilArray02(int [] nilai02) {
        System.out.println("Daftar Nilai Mahasiswa: ");
        for (int i = 0; i < nilai02.length; i++) {
            System.out.println("Mahasiswa " + (i+1) + " : " + nilai02[i]);
        }
    }

    static int hitTot02(int[] nilai02) {
        int total02 = 0;
        for (int n : nilai02) {
            total02 += n;
        }
        return total02;
    }
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlah02 = agung.nextInt();

        int[] NilaiMahasiswa02 = new int[jumlah02];

        isianArray02(NilaiMahasiswa02);
        tampilArray02(NilaiMahasiswa02);
        int total02 = hitTot02(NilaiMahasiswa02);

        System.out.println("\nTotal nilai seluruh Mahasiswa : " + total02);
    }
}
