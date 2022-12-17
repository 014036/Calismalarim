package Proje.kitapyonetimi_Maps;

import java.util.*;

public class Method1 {


    static Scanner scan=new Scanner(System.in);
    static HashMap<Integer, KitapTanimlama> kitapListesi=new HashMap<>();//kitapTanimlama classini getiriyoruz ki object
                                    //oriented calisiyoruz ve bir tasla bir suru kus vurmus oluyoruz.
    static int kitapNo=1000;//1000'den baslanacak no-kural boyle


    public static void anaMenu() throws InterruptedException {

        System.out.println("====================================\n\t "
                + "FOUCAULT CENTER'A HOSGELDINIZ " +
                "\n===================================" +
                "\n============= İŞLEMLER ============\r\n     " +
                "1-KITAP TANIMLAMA \r\n    " +
                " 2-KITAP LISTELEME\r\n     " +
                "3-KITAP GIRISI \r\n     " +
                "4-KITABI RAFA KOYMA \r\n     " +
                "5-KITAP CIKISI\r\n " +
                "    6-CIKIS");


        System.out.println("Lutfen bir islem seciniz : ");

        //try catch switch'in hepsina uygulanmis oldu.
        try {
            int tercih =scan.nextInt();

            switch (tercih) {
                case 1:
                    kitapEkle();
                    anaMenu();
                    break;
                case 2:
                    kitapListele();
                    anaMenu();
                    break;
                case 3:
                    kitapAdedi();
                    kitapListele();
                    anaMenu();
                    break;
                case 4:
                    rafaKoyma();
                    kitapListele();
                    anaMenu();
                    break;
                case 5:
                    kitapCikisi();
                    kitapListele();
                    anaMenu();
                case 6:
                    cikis1();
                    break;
                default:
                    System.out.println("hatali giris");
                    anaMenu();

            }
        } catch (InputMismatchException e) {
            System.out.println("Numerik deger giriniz.");
            scan.nextLine();//dummy
            System.out.println("Lutfen bekleyiniz menuye yonlendiriliyorsunuz...");
            Thread.sleep(4000);
            anaMenu();
        }


    }

    private static void cikis1() {
        System.out.println("Isleminiz gerceklesmistir. Hoscakalin.");
    }

    private static void kitapCikisi() {

        System.out.print("Aradiginis kitabin nosunu giriniz : ");
        int arananNo=scan.nextInt();

        if(kitapListesi.keySet().contains(arananNo)){

            System.out.print("Cikarmak istediginiz kitap adedini giriniz :");

            int cikanAded=scan.nextInt();

            kitapListesi.get(arananNo).setKitapAdedi(kitapListesi.get(arananNo).getKitapAdedi()-cikanAded);
            //burada kitapListesinde aradigimiz no'daki kitabi buluyoruz sonrasinda mevcut adetten
            //cikarmak istedigimiz adedi giriyoruz.
        } else {
            System.out.println("Aradiginiz kitap bulunamamistir. ");
        }
    }

    private static void rafaKoyma() {

        System.out.print("Raf girisi icin kitap nosu giriniz : ");

        int arananNo=scan.nextInt();

        if(kitapListesi.keySet().contains(arananNo)){

            System.out.println("Raf nosu giriniz : ");
            scan.nextLine();//dummy
            String rafNo=scan.nextLine();;

            kitapListesi.get(arananNo).setRafNo(rafNo);//rafimiizn nosunu bu sekilde set ediyoruz
        } else {
            System.out.println("aradiginiz kitap bulunamadi. ");
        }

    }

    private static void kitapAdedi() {
        System.out.print("Aradiginiz kitabin Nosunu giriniz : ");

        int arananNo=scan.nextInt();

        if(kitapListesi.keySet().contains(arananNo)){

            System.out.print("Guncel kitap adedini giriniz : ");
            int guncelKitapNo=scan.nextInt();

            kitapListesi.get(arananNo).setKitapAdedi(guncelKitapNo+kitapListesi.get(arananNo).getKitapAdedi());
                                                    //aranan kitapNosu neyse o no'daki kitap adedi ile guncel adedi ekliyorsun
        } else {
            System.out.println("Aradiginiz kitap nosu bulunamadi. ");
        }
    }

    private static void kitapListele() {
        System.out.println("kitapNo      kitapAdi         yazarAdi       kitapFiyati      adedi        raf" +
                "\n=============================================================================");

        //bu asamada Map'imizi sete aktariyoruz boylece mapteki urunlere ulasmis oluyoruz

         Set<Map.Entry<Integer, KitapTanimlama>> kitapSet=kitapListesi.entrySet();
         //entrySet methodu kurtaricimiz aslinda, mapin icine girmemizi sagliyor bir anlamda

        //foreach kullanarak Mapteki urunlere ulasabiliyoruz

        for (Map.Entry<Integer, KitapTanimlama> each : kitapSet) {

            Integer kitapKey=each.getKey();//buradan kitaplarin Nosuna ulasiyoruz

            System.out.printf( "%d        %-14s       %-14s     $%3d       %-6d       %-14s \n", kitapKey, each.getValue().getKitapAdi(),
                    each.getValue().getYazarAdi(), each.getValue().getKitapFiyat(), each.getValue().getKitapAdedi(), each.getValue().getRafNo());

        }
    }

    private static void kitapEkle() {

        System.out.println("Lutfen kitap bilgilerini giriniz : ");
        System.out.print("Kitap ismi : ");
        scan.nextLine();//dummy
        String kitapAdi=scan.nextLine();

        System.out.print("Yazar adi giriniz : ");
        String yazarAdi=scan.nextLine();

        System.out.print("Kitap fiyatini giriniz : ");
        int kitapFiyati=scan.nextInt();

        //bu asamada class level'de map create edecegiz cunku butun methodlarda kullancagiz
        KitapTanimlama kitap=new KitapTanimlama(kitapNo, kitapAdi, yazarAdi, kitapFiyati);

        //burada put() ile kitaplari Map listesine ekliyoruz
        kitapListesi.put(kitapNo,kitap);

        kitapNo++;//1000'den basliyor no

    }


}


