package P14;

public class PengunjungCafe02 {
    public static void daftarPengunjung02(String...namaPengunjung02) {
        System.out.println("Daftar Nama Pengunjung: ");

        for (int i = 0; i < namaPengunjung02.length; i++) {
            System.out.println("- " + namaPengunjung02[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung02("Ali", "Budi", "Citra");
        daftarPengunjung02("Andi");
        daftarPengunjung02("Doni", "Eti", "Fahmi", "Galih");
        
    }
}
