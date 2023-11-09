package Jobsheet11;
import java.util.Scanner;
public class NestedLoop_2341720192 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double [][] temps = new Double[2][7];
        Double total = 0.0, rata2 = 0.0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-"+ i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-"+ (j+1) + " : ");
                temps[i][j] = input.nextDouble();
                total += temps[i][j];
                rata2 = total / (temps.length * temps[0].length);
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i + ":");
            for (Double temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
            System.out.print("Rata-rata suhu kota ke-" + i + " : " + rata2 + "");
            System.out.println();
        }
        input.close();
    }
}
