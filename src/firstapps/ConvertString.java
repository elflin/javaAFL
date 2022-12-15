package firstapps;

import java.util.Scanner;

public class ConvertString {

    public static void main(String[] args) {
       
        // input: 123467
        // output: 23
        System.out.println("test");
        Scanner scan = new Scanner(System.in);
        int angka = scan.nextInt();
        
        String text = String.valueOf(angka);
        
        char x [] = text.toCharArray();
        
        String y [] = new String[x.length];
        
        for (int i = 0; i < x.length; i++) {
            y[i] = String.valueOf(x[i]);
        }
        
        int z [] = new int[x.length];
        
        for (int i = 0; i < z.length; i++) {
            z[i] = Integer.parseInt(y[i]);
        }
        
        int total = 0;
        
        for (int i = 0; i < z.length; i++) {
            total+=z[i];
        }
        
        System.out.println(total);
        
        
        int b = Integer.parseInt(String.valueOf(scan.next().charAt(0)));
        System.out.println(b);
    }
    

}
