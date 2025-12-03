package P14;
import java.util.Scanner;

public class RekapPenjualanCafe02 {
    static String[] menu02 = {
        "kopi",
        "Teh",
        "Es Kelapa Muda",
        "Roti Bakar",
        "Gorengan"
    };

    static void inputData02(int[][] penjualan02) {
        Scanner agung = new Scanner(System.in);

        for (int i = 0; i < menu02.length; i++) {
            System.out.println("\nMenu : " + menu02[i]);
                for (int j = 0; j < 7; j++) {
                    System.out.print("Hari ke-" + (j+1) + ": ");
                    penjualan02[i][j] = agung.nextInt();
                }
        }
    }

    static void tampilData02(int[][] penjualan02) {
        System.out.println("--- TABEL PENJUALAN 7 HARI ---");
        System.out.printf("%-15s", "Menu");

        for (int i = 0; i <= 7; i++) {
            System.out.printf("Hari %d ", i);
        }
        System.out.println();

        for (int i = 0; i < menu02.length; i++) {
            System.out.printf("%-15s", menu02[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-7d ", penjualan02[i][j]);
            }
            System.out.println();
        }
    }

    static void menuTertinggi02(int[][] penjualan02) {
        int totalMax02 = -1;
        String menuMax02 = "";

        for (int i = 0; i < menu02.length; i++) {
            int total02 = 0;
            for (int j = 0; j < 7; j++) {
                total02 += penjualan02[i][j];
            }

            if (total02 > totalMax02) {
                totalMax02 = total02;
                menuMax02 = menu02[i];
            }
        }

        System.out.println("--- MENU DENGAN PENJUALAN TERTINGGI ---");
        System.out.println("Menu : " + menuMax02);
        System.out.println("Total penjualan : " + totalMax02);
    }

    static void rataRataMenu02(int[][] penjualan02) {
        System.out.println("--- RATA RATA PENJUALAN ---");

        for (int i = 0; i < menu02.length; i++) {
            int total02 = 0;
            for (int j = 0; j < 7; j++) {
                total02 += penjualan02[i][j];
            }

            double rata02 = (double) total02/7;
            System.out.printf("%-15s : %.2f\n", menu02[i], rata02);
        }
    }
    public static void main(String[] args) {
        int[][] penjualan02 = new int[5][7];

        inputData02(penjualan02);
        tampilData02(penjualan02);
        menuTertinggi02(penjualan02);
        rataRataMenu02(penjualan02);
    }
}
