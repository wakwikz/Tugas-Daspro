import java.util.Scanner;
public class Pemilihan2Percobaan202 {
    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.println("Masukkan besar sudut pertama:");
        sudut1 = input02.nextFloat();
        System.out.println("Masukkan besar sudut kedua:");
        sudut2 = input02.nextFloat();
        System.out.println("Masukkan besar sudut ketiga:");
        sudut3 = input02.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if ((totalSudut==180) && (sudut1>0 && sudut2>0 && sudut3>0)) {
            if (sudut1==90 || sudut2==90 || sudut3==90){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if ((sudut1==sudut2) && (sudut2==sudut3)){
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if ((sudut1==sudut2) || (sudut2==sudut3) || (sudut3==sudut1)){
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga sembarang");
            }
        }
        else {
        System.out.println("Bukan segitiga");
        }
    input02.close();
    }
}