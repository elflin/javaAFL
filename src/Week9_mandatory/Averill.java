package Week9_mandatory;

import java.util.Random;
import java.util.Scanner;

public class Averill {

    public static void main(String[] args) {
        int urutan_angka, array_angka[], berapa_kali = 0, angka_modus = 0;
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        // Panjang dari deret bilangan -> panjang array
        System.out.println("Berapa banyak angka yang ingin diurutkan?");
        urutan_angka = scan.nextInt(); // -> 10

        // Inisialisasi array
        array_angka = new int[urutan_angka];

        // Input random
        for (int i = 0; i < urutan_angka; i++) {
            int random = r.nextInt(9) + 1;
            array_angka[i] = random;

            System.out.print(array_angka[i] + " ");

        }

        // Proses
        for (int i = 0; i < urutan_angka; i++) {
            // Perhitungan jumlah angka
            int modus = 0;
            
            for (int j = i + 1; j < urutan_angka; j++) {
                if (array_angka[i] == array_angka[j]) {
                    modus++;
                }
            }
            
            // Pengecekan Modus dari deret
            if (modus > berapa_kali) {
                berapa_kali = modus;
                angka_modus = array_angka[i];

            } else if (modus == berapa_kali) {
                if (angka_modus < array_angka[i]) {
                    angka_modus = array_angka[i];
                }

            }
        }
        
        // Output
        System.out.println("Muncul angka " + angka_modus + " sebanyak " + (berapa_kali + 1));
    }
}
