package P11;
import java.util.Scanner;

public class SearchNilai022 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in);
        
        int banyakNilai02;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        banyakNilai02 = agung.nextInt();

        int nilaiMhs02[] = new int[banyakNilai02];

        for (int i = 0; i < nilaiMhs02.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs02[i] = agung.nextInt();
        }

        int key02;
        int hasil02 = -1;

        System.out.print("Masukkan nilai yang ingin dicari : ");
        key02 = agung.nextInt();
        

        for (int i = 0; i < nilaiMhs02.length; i++) {
            if (key02 == nilaiMhs02[i]) {
                hasil02 = i;

                break;
            }
        }
        
        if (hasil02 != -1) {
            System.out.println();
            System.out.println("Nilai " + key02 + " ketemu, merupakan nilai mahasiswa ke-" + hasil02);
        } else {
            System.out.println();
            System.out.println("Nilai yang dicari tidak ditemukan");
            
        }
        
        System.out.println();
    }
}
