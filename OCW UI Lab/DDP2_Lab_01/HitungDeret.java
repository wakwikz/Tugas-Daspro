package DDP2_Lab_01;
import java.util.Scanner;
public class HitungDeret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Ganjil, angka, jumlah ;
        Ganjil = angka = jumlah = 0;

        System.out.println("Masukkan angka yang ingin dihitung deretnya: ");
        angka = input.nextInt();

        while (angka > 0){
            jumlah += angka ;
            angka -- ;
            if (angka%2==1){
                Ganjil++;
            }
        }
        System.out.println("Jumlah deret yang dihitung adalah "+ jumlah + " dan bilangan yang ganjil ada " +Ganjil);
    input.close();
    }
}