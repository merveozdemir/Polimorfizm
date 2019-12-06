package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    static List<Sekil> sekilList = new ArrayList<>();

    public static void main(String[] args) {
        HesapIslemleri hesapla = new HesapIslemleri();
        Scanner scanner = new Scanner(System.in);
        sekilleriOlustur(scanner);
        while (true) {
            System.out.println("--------------------- \n" +
                                "1. Alan Hesapla \n" +
                                "2. Çevre Hesapla \n" +
                                "3. Listeyi Temizle ve Yeni şekiller oluştur\n" +
                                "----------------------");
            System.out.println("Lütfen hesaplama çeşidini seçiniz...");
            int secim = scanner.nextInt();
            scanner.nextLine();
            if (secim == 1) {
                hesapla.alanlariHesapla(sekilList);
            } else if (secim == 2) {
               //sekilleriOlustur(scanner);
                hesapla.cevreleriHesapla(sekilList);
            }else if(secim == 3){
                sekilList.clear();
                sekilleriOlustur(scanner);
            }
            else {
                System.out.println("Program kapatılıyor...");
                break;
            }


        }
    }

    private static void sekilleriOlustur(Scanner scanner) {

        int durdur = 1;
        while (durdur == 1) {
            System.out.println("Lütfen hesaplamak istediğiniz şekli giriniz...");
            System.out.println("1. Kare \n" +
                    "2. Daire \n" +
                    "3. Üçgen");
            int altSecim = scanner.nextInt();
            scanner.nextLine();

            if (altSecim == 1) {
                System.out.println("Karenizin ismini giriniz:");
                String isim = scanner.nextLine();
                System.out.println("Karenin kenar uzunluğunu giriniz:");
                int kenarUzunluk = scanner.nextInt();

                Kare kare = new Kare(kenarUzunluk);
                kare.setSekilAdi(isim);
                sekilList.add(kare);
            } else if (altSecim == 2) {
                System.out.println("Dairinizi ismini giriniz:");
                String isim = scanner.nextLine();
                System.out.println("Lütfen dairenin yarıçapını giriniz: ");
                float yaricap = scanner.nextInt();

                Daire daire = new Daire(yaricap);
                daire.setSekilAdi(isim);
                sekilList.add(daire);
            } else if (altSecim == 3) {
                System.out.println("Üçgeninizin ismini giriniz:");
                String isim = scanner.nextLine();

                System.out.println("Lütfen üçgenin yüksekliğini giriniz: ");
                float yukseklik = scanner.nextInt();

                System.out.println("Lütfen üçgenin taban uzunluğunu giriniz: ");
                float tabanUzunluk = scanner.nextInt();

                System.out.println("Lütfen üçgenin ikinci kenar uzunuluğunu giriniz: ");
                float ikinciUzunluk = scanner.nextInt();

                System.out.println("Lütfen üçgenin üçüncü kenar uzunluğunu giriniz: ");
                float ucuncuUzunluk = scanner.nextInt();

                Ucgen ucgen = new Ucgen(yukseklik, tabanUzunluk, ikinciUzunluk, ucuncuUzunluk);
                ucgen.setSekilAdi(isim);
                sekilList.add(ucgen);
            }

            System.out.println("Başka şekil eklemek istiyorsanız 1'e, istemiyorsanız 0'a basınız... ");
            durdur = scanner.nextInt();
            scanner.nextLine();
        }

    }

//    private static void alanlariHesapla(List<Sekil> sekilListe) {
//        System.out.println("----Alanlar Hesaplanıyor----");
//        for (Sekil sekil : sekilListe) {
//            sekil.alanHesapla();
//        }
//    }
//
//    private static void cevreleriHesapla(List<Sekil> sekilListe) {
//        System.out.println("----Çevreler Hesaplanıyor----");
//        for (Sekil sekil : sekilListe) {
//            sekil.cevreHesapla();
//        }
//
//    }
}

