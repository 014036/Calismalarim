package Proje.okulyonetimitekrar;

import java.util.Scanner;

import static Proje.okulyonetimitekrar.Islem.scan;

public class Kisi {

    //POJO CLASS

    private String adSoyadi;
    private String kimlikNo;
    int yas;

    public Kisi() {
    }

    public Kisi(String adSoyadi, String kimlikNo, int yas) {
        //this.adSoyadi = adSoyadi;
        setAdSoyadi(adSoyadi);
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public String getAdSoyadi() {
        return adSoyadi;
    }

    public void setAdSoyadi(String adSoyadi) {

        this.adSoyadi = adSoyadi.toUpperCase();

    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas=yas;
    }




    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyadi='" + adSoyadi + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
