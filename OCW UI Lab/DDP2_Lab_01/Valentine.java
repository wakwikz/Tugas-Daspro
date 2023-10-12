package DDP2_Lab_01;
import java.util.Scanner;
public class Valentine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        String nama;

        System.out.println("Kepada siapa kamu ingin memberikan coklat: ");
        nama = input.nextLine();
        System.out.println("Seberapa banyak coklat yang dapat anda beri? ");
        jumlah = input.nextInt();
        
        if (jumlah <= 10) {
            System.out.println("Sayang sekali coklatmu ditolak oleh " +nama);
        } else {
            System.out.println("Selamat, coklatmu diterima oleh " +nama);
        }
    }
}
