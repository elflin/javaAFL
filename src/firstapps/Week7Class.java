package firstapps;

import java.util.Scanner;

public class Week7Class {

    public static void main(String[] args) {
        // Deklarasi dan Inisialisasi Variabel
        int angka1 = 0;
        int angka2 = 0;
        int inputMenu = 0;
        Scanner scan = new Scanner(System.in);

        while(inputMenu != 4) {
            // Menu
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Faktorial");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            inputMenu = scan.nextInt();

            // Decision menu
            if (inputMenu == 1) {
                System.out.print("Masukan angka 1: ");
                angka1 = scan.nextInt();

                System.out.print("Masukan angka 2: ");
                angka2 = scan.nextInt();

                System.out.println("Hasil penjumlahan = " + (angka1 + angka2));
            } else if (inputMenu == 2) {
                System.out.print("Masukan angka 1: ");
                angka1 = scan.nextInt();

                System.out.print("Masukan angka 2: ");
                angka2 = scan.nextInt();

                System.out.println("Hasil pengurangan = " + (angka1 - angka2));
            } else if (inputMenu == 3) {
                System.out.print("Masukan angka: ");
                angka1 = scan.nextInt();

                // 5! = 1 * 2 * 3 * 4 * 5
                long total = 1;

                for (int i = 1; i <= angka1; i++) {
                    total = total * i;
                }

                System.out.println("Hasil adalah " + total);
            } else if (inputMenu == 4) {
                System.out.println("Sudah selesai menghitung. Sampai jumpa ^_^");
            } else {
                System.out.println("Pilihan mu tidak tepat untuk masa depan mu");
            }
        }
    }

}
