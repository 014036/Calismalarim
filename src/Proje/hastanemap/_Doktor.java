package Proje.hastanemap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class _Doktor {
    static Map<String, String> doktorlar = new LinkedHashMap<>();
    static Set<Map.Entry<String, String>> setDoktorlar = doktorlar.entrySet();


    public static void Doktor() {
        doktorlar.put("Allergist", "Wilson, Avery");
        doktorlar.put("Norolog", "John, Abel");
        doktorlar.put("Genel cerrah", "Robert, Erik");
        doktorlar.put("Cocuk doktoru", "Marry, Jacob");
        doktorlar.put("Dahiliye", "Alan, Pedro");
        doktorlar.put("Kardiolog", "Mahesh, Tristen");

    }


    public static void doktorBul(String hastalikBul) {

        switch (hastalikBul) {

            case "Allerji":
                for (Map.Entry<String, String> each : setDoktorlar) {
                    String eachKey = each.getKey();
                    String eachValue = each.getValue();

                    String[] eachValurArr = eachValue.split(", ");

                    if (each.getKey().equals("Allergist")) {
                        System.out.println("\n\t === DOKTORLAR ===\n" +
                                "UNVAN              ISIM      SOYISIM");
                        System.out.printf("%-14s    %-7s    %-8s", eachKey, eachValurArr[0], eachValurArr[1]);
                    }
                }
                break;


            case "Bas agrisi":
                for (Map.Entry<String, String> each : setDoktorlar) {
                    String eachKey = each.getKey();
                    String eachValue = each.getValue();

                    String[] eachValurArr = eachValue.split(", ");

                    if (hastalikBul.equalsIgnoreCase("Bas agrisi") && each.getKey().equals("Norolog")) {
                        System.out.println("\n\t === DOKTORLAR ===\n" +
                                "UNVAN              ISIM      SOYISIM");
                        System.out.printf("%-14s    %-7s    %-8s", eachKey, eachValurArr[0], eachValurArr[1]);
                    }
                }
                break;

            case "Diabet":
                for (Map.Entry<String, String> each : setDoktorlar) {
                    String eachKey = each.getKey();
                    String eachValue = each.getValue();
                    String[] eachValurArr = eachValue.split(", ");
                    if (hastalikBul.equalsIgnoreCase("Diabet") && each.getKey().equals("Genel cerrah")) {
                        System.out.println("\n\t === DOKTORLAR ===\n" +
                                "UNVAN              ISIM      SOYISIM");
                        System.out.printf("%-14s    %-7s    %-8s", eachKey, eachValurArr[0], eachValurArr[1]);
                    }
                }
                break;


            case "Soguk Alginligi":
                for (Map.Entry<String, String> each : setDoktorlar) {
                    String eachKey = each.getKey();
                    String eachValue = each.getValue();
                    String[] eachValurArr = eachValue.split(", ");
                    if (hastalikBul.equalsIgnoreCase("Soguk Alginligi") && each.getKey().equals("Cocuk doktoru")) {
                        System.out.println("\n\t === DOKTORLAR ===\n" +
                                "UNVAN              ISIM      SOYISIM");
                        System.out.printf("%-14s    %-7s    %-8s", eachKey, eachValurArr[0], eachValurArr[1]);
                    }
                }
                break;
            case "Migren":
                for (Map.Entry<String, String> each : setDoktorlar) {
                    String eachKey = each.getKey();
                    String eachValue = each.getValue();
                    String[] eachValurArr = eachValue.split(", ");
                    if (hastalikBul.equalsIgnoreCase("Migren") && each.getKey().equals("Dahiliye")) {
                        System.out.println("\n\t === DOKTORLAR ===\n" +
                                "UNVAN              ISIM      SOYISIM");
                        System.out.printf("%-14s    %-7s    %-8s", eachKey, eachValurArr[0], eachValurArr[1]);
                    }
                }
                break;
            case "Kalp Hastaliklari":
                for (Map.Entry<String, String> each : setDoktorlar) {
                    String eachKey = each.getKey();
                    String eachValue = each.getValue();
                    String[] eachValurArr = eachValue.split(", ");
                    if (hastalikBul.equalsIgnoreCase("Kalp Hastaliklari") && each.getKey().equals("Kardiolog")) {
                        System.out.println("\n\t === DOKTORLAR ===\n" +
                                "UNVAN              ISIM      SOYISIM");
                        System.out.printf("%-14s    %-7s    %-8s", eachKey, eachValurArr[0], eachValurArr[1]);
                    }
                }
                break;
            default:
                System.out.println("Girdiginiz hastaliga sahip bir hasta bulunamadi");
                doktorBul(hastalikBul);


        }
    }
}
