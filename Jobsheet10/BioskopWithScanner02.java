package Jobsheet10;
import java.util.Scanner;

public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Selamat Datang di Bioskop");
            System.out.println("1. Pendaftaran Penonton");
            System.out.println("2. List Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu: ");
            int menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
                    boolean backToMenu = true;
                    while (backToMenu) { 
                        System.out.print("Masukkan nama: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        int baris = input.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        int kolom = input.nextInt();
                        input.nextLine(); 

                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Maaf, kursi ini sudah ditempati oleh " + penonton[baris - 1][kolom - 1] + " Silahkan memasukkan baris dan kolom yang berbeda");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Pendaftaran berhasil!");
                        }

                        System.out.println("Input penonton lainnya? (y/n)");
                        String next = input.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            backToMenu = false;
                        }
                    }
                    break; 

                case 2:
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***";
                        }
                    }
                    System.out.println("Penonton pada baris ke-" + (i + 1) + " : " + String.join(", ", penonton[i]));
                }
                break;
            
                case 3:
                    System.exit(0); 
            }
        input.close();
        }
    }
}
