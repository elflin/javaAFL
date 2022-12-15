
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mds
 */
public class Mitchy {

    public static void main(String[] args) {
        int urutan_angka, array_angka[], max, min;
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Berapa banyak angka yang ingin diurutkan?");
        urutan_angka = scan.nextInt();

        array_angka = new int[urutan_angka];
        

        for (int i = 0; i < urutan_angka; i++) {
            int random = r.nextInt(100) + 1;
            array_angka[i] = random;
        }

        max = array_angka [0];
        min = array_angka [0];

        for (int i = 0; i < urutan_angka; i++) {
            if (array_angka[i] < min) {
                min = array_angka[i];
            }
        }
        for (int i = 0; i < urutan_angka; i++) {
            if (array_angka[i] > max) {
                max = array_angka[i];
            }
        }
        System.out.println("Nomor yang dikumpulkan : " + Arrays.toString(array_angka));
        System.out.println("Angka Minimum : " + min);
        System.out.println("Angka Maksimum : " + max);
    }
}
