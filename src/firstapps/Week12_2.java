package firstapps;

import java.util.Scanner;

public class Week12_2 {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Week12_2 objek = new Week12_2();
        int input = 0;
        boolean isPrima = true;

        System.out.print("Masukan Angka: ");
        input = Scan.nextInt();

        isPrima = objek.CekBilanganPrima(input);
        
        objek.TampilkanHasil(isPrima);
    }

    public boolean CekBilanganPrima(int angka) {
        for (int i = 2; i < angka; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public void TampilkanHasil(boolean  isPrima){
        if (isPrima) {
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }

}
