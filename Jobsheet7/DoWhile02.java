package Jobsheet7;
import java.util.Scanner;
public class DoWhile02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti: ");
        jatahCuti = input.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (Y/N)? ");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("Y")){
                System.out.println("Jumlah hari: ");
                jumlahHari = input.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi. Apakah anda ingin mencoba lagi (Y/N)? ");
                    konfirmasi = input.next();
                    if (!konfirmasi.equalsIgnoreCase("Y"))
                    break;
                }
            } else {
                break;
            }
        }while (jatahCuti > 0);
    }
}
