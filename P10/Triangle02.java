package P10;
import java.util.Scanner;
public class Triangle02 {
    public static void main(String[] args) {
        
        int n;
        int i = 0;

        Scanner agung = new Scanner(System.in);

        System.out.print("Masukkan angka n = ");
        n = agung.nextInt();

        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");

                j++;
            }

            System.out.println("*");

            i++;
        }
    }
}
