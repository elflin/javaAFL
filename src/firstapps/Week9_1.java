package firstapps;

import java.util.Scanner;

public class Week9_1 {

    public static void main(String[] args) {

        // Deklarasi
        Scanner scan = new Scanner(System.in);
        int panjangArray = 0;
        int arrayAngka[];
        int total = 0;

        // Input panjang array oleh user
        System.out.print("Masukan panjang array: ");
        panjangArray = scan.nextInt();

        // Inisialisasi array
        arrayAngka = new int[panjangArray];

        // Input nilai array
        for (int i = 0; i < panjangArray; i++) {
            System.out.println("Masukan angka " + i + ": ");
            arrayAngka[i] = scan.nextInt();
        }

        // Proses
        for (int i = 0; i < panjangArray; i++) {
            total = total + arrayAngka[i]; // total += arrayAngka[i]
        }

        // Output
        System.out.println("Total angka adalah " + total);
    }
}
