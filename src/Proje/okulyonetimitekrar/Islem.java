package Proje.okulyonetimitekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islem {

    static List<Kisi> ogrenciListesi = new ArrayList<>();
    static List<Kisi> ogretmenListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;


    public static void anaMenu() {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");

        System.out.println("Lutfen bir tercih yapiniz");
        String tercih = scan.nextLine().toUpperCase();
        //try catch deneyeboliriz tercih icin.SONRA BAK!
        switch (tercih) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();//buna bi daha bak
                break;
            default:
                System.out.println("hatali giris");
                anaMenu();
                break;//bbunu eklemeyi unutma! defaulttan sonra da olur.

        }

    }

    public static void islemMenusu() {

        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");
        System.out.println("Lutfen bir tercihte bulununuz");
        int secim = scan.nextInt();
        //try catch yapmaya calis!
        switch (secim) {
            case 1:
                ekleme();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 0:
                anaMenu();
                break;
            default:
                System.out.println("hatali giris yaptiniz");//once kullaniciya bilgi ver sonra method cagir
                islemMenusu();
                break;


        }

    }


    public static void silme() {
        System.out.println("******* " + kisiTuru + " silme sayfasi *****");

        boolean flag = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            scan.nextLine();//dummy
            System.out.println("silinecek ogrenci kimlik no giriniz ");
            String silinecekKimlikNo = scan.next();

            for (Kisi k : ogrenciListesi) {
                if (k.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("silinen ogrenci :" + k.getAdSoyadi());
                    ogrenciListesi.remove(k);
                    flag = false;
                    break;//atmaz isek execption verir!!!
                }
            }
            if (flag) {
                System.out.println("hatali giris yaptiniz.");
            }
        } else {//ogretmen icin
                System.out.println("silinecek ogretmen kimlik no giriniz ");
                String silinecekKimlikNo = scan.next();
                for (Kisi k : ogretmenListesi) {
                    if (k.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)) {
                        System.out.println("silinen ogretmen :" + k.getAdSoyadi());
                        ogretmenListesi.remove(k);
                        flag = false;
                        break;//execption verecektir
                    }
                }
                if (flag) {
                    System.out.println("hatali giris yaptiniz.");
                }
            }

        }


    public static void listeleme() {
        System.out.println("******* " + kisiTuru + " listeleme sayfasi *****");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("ogrenci listesi " + ogrenciListesi);
        } else {
            for (Kisi k : ogretmenListesi) {//burada farkli bir yontem kullanildi
                System.out.println("ogretmen listesi :" + k.toString() + "ad soyad" + k.getAdSoyadi() + "yas" + k.getYas());
            }
        }

    }


    public static void arama() {
        System.out.println("******* " + kisiTuru + " arama sayfasi *****");

        boolean flag = true;//FLAG METHOD YENIDEN BAK

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci icin
            scan.nextLine();//dummy-BUNA BIRAZ DAHA BAK!
            System.out.println("aradiginiz ogrencinin kimlik no giriniz :");
            String kimlikNo = scan.nextLine();
            for (Kisi k : ogrenciListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(kimlikNo)) {
                    System.out.println("aradiginiz ogrenci : " + k.getAdSoyadi());
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("hatali giris yaptiniz.");
            }

        } else {
                System.out.println("aradiginiz ogretmenin kimlik no giriniz :");
                String kimlikNo = scan.nextLine();
                for (Kisi k : ogretmenListesi) {
                    if (k.getKimlikNo().equals(kimlikNo)) {
                        System.out.println("aradiginiz ogretmen : " + k.getAdSoyadi());
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("hatali giris yaptiniz.");
                }

            }

        }


    public static void ekleme() {

        System.out.println("******* " + kisiTuru + " ekleme sayfasi *****");
        System.out.println("Ad soyad giriniz");
        scan.nextLine();//dummy
        String adSoyadi = scan.nextLine();
        System.out.println("kimlik no giriniz : ");
        String kimlikNo=scan.nextLine();
        System.out.println("yas giriniz : ");
        int yas= 0;

        while(true) {//try catch denedim!
            try {
                yas = scan.nextInt();
                if (yas < 10 || yas > 100) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e){
                System.out.println("Yas 10 ile 100 arasinda olmalidir.");
        } catch (Exception e) {
                String str=scan.nextLine();//BUNU YAZMAYINCA SONSUZ DONGUYE GIRDI.
                System.out.println("Numerik veri girisi yapiniz.");
            }

        }

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci icin
            System.out.println("ogrenci no giriniz : ");
            scan.nextLine();//dummy
            String ogrenciNo = scan.nextLine();
            System.out.println("sinif bilgisi giriniz :");
            String sinif = scan.nextLine();

            //LUTFEN OBJE YAPMAYI UNUTMAAAA!!!
            Ogrenci ogrenci = new Ogrenci(adSoyadi, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciListesi.add(ogrenci);//EKLEME METHODU

        } else {//ogretmen icin
            System.out.println("Sicil no giriniz : ");
            String sicilNo = scan.nextLine();//DEFUALT DEGER GELIYOR ANLAMADIM!!!!
            scan.nextLine();//dummy
            System.out.println("Bolum bilgisi giriniz :");
            String bolum = scan.nextLine();

            Ogretmen ogretmen = new Ogretmen(adSoyadi, kimlikNo, yas, sicilNo, bolum);
            ogretmenListesi.add(ogretmen);
        }
    }

    private static void cikis() {
        System.out.println("cikis yaptiniz");
    }


}
