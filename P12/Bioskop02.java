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

        System.out.println();
        System.out.printf("%s \t %s \n", penonton02[0][0], penonton02 [0][1]);
        System.out.printf("%s \t %s \n", penonton02[1][0], penonton02 [1][1]);
        System.out.printf("%s \t %s \n", penonton02[2][0], penonton02 [2][1]);
        System.out.printf("%s \t %s \n", penonton02[3][0], penonton02 [3][1]);
        System.out.println();

        System.out.println(penonton02.length);
        System.out.println();

       for (String[] barisPenonton02 : penonton02) {
             System.out.println("Panjang baris : " + barisPenonton02.length);
       }

       System.out.println();
       System.out.println("Penonton pada baris ke-3 : ");

       for (String i : penonton02[2]) {
            System.out.println(i);
       }

    }
}
