package Proje.mehmethocaproje;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Scanner scan=new Scanner(System.in);
    static Map<String, String> ogretmenlerMap=new HashMap<>();

    public static void feykOgretmenEkle() {
        ogretmenlerMap.put("123456987411","Ali, Can, 1980, Matematik");
        ogretmenlerMap.put("123456987412","Veli, Yan, 1981, Fizik");
        ogretmenlerMap.put("123456987413","Ayse, Can, 1982, Kimya");
        ogretmenlerMap.put("123456987414","Ali, San, 1983, Kimya");
        ogretmenlerMap.put("123456987415","Alp, Yan, 1984, Matematik");
    }

    public static void ogretmenMenu() throws InterruptedException {

        String tercih="";
        do{

            System.out.println("============= YILDIZ KOLEJI =============\n" +
                    "=========== OGRETMEN MENU ============\n" +
                    "\n" +
                    "\t   1- Ogretmenler Listesi Yazdir\t\n" +
                    "\t   2- Soyisimden Ogretmen Bulma\n" +
                    "\t   3- Branstan Ogretmen Bulma\n" +
                    "\t   4- Bilgilerini Girerek Ogretmen Ekleme\n" +
                    "\t   5- Kimlik No Ile Kayit Silme \t\n" +
                    "\t   A- ANAMENU\n" +
                    "\t   Q- ÇIKIŞ\n");

            System.out.println("Lutfen bir tercihte bunun : ");
            tercih=scan.nextLine();

            switch(tercih){
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyIsimdenOgretmenBulma();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    ogretmenEkleme();
                    break;
                case "5":
                 tcNoIleOgretmenSilme();
                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("lutfen gecerli tercih yapiniz.");
            }

        } while(!tercih.equalsIgnoreCase("q"));
        System.exit(0);
    }

    public static void tcNoIleOgretmenSilme() {

        System.out.println("Silinecek Ogretmen Kimlik no giriniz ");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);//sil.og. valuesu gelecek

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);//true

        while (true) {

            try {
                boolean sonuc = sonucValue.equals(silinecekValue);//true

                if (sonuc==true) {
                    System.out.println("aradiginiz ogretmenin kaydi silinmistir. ");
                    break;
                } else throw new Exception();
            } catch (Exception e) {
                System.out.println("hatali veri girisi");
                System.out.println("Girilen TC numarasina sahip ögretmen bulunamadi.");
                break;
            }
        }

    }

    public static void ogretmenEkleme() {

        System.out.println("Tc no");
        String tcNo=scan.nextLine();
        System.out.println("isim");
        String isim=scan.nextLine();
        System.out.println("soyisim");
        String soyisim=scan.nextLine();
        System.out.println("Dogum yili");
        String dYili=scan.nextLine();
        System.out.println("Brans");
        String brans=scan.nextLine();

        //key ve value olarak ekleme yapabiliriz
        String eklenecekValue= isim + ", " + soyisim+ ", " + dYili+ ", " + brans;
        ogretmenlerMap.put(tcNo,eklenecekValue);

    }

    public static void branstanOgretmenBulma() {

        System.out.println("Aradiginiz Ogretmenin bransini giriniz : ");
        String arananBrans=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenlerMap.entrySet();//bu sete donusturecek ve biz bunu Set olarak kullanmak istersek bir sete atamak gerekir

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRETMEN LISTESI ============\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> each:ogretmenEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");

            if (arananBrans.equalsIgnoreCase(eachValueArr[3])) {

                System.out.printf("%11s %-6s    %-8s %4s    %s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
            }
        }
    }

    public static void soyIsimdenOgretmenBulma() {


        System.out.println("Aradiginiz Ogretmenin soyIsmini giriniz : ");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenlerMap.entrySet();//bu sete donusturecek ve biz bunu Set olarak kullanmak istersek bir sete atamak gerekir

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRETMEN LISTESI ============\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> each:ogretmenEntrySet) {

            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValueArr[] = eachValue.split(", ");

            if (istenenSoyisim.equalsIgnoreCase(eachValueArr[1])) {

                System.out.printf("%11s %-6s    %-8s %4s    %s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
            }
        }

    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
       // System.out.println(ogretmenlerMap);
       Set<Map.Entry<String,String>> ogretmenEntrySet=ogretmenlerMap.entrySet();//bu sete donusturecek ve biz bunu Set olarak kullanmak istersek bir sete atamak gerekir

        System.out.println("============= YILDIZ KOLEJI =============\n" +
                "=========== OGRETMEN LISTESI ============\n"+
                "TcNo        Isim   Soyisim   D.Yili  Brans");

        for (Map.Entry<String,String> each:ogretmenEntrySet) {

            String eachKey=each.getKey();
            String eachValue=each.getValue();

            String eachValueArr[]=eachValue.split(", ");

            System.out.printf("%11s %-6s    %-8s %4s    %s \n", eachKey, eachValueArr[0], eachValueArr[1], eachValueArr[2], eachValueArr[3]);
        }

        Thread.sleep(5000);
    }
}
