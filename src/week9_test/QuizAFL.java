package week9_test;

import java.util.Scanner;

public class QuizAFL {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x1, y1, x2, y2, x3, y3, x4, y4;
        float xt, yt;
        int jumlahTitik = 0;
        double t = 0;
        double penambahan = 1;
        int pilih = 0;

        do {
            
            t = 0;
            penambahan = 1;
            
            System.out.println("Kalkulator Bézier curves");
            System.out.println("1. Quadratic Bézier curves");
            System.out.println("2. Cubic Bézier curves");
            System.out.println("0. Selesai");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();

            if (pilih == 1) {

                System.out.println("Quadratic Bézier curves");
                System.out.print("Masukan point X1 = ");
                x1 = scan.nextInt();
                System.out.print("Masukan point Y1 = ");
                y1 = scan.nextInt();

                System.out.print("\nMasukan point X2 = ");
                x2 = scan.nextInt();
                System.out.print("Masukan point Y2 = ");
                y2 = scan.nextInt();

                System.out.print("\nMasukan point X3 = ");
                x3 = scan.nextInt();
                System.out.print("Masukan point Y3 = ");
                y3 = scan.nextInt();

                System.out.print("\nMasukan banyak titik yang ingin di munculkan = ");
                jumlahTitik = scan.nextInt();

                penambahan /= jumlahTitik;
                System.out.println(penambahan);

                System.out.println("\nKoordinat");
                for (int i = 0; i <= jumlahTitik; i++) {
                    xt = (float) ((Math.pow((1 - t), 2) * x1) + (2 * (1 - t) * t * x2) + (Math.pow(t, 2) * x3));
                    yt = (float) ((Math.pow((1 - t), 2) * y1) + (2 * (1 - t) * t * y2) + (Math.pow(t, 2) * y3));
                    t += penambahan;
                    System.out.println("X: " + xt + " Y:" + yt);
                }

            } else if (pilih == 2) {
                
                System.out.println("Cubic Bézier curves");
                System.out.print("Masukan point X1 = ");
                x1 = scan.nextInt();
                System.out.print("Masukan point Y1 = ");
                y1 = scan.nextInt();

                System.out.print("\nMasukan point X2 = ");
                x2 = scan.nextInt();
                System.out.print("Masukan point Y2 = ");
                y2 = scan.nextInt();

                System.out.print("\nMasukan point X3 = ");
                x3 = scan.nextInt();
                System.out.print("Masukan point Y3 = ");
                y3 = scan.nextInt();
                
                System.out.print("\nMasukan point X4 = ");
                x4 = scan.nextInt();
                System.out.print("Masukan point Y4 = ");
                y4 = scan.nextInt();

                System.out.print("\nMasukan banyak titik yang ingin di munculkan = ");
                jumlahTitik = scan.nextInt();

                penambahan /= jumlahTitik;
                System.out.println(penambahan);

                System.out.println("\nKoordinat");
                for (int i = 0; i <= jumlahTitik; i++) {
                    xt = (float) ((Math.pow((1 - t), 3) * x1) + (3 * Math.pow((1 - t), 2) * t * x2) + (3 * (1 - t) * Math.pow(t, 2) * x3) + (Math.pow(t, 3) * x4));
                    yt = (float) ((Math.pow((1 - t), 3) * y1) + (3 * Math.pow((1 - t), 2) * t * y2) + (3 * (1 - t) * Math.pow(t, 2) * y3) + (Math.pow(t, 3) * y4));
                    t += penambahan;
                    System.out.println("X: " + xt + " Y:" + yt);
                }

            } else if (pilih != 0) {
                System.out.println("Menu tidak tersedia");
            }
            
            System.out.println("\n\n");
        } while (pilih != 0);

    }

}
