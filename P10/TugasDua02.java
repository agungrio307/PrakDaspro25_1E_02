package P10;
import java.util.Scanner;

public class TugasDua02 {
    public static void main(String[] args) {
        int n;

        Scanner agung = new Scanner (System.in);

        System.out.print("Masukkan nilai n (minimal 3) : ");
        n = agung.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {

                    System.out.print(" " + n);

                } else {

                    System.out.print("  ");

                }
            }

            System.out.println();

        }

    }
}
