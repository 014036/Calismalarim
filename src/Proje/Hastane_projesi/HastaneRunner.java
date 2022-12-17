package Proje.Hastane_projesi;

import java.util.Scanner;

public class HastaneRunner {

    public static Hastane hastane = new Hastane();
    static Scanner scan=new Scanner(System.in);//1

    public static void main(String[] args) {

        String hastaDurumu="Bas agiris";
        String unvan=doktorUnvan(hastaDurumu);//burada neden hastaDurumu olsun?

        hastane.setDoktor(doktorBul(unvan));
        hastane.setHasta(hastaBul(hastaDurumu));

        System.out.println("Doktor isimi :" + hastane.getDoktor().getIsim());
        System.out.println("Doktorun soyisimi :" + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktorun Unvani : " + hastane.getDoktor().getUnvan());
        System.out.println("Hastanin ismi : " + hastane.getHasta().getIsim());
        System.out.println("Hastanin soyismi : " + hastane.getHasta().getSoyIsim());
        System.out.println("Hastanin durumu : " + hastaDurumu);
    }

    public static String doktorUnvan(String aktuelDurum){
        /*
        methodu unvan variableina ata dedigi icin String unvan ilk basta default iken
        bu atamayi assing ederek yapanilirim.
         */

        if(aktuelDurum.equals("Alerji")){
            return hastane.unvanlar[0];
        } else if(aktuelDurum.equals("Bas agrisi")){
            return hastane.unvanlar[1];
        } else if(aktuelDurum.equals("Diabet")){
            return hastane.unvanlar[2];
        } else if(aktuelDurum.equals("Soguk alginligi")){
            return hastane.unvanlar[3];
        } else if(aktuelDurum.equals("Migren")){
            return hastane.unvanlar[4];
        } else if(aktuelDurum.equals("Kalp hastaliklari")){
            return hastane.unvanlar[5];
        } else return "yanlis unvan";


    }


    public static Doktor doktorBul(String unvan){

        Doktor doktor=new Doktor();

        for (int i = 0; i <hastane.unvanlar.length; i++) {

            if(unvan.equals(hastane.unvanlar[i])){
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyisimleri[i]);
                doktor.setUnvan(unvan);
            }

        }

        return doktor;
    }


    public static Durum hastaDurumBul(String aktuelDurum){

        Durum hastaDurumu=new Durum();

        switch(aktuelDurum){
            case "Alerji":
            case "Bas agiris":
            case "Diabet":
            case "Soguk alginligi":
                hastaDurumu.setAciliyet(false);
                break;
            case "Migren":
            case "Kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil");
                break;
        }

        return hastaDurumu;
    }

    public static Hasta hastaBul(String actualCase){

        Hasta hasta=new Hasta();

        for (int i = 0; i < hastane.hastaIsimleri.length; i++) {

            if(actualCase.equals(hastane.durumlar[i])){
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaIsimleri[i]);
                hasta.setHastaID(hastane.hastaIDleri[i]);
               //  hasta.setHastaDurumu(actualCase);

            }
        }

        return hasta;

    }
}



