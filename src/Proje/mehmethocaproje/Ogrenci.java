package Proje.mehmethocaproje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Map<String, String> ogrenciMap=new HashMap<>();
    static Scanner scan=new Scanner(System.in);

    public static void feykOgrenciEkle(){
        ogrenciMap.put("123456987411","Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("123456987412","Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("123456987413","Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("123456987414","Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("123456987415","Alp, Yan, 2009, 3769, 11, A");
    }

    public static void ogrenciMenu() throws InterruptedException {

        String tercih="";
        do{
            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "=========== OGRENCI MENU ============\n" +
                    "\t   1- Ogrenci Listesi Yazdir\n" +
                    "\t   2- Soyisimden Ogrenci Bulma\n" +
                    "\t   3- Sinif ve Sube Ile Ogrenci Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogrenci Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ");

            System.out.println("bir tercih yapiniz : ");
            tercih=scan.nextLine();
            
            switch(tercih){
                case "1":
                    ogrenciListesiYazdir();
                    break;
                case "2":
                    soyIsimdenOgrenciBulma();
                    break;
                case "3":
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4":
                    ogrenciEkleme();
                    break;
                case "5":
                    kimlikNoIleKayitSilme();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("hatali veri girisi.");
            }
            
            
        } while(!tercih.equalsIgnoreCase("Q"));
        System.exit(0);
    }

    private static void kimlikNoIleKayitSilme() {

        System.out.println("kaydini silmek istediginiz ogrencinin TCsini giriniz : ");
        String silinecekTC=scan.nextLine();

        String silinecekOgrenci=ogrenciMap.get(silinecekTC);//ogrencinin butun bilgilerini getirdik
        String sonucValue=ogrenciMap.remove(silinecekTC);//burada da sildik

        while(true){
            try{
                boolean sonuc=sonucValue.equals(silinecekOgrenci);

                if(sonuc==true){

                    System.out.println("Kayit basariyla silinmistir. ");
                    break;
                } else throw new Exception();
            } catch (Exception e){
                System.out.println("Aradiginiz TCde ogrenci bulunamadi");
                break;
            }
        }
    }

    private static void ogrenciEkleme() {

        System.out.println("Tc no");
        String tcNo=scan.nextLine();
        System.out.println("Isim");
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyisim=scan.nextLine();
        System.out.println("Dogum Yili");
        String dogumYili=scan.nextLine();
        System.out.println("Okul No");
        String okulNo=scan.nextLine();
        System.out.println("Sinif");
        String sinif=scan.nextLine();
        System.out.println("Sube");
        String sube=scan.nextLine();

        //ONEMLIIII ", "  yapmazsan ve sadece " " yaparsan exception firlatiyor!!!!

        String value=isim+ ", " + soyisim+ ", " + dogumYili+ ", " + okulNo + ", "+ sinif + ", " + sube;
        ogrenciMap.put(tcNo,value);
    }

    private static void sinifVeSubeIleOgrenciBulma() {

        System.out.println("Aragidiniz ogrencinin sinifini giriniz : ");
        String arananSinif=scan.nextLine();
        System.out.println("Aradiginiz ogrencinin subesini giriniz : ");
        String aranaSube=scan.nextLine();


        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");

        Set<Map.Entry<String, String>> ogrenciEntrySet=ogrenciMap.entrySet();

        for (Map.Entry<String, String> each:ogrenciEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");

            if (arananSinif.equalsIgnoreCase(eachValueArr[4]) && aranaSube.equalsIgnoreCase(eachValueArr[5])) {
                System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3],
                        eachValueArr[4], eachValueArr[5]);
            }
        }
    }

    private static void soyIsimdenOgrenciBulma() {
        System.out.println("Aradiginiz ogrencini soyismini giriniz : ");
        String arananSoyisim=scan.nextLine();

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");

        Set<Map.Entry<String, String>> ogrenciEntrySet=ogrenciMap.entrySet();

        for (Map.Entry<String, String> each:ogrenciEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");
            if (arananSoyisim.equalsIgnoreCase(eachValueArr[1])) {
                System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3],
                        eachValueArr[4], eachValueArr[5]);
            }
        }
    }

    private static void ogrenciListesiYazdir() {

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRENCI LISTESI ============\n" +
                "Tc No        Isim   Soyisim   D Yili  Okul No  Sinif  Sube");

     Set<Map.Entry<String, String>> ogrenciEntrySet=ogrenciMap.entrySet();

        for (Map.Entry<String, String> each:ogrenciEntrySet) {

            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValueArr[]=eachValue.split(", ");
            System.out.printf("%-12s %-6s %-9s %-7s %-8s %-5s %-2s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3],
                    eachValueArr[4], eachValueArr[5]);
        }
    }
}
