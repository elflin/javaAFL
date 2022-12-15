
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mds
 */
public class Kenny {

    public static void main(String[] args) {

        int a, b, perkalian = 0, i, j, temp, penjumlahan = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Masukkan banyak angka : ");
        a = Scan.nextInt();

        int array_angka[] = new int[a];

        for (i = 0; i < a; i++) {
            System.out.println("Masukkan angka pada index ke : " + i);
            b = Scan.nextInt();
            array_angka[i] = b;
        }

        for (i = 0; i < a; i++) {
            for (j = i + 1; j < a; j++) {
                temp = 0;
                if (array_angka[i] > array_angka[j]) {
                    temp = array_angka[i];
                    array_angka[i] = array_angka[j];
                    array_angka[j] = temp;
                }
                System.out.println("");
            }
            System.out.print("kecil-besar : ");
            System.out.print(array_angka[i] + " ");
        }
        for (i = 0; i < a; i++) {
            penjumlahan = penjumlahan + array_angka[i];
        }
        System.out.println("");
        System.out.println("hasil penjumlahan : " + penjumlahan);

        perkalian = 1;
        for (i = 0; i < a; i++) {
            perkalian = perkalian * array_angka[i];
        }
            System.out.println("");   
            System.out.println("hasil perkalian : " + perkalian);

        for (i = 0; i < a; i++) {
            for (j = i + 1; j < a; j++) {
                temp = 0;
                if (array_angka[i] < array_angka[j]) {
                    temp = array_angka[i];
                    array_angka[i] = array_angka[j];
                    array_angka[j] = temp;
                }
                System.out.println("");
            }
            System.out.print("besar-kecil : ");
            System.out.print(array_angka[i] + " ");
        }

    }

}
