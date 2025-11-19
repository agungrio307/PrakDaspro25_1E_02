package P12;
import java.util.Scanner;

public class SIAKAD02 {
    public static void main(String[] args) {

        Scanner agung = new Scanner(System.in);
        
        int nilai02[][] = new int[4][3];

        for (int i = 0; i < nilai02.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            
            double totalPerSiswa02 = 0;
            for (int j = 0; j < nilai02[i].length; j++) {
                System.out.print("Mata kuliah " + (j+1) + " : ");
                nilai02[i][j] = agung.nextInt();

                totalPerSiswa02 += nilai02[i][j];
            }

            System.out.println("Nilai rata-rata : "  + totalPerSiswa02/3);
        }

        System.out.println("\n================================");
        System.out.println("Rata-rata nilai setiap mata kuliah : ");

        for (int j = 0; j < 3; j++) {

            double totalPerMatkul02 = 0;
            for (int i = 0; i < 4; i++) {
                totalPerMatkul02 += nilai02[i][j];    
            }

            System.out.println("Mata kuliah " + (j+1) + " : " + totalPerMatkul02/4);
        }
    }
}
