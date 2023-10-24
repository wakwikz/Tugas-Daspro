package Jobsheet9;
public class BobaSortExample02 {
    public static void main(String[] args) {
        int [] data = {34, 18, 72, 87, 32, 54, 43};
        int temp = 0;

        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < (data.length-i); j++) {
                if(data[j-1] < data[j]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1]= temp;
                }
            }
        }

        System.out.println("Hasil pengurutan: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
