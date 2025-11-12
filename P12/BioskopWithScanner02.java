package P12;
import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);
        
        String nama02;
        String next02;
        int baris02;
        int kolom02;


        String penonton02[][] = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama02 = agung.nextLine();
            System.out.print("Masukkan baris : ");
            baris02 = agung.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom02 = agung.nextInt();
            agung.nextLine();

            penonton02[baris02-1][kolom02-1] = nama02;

            System.out.print("Input penonton lainnya? (y/n) : ");
            next02 = agung.nextLine();

            if (next02.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
