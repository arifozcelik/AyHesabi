package NesneYonelimliProgramlamaKitap;

import java.util.Scanner;

public class AyHesabi {
    public static void main(String[] args) {
        String A[] = {"","Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim",
        "Kasım","Aralık"};
        Scanner tara = new Scanner(System.in);
        int ay;
        System.out.println("Ay değerini giriniz...");
        ay= tara.nextInt();

        if (ay>0 && ay <=12)
            System.out.println(ay + " .ay...:" + A[ay]);
        else
            System.out.println("Hatalı ay numarası!!..");
    }
}
