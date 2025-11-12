package P11;

public class SearchNilai022 {
    public static void main(String[] args) {
        
        int[] arrNIlai02 = {80, 85, 78, 96, 90, 82, 86};
        int key02 = 90;
        int hasil02 = 0; 

        for (int i = 0; i < arrNIlai02.length; i++) {
            if (key02 == arrNIlai02[i]) {
                hasil02 = i;
                break;
            }
        }

        System.out.println();
        System.out.println("Nilai " + key02 + " ketemu di indeks ke-" + hasil02);
        System.out.println();
    }
}
