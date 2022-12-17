package Proje.okulyonetimimaps;

import java.util.Scanner;

public class AnaMenu implements AnaMenuInterface{

    static Scanner scan=new Scanner(System.in);

    public static void giris() {

        AnaMenu obj=new AnaMenu();  // obje create edildi

        System.out.println("Okul Yonetimi");
        System.out.println("Lutfen seciminizi yapiniz");
        System.out.println("1-Ogrenci Islemleri 2Ogretmen Islemleri Q-Cikis");

        String scm=scan.nextLine().toUpperCase();

        switch (scm){//switch body sade olacak, cagirdigimiz methodlar icerisinde islemler yapacagiz

            case "1":
                obj.ogrenciIslemleri();//asagidaki methodu cagirisyorsun ama ama asagidaki static olmadigi icin cagirma konusunda sorun
                                    //oluyor, ya interface classi da dahil hepsini static yapmak lazim ya da obje ureterek
                 break;                   //obje uzerinden method call edilebilinir. Bu nedenle bu classtan obje create ediyoruz

            case "2":
                obj.ogretmenIslemleri();
                break;
            case "Q":
                obj.cikis();
                break;

            default:
                System.out.println("lutfen gecerli bir islem yapiniz.");
                giris();
        }


    }

    @Override
    public void ogrenciIslemleri() {

        /*
        Islemler menusune gecmemiz lazim ama ogrenciIslemlerini/ogrenci ile alakali islemleri de beraberinde
        goturmek istedigimiz icin bi parametre eklememiz gerekiyor. Burada sadece menu cagrilmis olsa, method
        ogretmen mi ogrenci mi uzerine islem yapacagini bilmeyeceginden bu nedenle bi parametre eklememiz gerekir.

        Bunun icin Islemler classindan method olusturacagiz.
         */

        Islemler.IslemlerMenu(1);//buraya 1 girildi ama baska rakam da girsen olur, amac buradakini secince ogrenciIslemlerinin
                                    //gelmesini kolayca saglamak, yukaridaki rakamlarla alakasi yok. Kullanicinin gorecegi bir sey degil
                                    //reference gibi bir sey, diger classa bunun ogrenci isleri oldugunu iletiyor

    }

    @Override
    public void ogretmenIslemleri() {

        Islemler.IslemlerMenu(2);//ogretmenlerle alakali olarak 2 ile gidecek diger classa

    }

    @Override
    public void cikis() {

    }
}
