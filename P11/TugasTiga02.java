package P11;
import java.util.Scanner;

public class TugasTiga02 {
    public static void main(String[] args) {
        
        Scanner agung = new Scanner(System.in); 

        String[] menu02 = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappuccino", 
            "Chocolate Ice"
        };

        System.out.println("===== Menu Warjo =====");
        System.out.println();
        for (int i = 0; i < menu02.length; i++) {
            System.out.println((i + 1) + ". " + menu02[i]);
        }

        String cariMenu02;

        System.out.println();
        System.out.println("Menu apa yang ingin kamu pesan?");
        System.out.print("Pilih menu : ");
        cariMenu02 = agung.nextLine();

        System.out.println();

        int key02 = -1;

        for (int i = 0; i < menu02.length; i++) {
            if (menu02[i].equalsIgnoreCase(cariMenu02)) {
                key02 = i;
                break;
            }
        }

        if (key02 != -1) {
            System.out.println("Menu " + cariMenu02 + " tersedia di menu nomor " + (key02 + 1));
        } else {
            System.out.println("Maaf, untuk menu " + cariMenu02 + " tidak tersedia di menu kami.");
            
        }

        System.out.println();
    }
}
