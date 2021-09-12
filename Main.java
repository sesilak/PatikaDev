package Giris;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Matematik ders notunu giriniz : ");
    int matematik = scanner.nextInt();
        System.out.print("Fizik ders notunu giriniz : ");
    int fizik = scanner.nextInt();
        System.out.print("Kimya ders notunu giriniz : ");
    int kimya = scanner.nextInt();
        System.out.print("Türkçe ders notunu giriniz : ");
    int turkce = scanner.nextInt();
        System.out.print("Tarih ders notunu giriniz : ");
    int tarih = scanner.nextInt();
        System.out.print("Müzik ders notunu giriniz : ");
    int muzik = scanner.nextInt();

    int notOrtalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

    String sonuc = (notOrtalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
