package P12;
import java.util.Scanner;

public class SIAKAD02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);

        int jumlahSiswa02;
        int jumlahMatkul02;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahSiswa02 = agung.nextInt();
        System.out.print("Masukkan jumlah mata kuliah : ");
        jumlahMatkul02 = agung.nextInt();

        int nilai02[][] = new int[jumlahSiswa02][jumlahMatkul02];

        for (int i = 0; i < jumlahSiswa02; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            
            double totalPerSiswa02 = 0;
            for (int j = 0; j < jumlahMatkul02; j++) {
                System.out.print("Mata kuliah " + (j+1) + " : ");
                nilai02[i][j] = agung.nextInt();

                totalPerSiswa02 += nilai02[i][j];
            }

            System.out.println("Nilai rata-rata : "  + totalPerSiswa02/jumlahMatkul02);
        }

        System.out.println("\n================================");
        System.out.println("Rata-rata nilai setiap mata kuliah : ");

        for (int j = 0; j < jumlahMatkul02; j++) {

            double totalPerMatkul02 = 0;
            for (int i = 0; i < jumlahSiswa02; i++) {
                totalPerMatkul02 += nilai02[i][j];    
            }

            System.out.println("Mata kuliah " + (j+1) + " : " + totalPerMatkul02/jumlahSiswa02);
        }
    }
}
