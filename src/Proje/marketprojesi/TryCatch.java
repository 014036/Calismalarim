package Proje.marketprojesi;

import java.util.InputMismatchException;

import static Proje.marketprojesi.Statics.scan;

public class TryCatch {
    public static double doubleGirisi(){

        double giris=0;
        boolean flag = true;

        while(flag){
            try{
                giris=scan.nextDouble();
                scan.nextLine();
                flag=false;
            } catch(InputMismatchException e){
                scan.nextLine();
                System.out.println("Lutfen bir sayi giriniz");
            }
        }
        return giris;
    }

    public static int intGirisi() {

        int giris=0;
        boolean flag=true;

        while(flag){

            try{
                giris=scan.nextInt();
                scan.nextLine();        //Dummy1
                flag=false;
            } catch (InputMismatchException e){
                scan.nextLine();
                System.out.println("Lutfen bir sayi giriniz.");
            }
        }

        return giris;
    }
}
