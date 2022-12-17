package Proje.marketprojesi;

public class AnaMenu extends Statics{

    //2.adim-->Static classina AnaMenu'yu extends ettikten sonra
    //ana ekranda cikmasini istedigimiz kisimlari ekliyoruz

    public static void anaGirisEkrani(){

        while(true){//while ile bir dongu saglamis oluyoruz
            //printf kullancam sonrasinda
            System.out.println("Hosgeldiniz");
            System.out.println("Hesap olusturmak icin 1, Giris yapmak icin 2, Cikis yapmak icin 3'u tuslayiniz.");

            int tercih=TryCatch.intGirisi();
        /*
        simdi int tercih=TryCatch.intGirisi() yazdigimizda otomatikmen TryCatch classinda method create
        etmenizi istiyor. kirmizi veriyor yani, kirmizi cikan yere otomatik basinca zaten yapar
        sonra TryCatch classina gidip orada method create etmis oluyoruz
         */

            switch(tercih){
                case 1:HesapIslemleri.hesapOlustur();//bunlari da HesapIslemleri classinda create duyoruz
                case 2: HesapIslemleri.girisYap();
                break;//sonsuz donguye girer eklemez isek. AMA SILIP TEST ET!
                case 3:cikisEkrani();
            }
        }

    }

    private static void cikisEkrani() {

        System.out.println("YINE BEKLERIZ");
        System.exit(0);//burada sistemi sonlandiriyoruz. YINE DE ACIKLAMASINA BAK!!!
    }


}
