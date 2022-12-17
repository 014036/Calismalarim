package sekil;

public class Dikdortgen extends Sekil{
    public Dikdortgen(double uzunKenar, int kenar) { // bu const exstends oldugu icin Sekil clasindan aldik
        super(uzunKenar, kenar);
    }
    // generete den hazir aldik
    public double cevreHesaplama() {
        return super.cevreHesaplama();
    }
    //super kelimesi ile bu işlem bize alt sınıftan üst sınıfın
    // metoduna ulaşmamızı sağlayarak ekran çıktımızı vermemizi sağlıyor.
    public double alanHesaplama() {
        return super.alanHesaplama();
    }
    @Override // bunu yapmayinca calismiyor
    public String toString() {
        return "Dikdortgen " +
                ", \n UzunKenar=" + uzunKenar +
                ", Kenar=" + kenar +",\n Dikdortgenin alani = " + alanHesaplama() +
                ", \n Dikdörtgen cevre = " + cevreHesaplama();
    }
}