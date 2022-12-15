package firstapps;

import java.util.Scanner;

public class PohonNatal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Input: ");
        int input = s.nextInt();
        int x = 0;

        for (int a = input; a > 1; a--) {
            for (int i = 0; i < a; i++) {
                for (int j = a - 1; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < x; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            x += 2;
        }

        for (int i = 0; i < (input / 2) + 1; i++) {
            for (int j = 0; j < (input * 2) - 1; j++) {
                if (j == input - 2 || j == input) {
                    System.out.print("|");
                } else if (j == input - 1 && i == (input / 2)) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

}
