package P12;

public class Bioskop02 {
    public static void main(String[] args) {
        
        String[][] penonton02 = new String[4][2];
        
        penonton02[0][0] = "Amin";
        penonton02[0][1] = "Bena";
        penonton02[1][0] = "Candra";
        penonton02[1][1] = "Dela";
        penonton02[2][0] = "Eka";
        penonton02[2][1] = "Farhan";
        penonton02[3][0] = "Gisel";
        penonton02[3][1] = "Hana";

        for (int i = 0; i < penonton02.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + " : " + String.join(", ", penonton02[i]));
        }
    }
}
