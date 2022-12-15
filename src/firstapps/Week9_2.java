package firstapps;

import java.util.Scanner;

public class Week9_2 {

    public static void main(String[] args) {
        // Deklarasi
        Scanner scan = new Scanner(System.in);
        int panjangArray = 0;
        int arrayAngka[];
        int yangDicari = 0;

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

        // Input yang dicari
        System.out.print("Masukan nilai yang dicari: ");
        yangDicari = scan.nextInt();

        // Proses pencarian
        for (int i = 0; i < panjangArray; i++) {
            if (yangDicari == arrayAngka[i]) {
                System.out.println("Index/lokasi = " + i);
                break;
            }else if(i == panjangArray - 1){
                System.out.println("Not found");
            }
        }
    }

}
