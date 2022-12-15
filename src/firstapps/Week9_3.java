package firstapps;

import java.util.Scanner;

public class Week9_3 {
    public static void main(String[] args) {
        // Deklarasi
        Scanner scan = new Scanner(System.in);
        int panjangArray = 0;
        int arrayAngka[];
        int nilaiMaks = 0;

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
        
        //Proses
        nilaiMaks = arrayAngka[0];
        for (int i = 1; i < panjangArray; i++) {
            if (arrayAngka[i] > nilaiMaks) {
                nilaiMaks = arrayAngka[i];
            }
        }
        
        System.out.println("Nilai Maks: "+ nilaiMaks);
    }
}
