package kavheMakinesi;

public class Depo {

    private String kahveAdi;
    private int kahveNosu;
    private String sut;
    private String seker;

    public Depo() {
    }

    public Depo(String kahveAdi, int kahveNosu, String sut, String seker) {
        this.kahveAdi = kahveAdi;
        this.kahveNosu = kahveNosu;
        this.sut = sut;
        this.seker = seker;
    }

    public Depo(String kahveAdi, int kahveNosu) {
        this.kahveAdi = kahveAdi;
        this.kahveNosu = kahveNosu;
    }

    public String getKahveAdi() {
        return kahveAdi;
    }

    public void setKahveAdi(String kahveAdi) {
        this.kahveAdi = kahveAdi;
    }

    public int getKahveNosu() {
        return kahveNosu;
    }

    public void setKahveNosu(int kahveNosu) {
        this.kahveNosu = kahveNosu;
    }

    public String getSut() {
        return sut;
    }

    public void setSut(String sut) {
        this.sut = sut;
    }

    public String getSeker() {
        return seker;
    }

    public void setSeker(String seker) {
        this.seker = seker;
    }

    @Override
    public String toString() {
        return "Depo{" +
                "kahveAdi='" + kahveAdi + '\'' +
                ", kahveNosu=" + kahveNosu +
                ", sut='" + sut + '\'' +
                ", seker='" + seker + '\'' +
                '}';
    }
}
