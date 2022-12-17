package Proje.Hastane_projesi;

public class Durum {

    private String aktuelDurum;
    private boolean aciliyet;

    public Durum(){//psiz constructor

    }
    public String getAktuelDurum() {
        return aktuelDurum;
    }

    public void setAktuelDurum(String aktuelDurum) {
        this.aktuelDurum = aktuelDurum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }
}
