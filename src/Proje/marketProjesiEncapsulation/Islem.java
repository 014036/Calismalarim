package Proje.marketProjesiEncapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Proje.marketProjesiEncapsulation.MarketMerkezi.urunFiyatListesi;
import static Proje.marketProjesiEncapsulation.MarketMerkezi.urunListesi;

public class Islem {

    static List<String> sepetUrunler = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyati = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);//kullanicidan bilgi istenecegi icin bu sekilde yapmak en iyisi


    static String devam;
    static double toplamFiyat = 0;


    public static void girisPaneli() {//method icerisinde do while yapmaz isen hata verir
        do {
            urunListele();
            System.out.println("almak istediginiz urun kodunu giriniz :");
            int urunNo = scan.nextInt();
            System.out.println("kac kilo alacaksiniz?");
            double kg = scan.nextDouble();
            sepeteEkle(urunNo, kg);
            toplamFiyat += sepetTutari();
            System.out.println("devam etmek icin D yaziniz");
            devam = scan.next().toLowerCase();
        } while (devam.equalsIgnoreCase("D"));
        odeme(toplamFiyat);

    }


    private static void odeme(double toplamFiyat) {

        System.out.println("************* ÖDEME ***************");
        System.out.println("ÖDENECEK TOPLAM TUTAR:" + Math.round(toplamFiyat));//double fiyat degerinin yaklasik degerini aliyor

        double nakit = 0;

        do {//hata veriyor burasi
            System.out.print("Lutfen nakit odemenizi giriniz : ");
            nakit += scan.nextDouble();//kullanicidan alinan fiyati nakit'e ekler
            if (nakit < toplamFiyat) ;
            System.out.println("Verdiginiz miktar yetersizdir.");
            System.out.println((toplamFiyat - nakit) + " daha odeme yapmalisiniz");
        } while (nakit < toplamFiyat);

        double iade = nakit - toplamFiyat;

        if (iade > 0) {
            System.out.println("iade miktari : " + iade);
        }

        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz.");
    }


    private static double sepetTutari() {
        double sepetTutari = 0.0;
        double septKg = 0;

        for (int i = 0; i < sepetUrunler.size(); i++) {
            sepetTutari += sepetFiyati.get(i);
            septKg += sepetKg.get(i);
        }
        System.out.println("odemeniz gereken fiyat " + Math.round(sepetTutari) + " aldiginiz urun miktari " + septKg);
        return sepetTutari;
    }

    private static void sepeteEkle(int urunNo, double kg) {
        sepetUrunler.add(urunListesi.get(urunNo));
        sepetKg.add(kg);
        sepetFiyati.add(urunFiyatListesi.get(urunNo) * kg);

    }


    public static void urunListele() {//market merkezinden alindi
        /*
        tasktaki urun listesi paneli icin yapildi bu method
         */
        System.out.println(" No \t  Urunler \t  Fiyatlar");//taskda yer alan seklin aynisini yapmak icin
        System.out.println("==== \t ======== \t =======");

        for (int i = 0; i < urunListesi.size(); i++) {
            System.out.println(" " + "0" + i + " \t " + urunListesi.get(i) + " \t " + urunFiyatListesi.get(i));
        }

    }
}
