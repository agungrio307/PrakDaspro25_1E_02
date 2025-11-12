package P12;
import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);
        
        int menu02;

        String penonton02[][] = new String[4][2];

        System.out.println("==== Daftar Menu ====");
        System.out.println("Menu 1 = Input data penonton");
        System.out.println("Menu 2 = Tampilkan daftar penonton");
        System.out.println("Menu 3 = Exit");
        
        while (true) {
            System.out.println();
            System.out.print("Pilih menu : ");
            menu02 = agung.nextInt();
            agung.nextLine();

            if (menu02 == 1) {
                String nama02;
                int baris02;
                int kolom02;

                System.out.print("Masukkan nama : ");
                nama02 = agung.nextLine();
                System.out.print("Masukkan baris : ");
                baris02 = agung.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom02 = agung.nextInt();
                
                
                if (baris02 < 1 || baris02 > 4 || kolom02 < 1 || kolom02 > 2) {
                    System.out.println("Maaf, kursi yang anda pilih tidak tersedia");
                } else if (penonton02[baris02-1][kolom02-1] != null ) {
                    System.out.println("Maaf, Kursi sudah di tempati oleh " + penonton02[baris02-1][kolom02-1]);
                } else {
                    penonton02[baris02-1][kolom02-1] = nama02;
                }

            } else if (menu02 == 2) {
                System.out.println("==== Daftar Penonton ====");
                for (int i = 0; i < penonton02.length; i++) {
                    for (int j = 0; j < penonton02[i].length; j++) {
                        if (penonton02[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton02[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (menu02 == 3) {
                break;
            }


        }
    }
}
