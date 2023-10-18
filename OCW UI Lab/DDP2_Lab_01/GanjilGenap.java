package DDP2_Lab_01;
import java.util.Scanner;
public class GanjilGenap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nomorPlat;

        System.out.println("Masukkan nomor plat anda: ");
        nomorPlat = input.nextInt();

        if (nomorPlat > 9999 || nomorPlat < 0) {
            System.out.println("Nomor plat anda salah");
        } else if (nomorPlat % 2 == 0) {
            System.out.println("Nomor plat anda genap");
        } else {
            System.out.println("Nomor plat anda ganjil");
        }
    input.close();
    }
}