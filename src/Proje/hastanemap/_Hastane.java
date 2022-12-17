package Proje.hastanemap;

import java.util.Scanner;

public class _Hastane {
    static Scanner scan = new Scanner(System.in);

    public static void anaMenü() {


        String secim = "";
        do {
            System.out.println("\n\t === DILEK HASTANESI ===\t\n" +
                    "1-ID ILE DURUM BILGISI\n" +
                    "2-ISIM ILE HASTA BULMA\n" +
                    "3-SOYISIM ILE HASTA BULMA\n" +
                    "4-UNVAN ILE DOKTOR BULMA\n" +
                    "5-ID ILE HASTA BULMA\n" +
                    "Q-CIKIS");


            System.out.print("Yapmak istediginiz islemi seciniz : ");
            secim = scan.nextLine();

            switch (secim) {
                case "1":
                    _Hasta.idIleDurumBilgisiBul();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "q":
                case "Q":
                    break;


            }

        } while (!secim.equalsIgnoreCase("Q"));
    }
    }
