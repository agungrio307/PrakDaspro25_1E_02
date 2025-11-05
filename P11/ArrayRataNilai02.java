package P11;
import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);
        int[] nilaiMhs02 = new int[10];
        double total02 = 0;
        double rata2_02;
        int jumlahMhsLulus02 = 0;

        for (int i = 0; i < nilaiMhs02.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs02[i] = agung.nextInt();
        }

        for (int i = 0; i < nilaiMhs02.length; i++) {
            total02 += nilaiMhs02[i];

            if (nilaiMhs02[i] > 70) {
                jumlahMhsLulus02++;
            }
        }

        rata2_02 = total02/nilaiMhs02.length;
        System.out.println("Rata-rata nilai = " + rata2_02);
        System.out.println("Banyak mahasiswa yang lulus = " + jumlahMhsLulus02);
    }
}
