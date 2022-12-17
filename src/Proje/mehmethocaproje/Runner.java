package Proje.mehmethocaproje;

public class Runner {

    //runner basit ve simple olmalidir
    public static void main(String[] args) throws InterruptedException {

        Ogretmen.feykOgretmenEkle();
        Ogrenci.feykOgrenciEkle();
        Depo.anaMenu();
    }
}
