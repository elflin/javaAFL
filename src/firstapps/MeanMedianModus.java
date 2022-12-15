package firstapps;

import java.util.Scanner;

public class MeanMedianModus {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int angka1 = 0;
        int angka2 = 0;
        int angka3 = 0;
        int angka4 = 0;
        int angka5 = 0;
        double average = 0;

        System.out.println("INPUT");
        System.out.print("Masukan angka 1: ");
        angka1 = s.nextInt();
        System.out.print("Masukan angka 2: ");
        angka2 = s.nextInt();
        System.out.print("Masukan angka 3: ");
        angka3 = s.nextInt();
        System.out.print("Masukan angka 4: ");
        angka4 = s.nextInt();
        System.out.print("Masukan angka 5: ");
        angka5 = s.nextInt();

        // Mean
        average = (angka1 + angka2 + angka3 + angka4 + angka5) / 5;

        // Sorting
        if (angka1 > angka2) {
            int temp = angka1;
            angka1 = angka2;
            angka2 = temp;
        }

        if (angka1 > angka3) {
            int temp = angka1;
            angka1 = angka3;
            angka3 = temp;
        }

        if (angka1 > angka4) {
            int temp = angka1;
            angka1 = angka4;
            angka4 = temp;
        }

        if (angka1 > angka5) {
            int temp = angka1;
            angka1 = angka5;
            angka5 = temp;
        }

        if (angka2 > angka3) {
            int temp = angka2;
            angka2 = angka3;
            angka3 = temp;
        }

        if (angka2 > angka4) {
            int temp = angka2;
            angka2 = angka4;
            angka4 = temp;
        }

        if (angka2 > angka5) {
            int temp = angka2;
            angka2 = angka5;
            angka5 = temp;
        }

        if (angka3 > angka4) {
            int temp = angka3;
            angka3 = angka4;
            angka4 = temp;
        }

        if (angka3 > angka5) {
            int temp = angka3;
            angka3 = angka5;
            angka5 = temp;
        }

        if (angka4 > angka5) {
            int temp = angka4;
            angka4 = angka5;
            angka5 = temp;
        }

        // Modus
        int jumAngka1 = 1;
        int jumAngka2 = 1;
        int jumAngka3 = 1;
        int jumAngka4 = 1;
        int jumAngka5 = 1;

        // angka 1
        if (angka1 == angka2) {
            jumAngka1++;
        }
        if (angka1 == angka3) {
            jumAngka1++;
        }
        if (angka1 == angka4) {
            jumAngka1++;
        }
        if (angka1 == angka5) {
            jumAngka1++;
        }

        // angka 2
        if (angka2 == angka1) {
            jumAngka2++;
        }
        if (angka2 == angka3) {
            jumAngka2++;
        }
        if (angka2 == angka4) {
            jumAngka2++;
        }
        if (angka2 == angka5) {
            jumAngka2++;
        }

        // angka 3
        if (angka3 == angka1) {
            jumAngka3++;
        }
        if (angka3 == angka2) {
            jumAngka3++;
        }
        if (angka3 == angka4) {
            jumAngka3++;
        }
        if (angka3 == angka5) {
            jumAngka3++;
        }

        // angka 4
        if (angka4 == angka1) {
            jumAngka4++;
        }
        if (angka4 == angka2) {
            jumAngka4++;
        }
        if (angka4 == angka3) {
            jumAngka4++;
        }
        if (angka4 == angka5) {
            jumAngka4++;
        }

        // angka 5
        if (angka5 == angka1) {
            jumAngka5++;
        }
        if (angka5 == angka2) {
            jumAngka5++;
        }
        if (angka5 == angka3) {
            jumAngka5++;
        }
        if (angka5 == angka4) {
            jumAngka5++;
        }

        // Output
        System.out.println("\nOUTPUT");
        System.out.println("Urutan angka = " + angka1 + ", " + angka2 + ", " + angka3 + ", " + angka4 + ", " + angka5);
        System.out.println("Mean = " + average);
        System.out.println("Median = " + angka3);
        
        if(jumAngka1 == 1 && jumAngka2 == 1 && jumAngka3 == 1 && jumAngka4 == 1 && jumAngka5 == 1){
            System.out.println("Modus = Tidak ada");
        }else if (jumAngka1 >= jumAngka2 && jumAngka1 >= jumAngka3 && jumAngka1 >= jumAngka4 && jumAngka1 >= jumAngka5) {
            System.out.println("Modus = " + angka1);
        } else if (jumAngka2 >= jumAngka1 && jumAngka2 >= jumAngka3 && jumAngka2 >= jumAngka4 && jumAngka2 >= jumAngka5) {
            System.out.println("Modus = " + angka2);
        } else if (jumAngka3 >= jumAngka1 && jumAngka3 >= jumAngka2 && jumAngka3 >= jumAngka4 && jumAngka3 >= jumAngka5) {
            System.out.println("Modus = " + angka3);
        } else if (jumAngka4 >= jumAngka1 && jumAngka4 >= jumAngka2 && jumAngka4 >= jumAngka3 && jumAngka4 >= jumAngka5) {
            System.out.println("Modus = " + angka4);
        } else if (jumAngka5 >= jumAngka1 && jumAngka5 >= jumAngka5 && jumAngka5 >= jumAngka4 && jumAngka5 >= jumAngka4) {
            System.out.println("Modus = " + angka5);
        } 

    }

}
