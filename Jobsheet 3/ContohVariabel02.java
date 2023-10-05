public class ContohVariabel02{
    public static void main (String[]args){
        String hobiku = "tidur";
        boolean bodoh = false;
        char jenisKelamin = 'L';
        byte umurku = 19;
        double ipk = 3.24, $tinggi = 1.55;
        System.out.println("Hobiku adalah " + hobiku);
        System.out.println("Apakah kamu bodoh? " + bodoh);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini " + umurku);
        System.out.println(String.format("saya beripk %s, dengan tinggi badan %s", ipk, $tinggi));
    }
}