package P14;
import java.util.Scanner;

public class HitungBalok02 {

    static int hitungLuas02(int pjg02, int lb02) {
        int Luas02 = pjg02 * lb02;
        return Luas02;
    }

    static int hitungVolume02(int tinggi02, int a02, int b02) {
        int Volume02 = hitungLuas02(a02, b02) * tinggi02;
        return Volume02;
    }
    public static void main(String[] args) {
        Scanner agung = new Scanner(System.in);

        int p02, l02, t02, L02, vol02;

        System.out.println("Masukkan Panjang: ");
        p02 = agung.nextInt();
        System.out.println("Masukkan Lebar: ");
        l02 = agung.nextInt();
        System.out.println("Masukkan Tinggi: ");
        t02 = agung.nextInt();

        // L02 = p02 * l02;
        // System.out.println("Luas Persegi Panjang adalah : " + L02);

        // vol02 = p02 * l02 * t02;
        // System.out.println("Volume Balok adalah : " + vol02);

        L02 = hitungLuas02(p02, l02);
        System.out.println("Luas Persegi Panjang adalah : " + L02);

        vol02 = hitungVolume02(t02, p02, l02);
        System.out.println("Volume Balok adalah : " + vol02);

    }
}
