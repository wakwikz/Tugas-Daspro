package Jobsheet11;
import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        char menu = 'y';
        do {
            int n = rand.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka 1-10 : ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer < n) {
                    System.out.println("Tebakan anda terlalu kecil!");
                } else if (answer > n) {
                    System.out.println("Tebakan anda terlalu besar!");
                }
                success = answer == n;
            } while (!success);
            System.out.print("Tebakan benar! Ingin main lagi? (y/n) ");
            menu = input.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        input.close();  
    }
}
