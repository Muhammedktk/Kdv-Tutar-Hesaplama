import java.util.Scanner;
public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a , notKdv;

        System.out.print(" Kdv Oranı giriniz :   ");
        a = input.nextDouble();

        System.out.print(" Kdvsiz Tutarı giriniz :   ");
        notKdv = input.nextDouble();

        double KdvliTutar = a * notKdv;
        double sonuc = KdvliTutar + notKdv ;

        System.out.println(" Son Fiyat :    " +sonuc);
    }
}
