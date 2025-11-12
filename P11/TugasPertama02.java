package P11;
import java.util.Scanner;

public class TugasPertama02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);

        int banyakNilai02;
        int jumlahNilai02 = 0;
        double rataNilai02;

        System.out.print("Banyak nilai Mahasiswa : ");
        banyakNilai02 = agung.nextInt();
        
        int nilaiMhs02[] = new int[banyakNilai02];

        for (int i = 0; i < nilaiMhs02.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
            nilaiMhs02[i] = agung.nextInt();
        }

        for (int i = 0; i < nilaiMhs02.length; i++) {
            
            jumlahNilai02 += nilaiMhs02[i];
        }
        
            int nilaiTertinggi02 = nilaiMhs02[0];
            int nilaiTerendah02 = nilaiMhs02[0];
        
        for (int i = 0; i < nilaiMhs02.length; i++) {
                       
            if (nilaiMhs02[i] > nilaiTertinggi02) {
                nilaiTertinggi02 = nilaiMhs02[i];
            } 

            if (nilaiMhs02[i] < nilaiTerendah02) {
                nilaiTerendah02 = nilaiMhs02[i];
            }
        }
        System.out.println();
        System.out.println("---- Daftar Nilai Mahasiswa ----");
        System.out.println();
        for (int i = 0; i < nilaiMhs02.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " : " + nilaiMhs02[i]);
        }
        
        rataNilai02 = jumlahNilai02 / banyakNilai02;
        
        System.out.println();
        System.out.println("Nilai tertinggi = " + nilaiTertinggi02);
        System.out.println("Nilai terendah = " + nilaiTerendah02);
        System.out.println("Rata-rata nilai : " + rataNilai02);

    }
}
