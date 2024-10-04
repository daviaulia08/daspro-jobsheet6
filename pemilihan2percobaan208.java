import java.util.Scanner;
public class pemilihan2percobaan208 {
    public static void main(String[] args) {

        Scanner input08 = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        double pilihan_menu = input08.nextDouble();
        input08.nextLine();

        System.out.print("Apakah punya member (y/n) ? = ");
        String member = input08.nextLine();
        System.out.println("--------------------------------------");

        if (member.equals("y")) {
            double diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if(pilihan_menu==1){
                double harga = 14000;
                double total_bayar = harga - ( harga * diskon );
                System.out.println("Harga Ricebowl = " + harga);
                System.out.println("Total bayar setalah diskon = " + total_bayar);
            }

            else if(pilihan_menu==2){
                double harga = 3000;
                double total_bayar = harga - ( harga * diskon );
                System.out.println("Harga ice tea = " + harga);
                System.out.println("Total bayar setalah diskon = " + total_bayar);
            }

            else if(pilihan_menu==3){
                double harga = 15000;
                double total_bayar = harga - ( harga * diskon );
                System.out.println("Harga bundling = " + harga);
                System.out.println("Total bayar setalah diskon = " + total_bayar);
            }
        }

        else if (member.equals("n")) {
            if(pilihan_menu==1){
                int harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
                System.out.println("Total bayar setelah diskon = " + harga);
            }

            else if(pilihan_menu==2){
                int harga = 3000;
                System.out.println("Harga ice tea = " + harga);
                System.out.println("Total bayar setelah diskon = " + harga);
            }

            else if(pilihan_menu==3){
                int harga = 15000;
                System.out.println("Harga bundling = " + harga);
                System.out.println("Total bayar setelah diskon = " + harga);
            }

        }

        else {
            System.out.println("Member tidak valid");
        }

        System.out.println("--------------------------------------");
    }
}