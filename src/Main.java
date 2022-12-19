import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvOrani ,kdv1 = 0.18,kdv2 = 0.08, kdvTutar,kdvliTutar;

        Scanner sc = new Scanner(System.in);
        System.out.print("Tutar Giriniz : ");
        tutar = sc.nextDouble();

        kdvOrani = tutar < 1000 ? kdv1 :  kdv2;
        kdvTutar = tutar < 1000 ? tutar * kdv1 : tutar * kdv2;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Tutar : " + tutar );
        System.out.println("KDV Orani : " + kdvOrani );
        System.out.println("KDV Tutari : " + kdvTutar );
        System.out.println("KDV'li Tutari : " + kdvliTutar);
    }
}
