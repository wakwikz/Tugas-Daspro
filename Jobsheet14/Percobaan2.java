package Jobsheet14;
import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            System.out.print(x + "x");
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan yang akan dipangkatkan: ");
        int bil = input.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = input.nextInt();

        System.out.print("Hasil dari " + bil + "^" + pangkat + " adalah: ");
        int hasil = hitungPangkat(bil, pangkat);
        System.out.println("1 = " + hasil);
        input.close();
    }
}
