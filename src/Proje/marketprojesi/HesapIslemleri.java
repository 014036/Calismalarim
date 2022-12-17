package Proje.marketprojesi;

import Proje.e.TryCatches;

import static Proje.marketprojesi.Statics.scan;
import static Proje.marketprojesi.Statics.tumMusteriler;

public class HesapIslemleri {
    public static void hesapOlustur() {
        System.out.println("Kullanici adi ve parolayi giriniz : ");
        tumMusteriler.put(++Musteri.musteriIdCount,new Musteri(Musteri.musteriIdCount, scan.next(),scan.nextLine()));
        /*
        tumMusteri map'inde  public static Map<Integer, Musteri> tumMusteriler=new HashMap<>(); static classinda
        key=Integer olarak atanmis yani Musteri.musteriIdCount oluyor, value=Musteri olarak
        new Musteri(Musteri.musteriIdCount, scan.next(),scan.nextLine())) da Musteri classi icerisindeki
        public Musteri(int musteriIdCount, String kullaniciAdi, String parola) cons'una denk geliyor ki
        scan.next(), scan.nextLine() kullanici adi ve parolasini almak icin yazilmis.
         */
        System.out.println("Musteri kaydi basariyla gerceklesmistir.");
    }

    public static void girisYap() {

        System.out.println("Giris icin isminizi giriniz : ");
        String girilenIsim=scan.next();
        System.out.println("Parolanizi giriniz : ");
        String girilenParola=scan.next();

        boolean giris=false;

        if(tumMusteriler.values().stream().anyMatch(t->t.getKullaniciAdi().equals(girilenIsim) && t.getParola().equals(girilenParola))){
            System.out.println("giris basarili");
            giris=true;

            HesapIslemleri islem=new HesapIslemleri();
            islem.islemSec(islem,tumMusteriler.get(Utilities.musteriIdBul(girilenIsim,girilenParola)));
        }
        if(!giris){
            System.out.println("hatali giris yaptiniz. lutfen tekrar deneyiniz");
            girisYap();
        }
    }


    private void islemSec(HesapIslemleri islem, Musteri musteri) {

        int secim=0;
        while(secim!=3){

            System.out.println("Hesabiniza para yatirmak icin 1\nUrunleri incelemek icin 2\nCikis yapmak icin 3'u tuslayin.");

            secim= TryCatches.intGirisi();

            if(secim==1) islem.paraYatir(musteri);
            else if (secim==1) SepetIslemleri.urunSec(new SepetIslemleri(),musteri);
            //
            else if(secim==3) break;
            else{
                System.out.println("hatali giris yaptiniz");
                islemSec(islem,musteri);//recursive
            }
        }
        AnaMenu.anaGirisEkrani();
    }

    private void paraYatir(Musteri musteri) {

        System.out.println("hesabiniza yatirmak istediginiz miktari giriniz ");
        double yatirilanPara= TryCatch.doubleGirisi();

        if(yatirilanPara>0) {
            musteri.setBakiye(musteri.getBakiye()+yatirilanPara);
            System.out.println("Yatirma isleminiz gerceklesmistir.\nBakiyeniz : " + musteri.getBakiye());
        } else{
            System.out.println("0'dan buyuk bir deger girmelisiniz.");
        }

    }
}
