package firstapps;

import java.util.Scanner;

public class Week8_1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Input: ");
        int input = s.nextInt();
        
        //Turun Vertikal
        for (int i = 0; i < input; i++) {
            
            //Kesamping Horisontal
            for (int j = 0; j <= i; j++) {
                System.out.print("&");
            }
            
            System.out.println("");
        }
        
    }
}
