package P10;
import java.util.Scanner;

public class NilaiKelompok02 {
    public static void main(String[] args) {

        int nilai02;
        double rataNilai = 0;

        Scanner agung = new Scanner(System.in);

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            double totalNilai=0;
            for (int j = 1; j <=5; j++) {
            System.out.print(" Nilai dari kelompok Penilai " + j + " : ");
            nilai02 = agung.nextInt();
            totalNilai += nilai02;
            rataNilai = totalNilai/5;

            }

            System.out.println("Kelompok " +i+ " : nilai rata rata = " + rataNilai);

            i++;
        }
    }
}
