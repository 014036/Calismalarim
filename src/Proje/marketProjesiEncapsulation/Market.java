package Proje.marketProjesiEncapsulation;

public class Market extends MarketMerkezi{
    //POJO CLASS

    private String urunIsmi;
    private int urunFiyatlari;

    Market(){

    }
    //PARAMETRELI CONSTRUCTOR BURADA YOK NEDEN?? EXTEND EDILDI ASLINDA BURAYA EKLEMEN GEREKMEZ MI Ebrucum?

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getUrunFiyatlari() {
        return urunFiyatlari;
    }

    public void setUrunFiyatlari(int urunFiyatlari) {
        this.urunFiyatlari = urunFiyatlari;
    }

    @Override
    public String toString() {
        return "Market{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", urunFiyatlari=" + urunFiyatlari +
                '}';
    }
}
