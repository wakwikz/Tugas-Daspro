package Jobsheet11;
import java.util.Scanner;

public class AtletSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] dataAtlet = new String[5][2];

        // Pengguna menginput data nama atlet dan cabang olahraga
        for (int i = 0; i < dataAtlet.length; i++) {
            System.out.println("Masukkan data untuk Atlet ke-" + (i + 1) + ":");
            System.out.print("Nama Atlet: ");
            dataAtlet[i][0] = input.nextLine();
            System.out.println();
            // Memastikan input valid
            boolean isValidCabang = false;
            while (!isValidCabang) {
                System.out.print("Cabang Olahraga (badminton, tenis meja, basket, bola voly): ");
                String cabangInput = input.nextLine().toLowerCase();

                // Validasi input cabang olahraga
                if (cabangInput.equals("badminton") || cabangInput.equals("tenis meja")
                        || cabangInput.equals("basket") || cabangInput.equals("bola voly")) {
                    dataAtlet[i][1] = cabangInput;
                    isValidCabang = true;
                } else {
                    System.out.println("Input tidak valid. Masukkan cabang olahraga yang valid.");
                }
            }
        }

        // Mengurutkan array secara ascending berdasarkan nama atlet (tanpa Arrays.sort)
        for (int i = 0; i < dataAtlet.length - 1; i++) {
            for (int j = 0; j < dataAtlet.length - i - 1; j++) {
                if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
                    // Tukar jika nama atlet sekarang lebih besar daripada nama atlet berikutnya
                    String[] temp = dataAtlet[j];
                    dataAtlet[j] = dataAtlet[j + 1];
                    dataAtlet[j + 1] = temp;
                }
            }
        }

        // Output informasi nama atlet dan cabang olahraga
        System.out.println("\nInformasi Peserta (Atlet) Porseni 2024:");
        for (String[] atlet : dataAtlet) {
            System.out.println("Nama: " + atlet[0] + ", Cabor: " + atlet[1]);
        }
        input.close();
    }
}