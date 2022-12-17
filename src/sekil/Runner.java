package sekil;

import java.util.Scanner;

public class Runner {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        girisPaneli();
/*
dikdortrgen ve kare yi dolayli yoldan almis olduk
​
Cemberi task in disina cikip direk cagirmis olduk
 */

    }

    private static void girisPaneli() {
        System.out.println("Lütfen yapacaginiz islemi seciniz \nDikdortgen hesaplamasi icin =1 \nKare hesaplamalari icin =2 " +
                "\nCember hesaplamalari icin = 3 \n Cikmak icin =4 yaziniz");
        int islem = 0;

        while (true) {
            try {
                islem = scan.nextInt();
                if (islem <= 0 || islem >4) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Tercihler 0,1,2,ve 4 olmalidir...");
            } catch (Exception e) {
                String str = scan.next(); // bu olmazsa sonsuz döngüye girer
                System.out.println("Numerik veri giriniz.");

            }
        }

        switch (islem) {
            case 1:
                System.out.print("Lütfen dikdorgenin kisa ve uzun kenarini giriniz : ");
                int kenar = scan.nextInt();
                double uzunKenar = scan.nextDouble();

                Dikdortgen dort = new Dikdortgen(uzunKenar, kenar); // parametreyi kullanicidan istedik
                dort.cevreHesaplama();
                dort.alanHesaplama();
                System.out.println(dort);

                System.out.print("Devam etmek icin lütfen yapacaginiz islem türünü seciniz = ");
                int islemTuru1 = scan.nextInt();

                if (islemTuru1 == 1 || islemTuru1 == 2 || islemTuru1 == 3) {
                    girisPaneli();
                } else if (islemTuru1 >= 4) {
                    cikis();
                }

                break;

            case 2:
                System.out.print("Lütfen cemberin yaricapini giriniz : ");
                int kenar1 = scan.nextInt();

                Kare kar = new Kare(kenar1, kenar1);
                kar.cevreHesaplama();
                kar.alanHesaplama();
                System.out.println(kar);

                System.out.print("Devam etmek icin lütfen yapacaginiz islem türünü seciniz = ");
                int islemTuru2 = scan.nextInt();

                if (islemTuru2 == 1 || islemTuru2 == 2 || islemTuru2 == 3) {
                    girisPaneli();

                } else if (islemTuru2 >= 4) {
                    cikis();
                }

                break;

            case 3:
                System.out.print("Lütfen cemberin yaricapini giriniz : ");
                double yariCap = scan.nextInt();

                Cember cem = new Cember(yariCap);
                cem.cemberAlanHesaplama();
                cem.cemberCevreHesaplama();
                System.out.print("Devam etmek icin lütfen yapacaginiz islem türünü seciniz = ");
                int islemTuru3 = scan.nextInt();

                if (islemTuru3 == 1 || islemTuru3 == 2 || islemTuru3 == 3) {
                    girisPaneli();

                } else if (islemTuru3 >= 4) {

                    cikis();
                }
                break;

            case 4:
                cikis();
                break;
            default:
                System.out.println("Hatali veri girdiniz... Lütfen tekrar deneyiniz");
                girisPaneli();
                break;
        }
    }
    private static void cikis() {
        System.out.println("Hoscakalin iyi calismalar...");
    }
}