import java.util.Scanner;
public class Bank02 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        int jumlahTabunganAwal, lamaMenabung;
        double persentaseBunga = 0.02, bunga, jumlahTabunganAkhir;

        System.out.println("Masukkan jumlah tabungan awal anda");
        jumlahTabunganAwal = input.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lamaMenabung = input.nextInt();

        bunga = lamaMenabung*persentaseBunga*jumlahTabunganAwal;
        jumlahTabunganAkhir=bunga+jumlahTabunganAwal;

        System.out.println("Jumlah bunga sebesar " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jumlahTabunganAkhir);
        input.close();
    }
}
