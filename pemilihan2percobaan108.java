import java.util.Scanner;
public class pemilihan2percobaan108 {
    public static void main(String[] args) {

        Scanner input08 = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int angka = input08.nextInt();

        if (angka % 4 == 0){
            if (angka % 100 != 0){
                System.out.println("Tahun kabisat");
            }
            else if (angka % 100 == 0){
                if (angka % 400 == 0){
                    System.out.println("Tahun kabisat");
                }
                else {
                    System.out.println("bukan tahun kabisat");
                }
            }
            else {
                System.out.println("bukan tahun kabisat");
            }

        }
        else {
            System.out.println("Bukan tahun kabisat");
        }

    }

}

