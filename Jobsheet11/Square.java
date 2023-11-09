package Jobsheet11;
import java.util.Scanner;   
public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
