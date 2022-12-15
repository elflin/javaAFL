
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mds
 */
public class Nicky {

    public static void main(String[] args) {
        int jumlah_subject, total = 0, array_angka[] = null;
        Scanner scan = new Scanner(System.in);
        System.out.println("In how many subject have you given exams?");
        jumlah_subject = scan.nextInt();

        array_angka = new int[jumlah_subject];

        System.out.println("enter your marks obtained in subjects : ");

        for (int i = 0; i < jumlah_subject; i++) {
            array_angka[i] = scan.nextInt();
            if (array_angka[i] > 100) {
                break;
            }
            total = total + array_angka[i];
        }
        System.out.println("total marks : " + total);

        double persen = (double) total / jumlah_subject;
        System.out.println("percentage : " + persen + "%");

    }
}
