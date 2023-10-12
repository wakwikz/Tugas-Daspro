package DDP2_Lab_01;
import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilai;

        System.out.println("Nilai: ");
        nilai = input.nextDouble();

        if (nilai>=3.5 && nilai<=4) {
            System.out.println("Anda bisa mengambil 24 SKS di semester berikutnya");
        } else if (nilai <= 3.5 && nilai >=3) {
            System.out.println("Anda bisa mengambil 21 SKS di semester berikutnya");
        } else if (nilai <= 3 && nilai >=2.5) {
            System.out.println("Anda bisa mengambil 18 SKS di semester berikutnya");
        } else if (nilai <= 2.5 && nilai >=2) {
            System.out.println("Anda bisa mengambil 15 SKS di semester berikutnya");
        }else {
            System.out.println("Input nilai anda salah");
        }
    }
}
