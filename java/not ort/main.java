import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("MATEMATIK NOTU:");
        int mat = input.nextInt();
        System.out.print("FIZIK NOTU:");
        int fiz = input.nextInt();
        System.out.print("KIMYA NOTU:");
        int kim = input.nextInt();
        System.out.print("TURKCE NOTU:");
        int tur = input.nextInt();
        System.out.print("TARIH NOTU:");
        int tar = input.nextInt();
        System.out.print("MUZIK NOTU:");
        int muz = input.nextInt();

        double ort = (mat + fiz + kim + tur + tar + muz) / 6;
        boolean kos1 = 60 <= ort;

        String str = kos1 ? "GECTI" : "KALDI" ;
        System.out.println("ORT:" + ort);
        System.out.println(str);


    }
}
