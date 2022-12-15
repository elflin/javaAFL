package firstapps;

public class Week12_1 {

    public static void main(String[] args) {
        // buat objek
        Week12_1 objek = new Week12_1();
        
        int angka1 = 10;
        int angka2 = 20;      
        // proses penjumlahan
        int total = objek.penjumlahan(angka2, angka1);
        
        // proses pembagian
        objek.pembagian(total, angka2);
        
        System.out.println(total);

    }
    public int penjumlahan(int x1, int x2){
        int hasil = x1 + x2;
        return hasil;
    }
    public void pembagian(double y1, double y2){
        double hasil = y1 /y2;
        System.out.println(hasil);
    }

}
