import java.util.Scanner;
public class TugasIndividuSenjata02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int range;

        System.out.println("Range dengan lawan: ");
        range = input.nextInt();

        if (range<=5) {
            System.out.println("Gunakan melee weapon ");
        } else {
            System.out.println("Gunakan ranged weapon");
        }
    input.close();
    }
}
