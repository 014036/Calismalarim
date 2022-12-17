package Proje.RentACar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriveAracBilgileri {
    static List<AracTalebi> aracTalepListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kiralanacakGünSayisi = 0;


    public static void AracTalep() {

        System.out.print("Lütfen araci teslim alacaginiz sehri giriniz : ");
        String sehir = scan.nextLine();

        System.out.print("Lütfen araci teslim alacaginiz günü giriniz : (Örnek : 23.04)");
        String alisGünü = scan.next();

        System.out.print("Lütfen araci teslim alacaginiz saati giriniz : (Örnek : 15.00)");
        double alisSaati = scan.nextDouble();

        System.out.print("Lütfen araci teslim edeceginiz günü giriniz : (Örnek : 26.04)");
        String teslimGünü = scan.next();

        System.out.print("Lütfen araci teslim edeceginiz saati giriniz : (Örnek : 17.00)");
        double teslimSaati = scan.nextDouble();

        System.out.println("*************************************");
        String aGün = alisGünü.substring(0, 2); //23
        int intAGün = Integer.parseInt(aGün);
        String aAy = alisGünü.substring(3); //04
        int intAAy = Integer.parseInt(aAy);

        String tGün = teslimGünü.substring(0, 2); //23
        int intTGün = Integer.parseInt(tGün);
        String TAy = teslimGünü.substring(3); //04
        int intTAy = Integer.parseInt(TAy);

        if (intAAy > intTAy) {
            System.out.println("Araci aldiginiz gün teslim edeceginiz günden sonra olamaz.");
            AracTalep();
        } else if (intAGün > intTGün) {
            System.out.println("Araci aldiginiz gün teslim edeceginiz günden sonra olamaz.");
            AracTalep();
        } else {
        }
        kiralanacakGünSayisi = (intTAy - intAAy) * 30 + (intTGün - intAGün);
        System.out.println("Arac toplam " + kiralanacakGünSayisi + " gün kiralanmistir.");
        System.out.println("*************************************");

    }//arac talep


    public static void getAraba(String marka, String model, String yakitTürü, String vites, Integer günlükKiralamaÜcreti) {

    }

    public static void arabalar() {

        AracTalebi volvoDizelOtomatik = new AracTalebi("Volvo", "S60", "Dizel", "Otomatik", 50);
        AracTalebi volvoDizelManuel = new AracTalebi("Volvo", "S6O", "Dizel", "Manuel", 45);
        AracTalebi volvoBenzinOtomatik = new AracTalebi("Volvo", "S60", "Benzin", "Otomatik", 65);
        AracTalebi volvoBenzinManuel = new AracTalebi("Volvo", "S6O", "Benzin", "Manuel", 45);
        AracTalebi mercedesBenzinOtomatik = new AracTalebi("Mercedes", "A180", "Benzin", "Otomatik", 80);
        AracTalebi mercedesBenzinManuel = new AracTalebi("Mercedes", "A180", "Benzin", "Manuel", 70);
        AracTalebi mercedesDizelOtomatik = new AracTalebi("Mercedes", "Benz", "Dizel", "Otomatik", 80);
        AracTalebi mercedesDizelManuel = new AracTalebi("Mercedes", "Benz", "Dizel", "Manuel", 70);
        AracTalebi teslaXElektrikli = new AracTalebi("Tesla", "X", "Elektrikli", "Manuel", 100);
        AracTalebi teslaSElektrikli = new AracTalebi("Tesla", "S", "Elektrikli", "Manuel", 100);
        AracTalebi teslaYElektrikli = new AracTalebi("Tesla", "Y", "Elektrikli", "Otomatik", 100);
        AracTalebi teslaCElektrikli = new AracTalebi("Tesla", "C", "Elektrikli", "Otomatik", 100);

        //liste ekliyoruz

        aracTalepListesi.add(volvoDizelOtomatik);
        aracTalepListesi.add(volvoDizelManuel);
        aracTalepListesi.add(volvoBenzinOtomatik);
        aracTalepListesi.add(volvoBenzinManuel);
        aracTalepListesi.add(mercedesBenzinOtomatik);
        aracTalepListesi.add(mercedesBenzinManuel);
        aracTalepListesi.add(mercedesDizelOtomatik);
        aracTalepListesi.add(mercedesDizelManuel);
        aracTalepListesi.add(teslaXElektrikli);
        aracTalepListesi.add(teslaSElektrikli);
        aracTalepListesi.add(teslaYElektrikli);
        aracTalepListesi.add(teslaCElektrikli);

        System.out.println("*****Arac Talep Secimi****" + "\nLutfen talep ettiginiz arac icin secim yapin " +
                "\nVolvo Dizel Otomatik icin : 1" + "\nVolvo Dizel Manuel icin : 2" + "\n Volvo Benzin Otomatik icin : 3" +
                "\nVolvo Benzin Manuel icin : 4" + "\nMercedes Benzin Otomatik  icin: 5" +
                " \nMercedes Benzin Manuel icin : 6" + " \nMercedes Dizel Otomatik icin : 7" +
                " \nMercedes Dizel Manuel icin : 8" + "\nTesla X Elektrikli icin : 9" +
                "\nTesla S Elektrikli icin : 10" + "\nTesla Y Elektrikli icin : 11" + "\nTesla C Elektrikli icin : 12'yi secin");
        int secim = 0;

        try {
            secim = scan.nextInt();
        } catch (Exception e) {
            //e.printStackTrace();
        }

        switch (secim) {
            case 1:
                getAraba("Volvo", "S60", "Dizel", "Otomatik", 50);
                //System.out.println(volvoDizelOtomatik.toString());
                int odenecekMiktar1 = kiralanacakGünSayisi * 50;
                System.out.println("odenecekMiktar = " + odenecekMiktar1);
                islemeDevamEtmeDöngüsü();
                break;

            case 2:
                getAraba("Volvo", "S6O", "Dizel", "Manuel", 45);
                int odenecekMiktar2 = kiralanacakGünSayisi * 45;
                System.out.println("odenecekMiktar = " + odenecekMiktar2);
                islemeDevamEtmeDöngüsü();
                break;
            case 3:
                getAraba("Volvo", "S60", "Benzin", "Otomatik", 65);
                int odenecekMiktar3 = kiralanacakGünSayisi * 65;
                System.out.println("odenecekMiktar = " + odenecekMiktar3);
                islemeDevamEtmeDöngüsü();
                break;
            case 4:
                getAraba("Volvo", "S6O", "Benzin", "Manuel", 45);
                int odenecekMiktar4 = kiralanacakGünSayisi * 45;
                System.out.println("odenecekMiktar = " + odenecekMiktar4);
                islemeDevamEtmeDöngüsü();
                break;
            case 5:
                getAraba("Mercedes", "A180", "Benzin", "Otomatik", 80);
                int odenecekMiktar5 = kiralanacakGünSayisi * 80;
                System.out.println("odenecekMiktar = " + odenecekMiktar5);
                islemeDevamEtmeDöngüsü();
                break;
            case 6:
                getAraba("Mercedes", "A180", "Benzin", "Manuel", 70);
                int odenecekMiktar6 = kiralanacakGünSayisi * 70;
                System.out.println("odenecekMiktar = " + odenecekMiktar6);
                islemeDevamEtmeDöngüsü();
                break;
            case 7:
                getAraba("Mercedes", "Benz", "Dizel", "Otomatik", 80);
                int odenecekMiktar7 = kiralanacakGünSayisi * 80;
                System.out.println("odenecekMiktar = " + odenecekMiktar7);
                islemeDevamEtmeDöngüsü();
                break;
            case 8:
                getAraba("Mercedes", "Benz", "Dizel", "Manuel", 70);
                int odenecekMiktar8 = kiralanacakGünSayisi * 70;
                System.out.println("odenecekMiktar = " + odenecekMiktar8);
                islemeDevamEtmeDöngüsü();
                break;
            case 9:
                getAraba("Tesla", "X", "Elektrikli", "Manuel", 100);
                int odenecekMiktar9 = kiralanacakGünSayisi * 100;
                System.out.println("odenecekMiktar = " + odenecekMiktar9);
                islemeDevamEtmeDöngüsü();
                break;
            case 10:
                getAraba("Tesla", "S", "Elektrikli", "Manuel", 100);
                int odenecekMiktar10 = kiralanacakGünSayisi * 100;
                System.out.println("odenecekMiktar = " + odenecekMiktar10);
                islemeDevamEtmeDöngüsü();
                break;
            case 11:
                getAraba("Tesla", "Y", "Elektrikli", "Otomatik", 100);
                int odenecekMiktar11 = kiralanacakGünSayisi * 100;
                System.out.println("odenecekMiktar = " + odenecekMiktar11);
                islemeDevamEtmeDöngüsü();
                break;
            case 12:
                getAraba("Tesla", "C", "Elektrikli", "Otomatik", 100);
                int odenecekMiktar12 = kiralanacakGünSayisi * 100;
                System.out.println("odenecekMiktar = " + odenecekMiktar12);
                islemeDevamEtmeDöngüsü();
                break;
            default:
                System.out.println("Talep ettiğiniz arac bizde bulunmamaktadır");
        }


    }//switch

    private static void islemeDevamEtmeDöngüsü() {
        System.out.println("Isleme devam etmek icin E´ye \nIslemi sonlandirmak icin H´ye basiniz.");
        String devamMi = scan.next();

        if (devamMi.equalsIgnoreCase("E")) {
            müsteriBilgisi();

        } else if (devamMi.equalsIgnoreCase("H")) {
            arabalar();
        }
    }

    public static void müsteriBilgisi() {
        System.out.print("Lütfen adinizi ve soyadinizi giriniz : ");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.println("ID giriniz : ");
        String id = scan.next();
        System.out.println("Telefon numaranizi giriniz");
        scan.nextLine();
        String telefon = scan.nextLine();
        System.out.println("Yasinizi giriniz : ");
        int yas = scan.nextInt();

        System.out.println("Ad Soyad: " + adSoyad + "\nid: " + id + "\n Telefon: " + telefon + "\nYas: " + yas);
    }

    public static void ödemeBilgileri() throws InterruptedException {
        System.out.println("Kart numaranizi giriniz.");
        scan.next();
        String kartNumarasi = scan.nextLine();
        int kartNumarasiUzunluk = 12;

        if (kartNumarasiUzunluk == 12) {
            System.out.println("Gecerli bir kart numarasi girildi.");
        } else {
            System.out.println("Gecersiz bir kart numarasi girdiniz.\nTekrar deneyiniz.");
            Thread.sleep(3);
            ödemeBilgileri();
        }
        System.out.println("Ödemeniz basarili ile gerceklestirildi. \nBizi tercih ettiginiz icin tesekkür ederiz.");
    }

}
