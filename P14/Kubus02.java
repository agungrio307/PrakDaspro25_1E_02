package P14;

public class Kubus02 {
    static int volumeKubus02(int sisi02) {
        return sisi02 * sisi02 * sisi02; 
    }

    static int luasPermukaanKubus02(int sisi02) {
        return 6 * sisi02 * sisi02; 
    }

    public static void main(String[] args) {
        int sisi02 = 4;

        int volume02 = volumeKubus02(sisi02);
        int luasPermukaan02 = luasPermukaanKubus02(sisi02);

        System.out.println("Nilai Sisi Kubus: " + sisi02);
        System.out.println("Volume Kubus: " + volume02);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan02)
    }
}
