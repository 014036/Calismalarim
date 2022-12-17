package Proje.kitapyonetimi_Maps;

public class KitapTanimlama {

    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;
    private int kitapFiyat;
    private int kitapAdedi;
    private String rafNo;

    public KitapTanimlama() {
    }

    public KitapTanimlama(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
    }

    public KitapTanimlama(int kitapNo, String kitapAdi, String yazarAdi, int kitapFiyat, int kitapAdedi, String rafNo) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyat = kitapFiyat;
        this.kitapAdedi = kitapAdedi;
        this.rafNo = rafNo;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getKitapFiyat() {
        return kitapFiyat;
    }

    public void setKitapFiyat(int kitapFiyat) {
        this.kitapFiyat = kitapFiyat;
    }

    public int getKitapAdedi() {
        return kitapAdedi;
    }

    public void setKitapAdedi(int kitapAdedi) {
        this.kitapAdedi = kitapAdedi;
    }

    public String getRafNo() {
        return rafNo;
    }

    public void setRafNo(String rafNo) {
        this.rafNo = rafNo;
    }

    @Override
    public String toString() {
        return "KitapTanimlama{" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", kitapFiyat=" + kitapFiyat +
                ", kitapAdedi=" + kitapAdedi +
                ", rafNo=" + rafNo +
                '}';
    }
}
