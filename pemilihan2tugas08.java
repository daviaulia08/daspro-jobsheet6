import java.util.Scanner;
public class pemilihan2tugas08 {
    public static void main (String[] args) {

        Scanner input08 = new Scanner (System.in);

        String jenis;
        double diskon, diskonAkhir, totalBayar, jumlah;
        double harga = 20000;

        System.out.print("Masukkan jenis buku : ");
        jenis = input08.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlah = input08.nextDouble();

        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                diskon = harga * 0.12;
            }
            else {
                diskon = harga * 0.10;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3) {
                diskon = harga * 0.09;
            }
            else {
                diskon = harga * 0.08;
            }
        } else {
            if (jumlah > 3) {
                diskon = harga * 0.10;
            }
            else {
                diskon = harga * 0;
            }   
        }

        diskonAkhir = diskon * jumlah;
        totalBayar = (harga - diskon) * jumlah;

        System.out.println("diskon yang didapat : " + diskonAkhir);
        System.out.println("total yang harus dibayar : " + totalBayar);
    }
}