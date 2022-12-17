package Proje.marketprojesi;

import java.util.Map;

import static Proje.marketprojesi.Statics.tumMusteriler;

public class Utilities {
    public static Integer musteriIdBul(String girilenIsim, String girilenParola) {

        int id=0;
        for(Map.Entry<Integer,Musteri> entry: tumMusteriler.entrySet()){
            if(entry.getValue().getKullaniciAdi().equals(girilenIsim) && entry.getValue().getParola().equals(girilenParola)){
                id=entry.getKey();
            }
        }
    return id;
    }

    public static void urunListele(Urun urun) {
        System.out.println();
    }
}
