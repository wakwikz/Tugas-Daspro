package DDP2_Lab_01;
import java.util.Scanner;
public class PembagianManual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka, angkaAwal, pembagi, hasil=0, sisa=0;
  
        System.out.println("Masukkan angka yang ingin anda bagi: ");
        angka = input.nextInt();
        System.out.println("Masukkan pembagi angka: ");
        pembagi = input.nextInt();
        
        angkaAwal = angka;

        while ((angka - pembagi) >= 0) {
            angka -= pembagi;
            sisa = angka;
            hasil++;
        }

        System.out.println("Hasil pembagian " + angkaAwal + " dengan " + pembagi + " adalah " + hasil + " dengan sisa " + sisa);
    input.close();
    }
}
