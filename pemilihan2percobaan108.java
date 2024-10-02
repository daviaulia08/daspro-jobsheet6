import java.util.Scanner;
public class pemilihan2percobaan108 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int angka = sc.nextInt();

        if (angka % 4 == 0){
            System.out.println("Tahun kabisat");
        }
        else {
            System.out.println("Bukan tahun kabisat");
        }

    }

}
