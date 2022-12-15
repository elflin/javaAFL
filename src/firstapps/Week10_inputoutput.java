package firstapps;

import java.util.Scanner;

public class Week10_inputoutput {

    public static void main(String[] args) {

        // Deklarasi
        Scanner scan = new Scanner(System.in);
        int panjangKolom = 0;
        int panjangBaris = 0;
        int arrayAngka[][];

        // Input panjang kolom dan baris
        System.out.print("Panjang baris = ");
        panjangBaris = scan.nextInt();

        System.out.print("Panjang kolom = ");
        panjangKolom = scan.nextInt();

        // Inisialisasi Array
        arrayAngka = new int[panjangBaris][panjangKolom];

        // Menginput nilai pada Array
        for (int i = 0; i < panjangBaris; i++) { // Baris
            for (int j = 0; j < panjangKolom; j++) { // Kolom
                System.out.print(
                        "Masukan nilai array (" + i + "," + j + ") = ");
                arrayAngka[i][j] = scan.nextInt();
            }   
        }

        // Output
        for (int i = 0; i < panjangBaris; i++) {
            for (int j = 0; j < panjangKolom; j++) {
                System.out.print(arrayAngka[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
