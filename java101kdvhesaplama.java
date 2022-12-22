import java.util.Scanner;
public class java101kdvhesaplama {
    public static void main(String[] args) {

        double girilenSayi;
        double kdvOran = 0.18;
        double kdvOran2=0.08;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        girilenSayi = input.nextDouble();

        double oran=(girilenSayi > 0 && girilenSayi <= 1000) ? kdvOran : kdvOran2;
        double kdvTutari=girilenSayi*oran;
        double kdvliToplam= kdvTutari+girilenSayi;

        System.out.println("Girilen Sayı :" + girilenSayi);
        System.out.println("KDV Oranı : " +oran);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Toplam :" + kdvliToplam);





    }
}
