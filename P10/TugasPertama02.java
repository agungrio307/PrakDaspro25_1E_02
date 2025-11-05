package P10;
import java.util.Scanner;

public class TugasPertama02 {
    public static void main(String[] args) {

        int n;

        Scanner agung = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        n = agung.nextInt();
 
        for (int i = 1; i <= n; i++) {
            
            int jumlahKuadrat02 = 0;
            System.out.print("n = " + i + " -> ");

            for (int j = 1; j <= i; j++) {
                
                int jumlah02 = 0;
                for (int k = 1; k <= j; k++) {
                    jumlah02 += j;
                }

                jumlahKuadrat02 += jumlah02;
                System.out.print(jumlah02);

                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + jumlahKuadrat02);
        }

    }
}
