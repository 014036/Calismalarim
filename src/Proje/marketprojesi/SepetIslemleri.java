package Proje.marketprojesi;

public class SepetIslemleri extends Statics {
    public static void urunSec(SepetIslemleri sepetIslemleri, Musteri musteri) {
        tumUrunler.values().stream().forEach(Utilities::urunListele);
    }
}
