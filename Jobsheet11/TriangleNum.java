package Jobsheet11;

import java.util.Scanner;

public class TriangleNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            int spaces = n - i; 
            while (spaces > 0) {
                System.out.print(" ");
                spaces--;
            }
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        input.close();
    }
}
