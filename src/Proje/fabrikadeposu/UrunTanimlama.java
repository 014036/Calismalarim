package Proje.fabrikadeposu;

public class UrunTanimlama {

    private int id;
    private String urunIsmi;
    private String ureticisi;
    private int miktar;
    private String birim;
    private String raf;

    public UrunTanimlama() {
    }

    public UrunTanimlama(int id, String urunIsmi, String ureticisi, int miktar, String birim, String raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.ureticisi = ureticisi;
       // this.miktar = miktar;
        setMiktar(miktar);
        this.birim = birim;
        this.raf = raf;
    }

    public UrunTanimlama(int id, String urunIsmi, String ureticisi, String birim) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.ureticisi = ureticisi;
        this.birim = birim;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUreticisi() {
        return ureticisi;
    }

    public void setUreticisi(String ureticisi) {
        this.ureticisi = ureticisi;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {

       if(miktar<0){
           this.miktar=0;
       } else
           this.miktar = miktar;

    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "UrunTanimlama{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", ureticisi='" + ureticisi + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }
}
