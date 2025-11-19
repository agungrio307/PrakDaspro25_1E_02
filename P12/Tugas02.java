package P12;
import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jmlRespond02 = 10;
        int jmlPertanyaan02 = 6;

        int[][] survey = new int[jmlRespond02][jmlPertanyaan02];

        System.out.println("=== INPUT DATA SURVEY ===");
        System.out.println();

        for (int i = 0; i < jmlRespond02; i++) {
            System.out.println("Responden ke-" + (i + 1));

            for (int j = 0; j < jmlPertanyaan02; j++) {
                System.out.print("Nilai untuk pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("\nRATA-RATA PER RESPONDEN");
        for (int i = 0; i < jmlRespond02; i++) {
            double total02 = 0;
            for (int j = 0; j < jmlPertanyaan02; j++) {
                total02 += survey[i][j];
            }
            System.out.println("Responden " + (i + 1) + ": " + (total02 / jmlPertanyaan02));
        }

        System.out.println("\nRATA-RATA PER PERTANYAAN");
        for (int j = 0; j < jmlPertanyaan02; j++) {
            double total02 = 0;
            for (int i = 0; i < jmlRespond02; i++) {
                total02 += survey[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + ": " + (total02 / jmlRespond02));
        }

        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        double totalSemuanya02 = 0;
        int totalUntukData02 = jmlRespond02 * jmlPertanyaan02;

        for (int i = 0; i < jmlRespond02; i++) {
            for (int j = 0; j < jmlPertanyaan02; j++) {
                totalSemuanya02 += survey[i][j];
            }
        }

        System.out.println("Rata-rata keseluruhan: " + (totalSemuanya02 / totalUntukData02));
    }
}
