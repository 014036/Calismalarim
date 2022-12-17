package Proje.fabrikadeposu;

import java.util.*;


public class Method {

    static Scanner scan=new Scanner(System.in);
    static int id=1000;
    static HashMap<Integer, UrunTanimlama> urunler= new HashMap<>();

    public static void girisPaneli(){

        System.out.println("====================================\n\t "
                + "CHARLIE'NIN UN FABRIKASINA HOSGELDINIZ " +
                "\n===================================" +
                "\n============= İŞLEMLER ============\r\n     " +
                "1-URUN TANIMLAMA \r\n    " +
                " 2-URUN LISTELEME \r\n     " +
                "3-URUN GIRISI \r\n     " +
                "4-URUN RAFA KOYMA\r\n     " +
                "5-URUN CIKISI \r\n " +
                "    6-CIKIS");


        System.out.println("Yapmak istediginiz islemi seciniz : ");

        try {
            int secim=scan.nextInt();

            switch(secim){

                case 1:
                    urunTanimlama();
                    girisPaneli();
                     break;
                case 2:
                    urunListeleme();
                    girisPaneli();
                    break;
                case 3:
                    urunMiktari();
                    urunListeleme();
                    girisPaneli();
                    break;
                case 4:
                    rafaKoyma();
                    urunListeleme();
                    girisPaneli();
                    break;
                case 5:
                    urunCikisi();
                    urunListeleme();
                    girisPaneli();
                    break;
                case 6:
                    cikis();
                    break;
                default:
                    System.out.println("hatali veri girdiniz");
                    girisPaneli();
            }
        } catch (InputMismatchException e) {
            System.out.println("Numerik deger giriniz.");
            scan.nextLine();//dummy
            girisPaneli();
        }


    }

    private static void cikis() {
        System.out.println(" Charlie'nin fabrikasindan cikis yaptiniz. Hoscakalin!!!");
    }

    private static void urunCikisi() {

        System.out.println("Aradiginiz urunun cikisi icin urun Id bilgisi giriniz : ");
        int arananId=scan.nextInt();

        if(urunler.keySet().contains(arananId)){
            System.out.print("Cikarmak istediginiz miktari giriniz : ");
            int cikisMiktari=scan.nextInt();

            urunler.get(arananId).setMiktar(urunler.get(arananId).getMiktar()-cikisMiktari);
        } else {
            System.out.println("aradiginiz urun bulunamamistir.");
        }
    }

    private static void rafaKoyma() {
        System.out.println("Raf girisi icin urunun Id'sini giriniz : ");

        int arananId=scan.nextInt();

        if(urunler.keySet().contains(arananId)){

            System.out.println("Raf nosu giriniz : ");
            scan.nextLine();//dummy
            String rafNo=scan.nextLine();
            urunler.get(arananId).setRaf(rafNo);
        } else {
            System.out.println("aradiginiz urun bulunamadi.");
        }
    }

    private static void urunMiktari() {

        System.out.println("Urun id'si ile urun girisi yapiniz : ");

        int arananId=scan.nextInt();

        if(urunler.keySet().contains(arananId)){
            System.out.println("Guncel miktari giriniz : ");
            int guncelMiktar=scan.nextInt();

            urunler.get(arananId).setMiktar(guncelMiktar+urunler.get(arananId).getMiktar());//mevcut miktar uzerine, guncel miktar eklenerek
                                                                                    //urunun guncel miktari belirlenmis oldu.
        } else {
            System.out.println("Aradiginiz urun bulunamadi.");
        }

    }

    private static void urunListeleme() {

        System.out.println("id       ismi         ureticisi       miktari       birimi         raf" +
                "\n=====================================================================");


        //burada mapimizi sete atamaliyiz ki map'teki urunlere ulasabilelim

        Set<Map.Entry<Integer, UrunTanimlama>> urunlerSeti= urunler.entrySet();

        //foreach kullanarak urunleri getirebiliriz

        for (Map.Entry<Integer, UrunTanimlama> each: urunlerSeti) {

            Integer urunlerKey=each.getKey();//burada urunlerin keyleri de yani id'leri alindi

            //printf ile urunlerKey=id, ve each.getValue().getUrunler...blabla ile de degerleri ekrana yansittik

            System.out.printf( "%d    %-8s       %-14s %3d          %-14s %s \n" , urunlerKey, each.getValue().getUrunIsmi(),
                    each.getValue().getUreticisi(), each.getValue().getMiktar(), each.getValue().getBirim(), each.getValue().getRaf());
        }

    }

    public static void urunTanimlama() {

        System.out.println("Lutfen urun bilgilerini giriniz : ");
        System.out.print("Urun ismi : ");
        scan.nextLine();//dummy
        String urunIsmi=scan.nextLine();

        System.out.print("Ureticinin ismini giriniz : ");
        String uretici=scan.nextLine();

        System.out.print("Urunun birimini giriniz : ");
        String birim=scan.nextLine();

       // System.out.print("Urunun mevcut miktarini giriniz : ");
       // int miktar=scan.nextInt();

        UrunTanimlama urun=new UrunTanimlama(id, urunIsmi,uretici,birim);
        //buraya kadar geldikten sonra map uzerinden calisma yapacagim icin class seviyesinde map yapiyoruz.

        urunler.put(id,urun);// id key oluyor burada, urun de butun degerleri kendisiyle getiriyor. Bunu da parametreli
                            // constructor ile urettigimiz urun objesinden saglamis oluyoruz.

        id++;//1000'den baslayarak ilerleyecek.
    }

}
