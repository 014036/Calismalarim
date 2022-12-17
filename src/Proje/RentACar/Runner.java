package Proje.RentACar;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        MusteriveAracBilgileri start = new MusteriveAracBilgileri();

        start.AracTalep();
        start.arabalar();
        start.müsteriBilgisi();
        start.ödemeBilgileri();
    }
}
