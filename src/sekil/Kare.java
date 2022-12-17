package sekil;

public class Kare extends Dikdortgen{
    public Kare(double uzunKenar, int kenar) {
        super(uzunKenar, kenar);
    }
    @Override // Bunlari dikdörtgen class indan aldik
    public String toString() {
        return "Kare " +
                ", \n UzunKenar=" + uzunKenar +
                ", Kenar=" + kenar +",\n Karenin alani = " + alanHesaplama() +
                ", \n Karenin cevre = " + cevreHesaplama();
    }
}
