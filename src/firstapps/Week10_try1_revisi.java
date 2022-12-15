package firstapps;

import java.util.Scanner;

/**
 *
 * @author kindl
 */
public class Week10_try1_revisi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int baris = 3;
        int kolom = 3;
        
        int [][] tabel1 = new int[baris][kolom];
        int [][] tabel2 = new int[baris][kolom];
        int [][] tabelHasil = new int[baris][kolom];
        
        // Input tabel 1
        System.out.println("Untuk tabel pertama:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("Masukkan bilangan (%d, %d): ", i+1, j+1);
                tabel1[i][j] = scan.nextInt();
            }
        }
        // Input tabel 2
        System.out.println("Untuk tabel kedua:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("Masukkan bilangan (%d, %d): ", i+1, j+1);
//                System.out.println("Masukan bilangan ("+i+1+","+j+1+")");
                tabel2[i][j] = scan.nextInt();
            }
        }
        
        // proses penambahan
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                tabelHasil[i][j] = tabel1[i][j] + tabel2[i][j];
            }
        }
        
        // output
        System.out.println("");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("%d ", tabel1[i][j]);
            }
            if (i == 1) {
                System.out.print("+\t");
            } else {
                System.out.print("\t");
            }
            
            for (int j = 0; j < kolom; j++) {
                System.out.printf("%d ", tabel2[i][j]);
            }
            if (i == 1) {
                System.out.print("=\t");
            } else {
                System.out.print("\t");
            }
            
            for (int j = 0; j < kolom; j++) {
                System.out.printf("%d ", tabelHasil[i][j]);
            }
            
            System.out.println("");
        }
    }
}
