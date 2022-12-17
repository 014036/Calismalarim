package kavheMakinesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static List<Depo> kahveListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        kahveEkleme();
    }

    private static void kahveEkleme() {
        System.out.println("Kavhe adi");
        String kahveAdi = scan.next();

        System.out.println("Sut adi");
        String sutAdi = scan.next();//Line olunca altttaki geliyor. ama boyle de kullanici sinirlaniyor
        //listeye eklerken default geliyor eger Line olursa!!!!!!


        System.out.println("Kahve nosu");
        int kahveNo = scan.nextInt();

        System.out.println("Seker turu");
        String seker = scan.next();

        System.out.println("devam etmek icin 1'e basiniz. cikis icin 0'a");

        int tercih = 0;
        tercih = scan.nextInt();

        if (tercih == 1) {
            kahveEkleme();
        } else if(tercih==0){
            System.out.println("cikis yaptiniz teskkurler");
        } else  System.out.println("hatali veri ");

        Depo kahve = new Depo(kahveAdi, kahveNo, sutAdi, seker);//kullanicidan istedigin variable adini GIR!!
        kahveListesi.add(kahve);
        Depo kahve2=new Depo(kahveAdi,kahveNo);
        kahveListesi.add(kahve2);
       System.out.print(kahveListesi);


        kahve.setKahveAdi(scan.next());//bu sekilde yapinca terminalde verdigin ismi ekliyor kahveye
        System.out.println(kahve.getKahveAdi());//listeden bagimsiz calisir direk objenin adini getirir.

        System.out.println(kahveListesi.toString());
    }
}
