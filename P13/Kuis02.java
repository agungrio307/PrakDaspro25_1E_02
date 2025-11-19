package P13;
import java.util.Scanner;

public class Kuis02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);

        String[] nama02 = {"Sito", "Semi", "Risma", "Vero", "Barri"};
        String[] Bulan02 = {"Januari", "Februari", "Maret", "April"};
        
        int[][] Penjualan02 = {
            {2, 3, 4, 6},
            {3, 3, 3, 2},
            {4, 4, 5, 5},
            {1, 3, 3, 8},
            {2, 2, 2, 2}
        };
        
        int sepeda02 = 1000000;
        double diskon02 = 0.05;


        for (int i = 0; i < Penjualan02.length; i++) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %n",nama02[i],  Bulan02[0], Bulan02[1], Bulan02[2], Bulan02[3]);
            System.out.print("                     ");
            for (int j = 0; j < Penjualan02[i].length; j++) {
                Penjualan02[i][j] = Penjualan02[i][j] * sepeda02;
                System.out.print((Penjualan02[i][j]) + "              ");
            }
            System.out.println();
            System.out.println();
        }

        double total02 = 0;
        for (int i = 0; i < Penjualan02.length; i++) {
            total02 = 0;
            for (int j = 0; j < Penjualan02[i].length; j++) {
                
                total02 += Penjualan02[i][j];
            }
             System.out.println("Total penjualan tiap bulan : " + (total02));
        }
        

       


    }
}
