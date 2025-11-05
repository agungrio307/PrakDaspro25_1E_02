package P11;
import java.util.Scanner;

public class ArrayNilai02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);

        int[] nilaiAkhir02 = new int[10];

        for (int i = 0; i < nilaiAkhir02.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir02[i] = agung.nextInt();
        }

        for (int i = 0; i < nilaiAkhir02.length; i++) {
            if (nilaiAkhir02[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " lulus!");
            }
        }
    }
}
