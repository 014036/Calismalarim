package Proje.okulyonetimitekrar;

public class Ogretmen extends Kisi {

    private String sicilNo;
    private String bolum;


    public Ogretmen() {
    }


    public Ogretmen(String adSoyadi, String kimlikNo, int yas, String sicilNo, String bolum) {
        super(adSoyadi, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }


    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }


    @Override
    public String toString() {
        return "Ogretmen{" +
                "sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum + '\'' +
                '}';
    }
}
