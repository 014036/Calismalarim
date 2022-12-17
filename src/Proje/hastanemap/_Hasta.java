package Proje.hastanemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class _Hasta {
    static Map<String, String> hastalar = new HashMap<>();
    static Scanner scan = new Scanner(System.in);

    public static void Hasta() {
        hastalar.put("111", "Warren, Traven, Allerji");
        hastalar.put("222", "Petanow, William, Bas agrisi");
        hastalar.put("333", "Sophia, George, Diabet");
        hastalar.put("444", "Emma, Tristan, Soguk alginligi");
        hastalar.put("555", "Darian, Luis, Migren");
        hastalar.put("666", "Peter, Cole, Kalp Hastaliklari");

    }


    public static void idIleDurumBilgisiBul() {
        System.out.println("Bulmak istediginiz ID : ");
        String idBul = scan.nextLine();
        System.out.println("Bulmak istediginiz hastanin hastaligi : ");
        String hastalikBul = scan.nextLine();

        Set<Map.Entry<String, String>> setHastalar = hastalar.entrySet();
        System.out.println("\t === HASTALAR ===\n" +
                "ID   ISIM      SOYISIM   HASTALIK");

        for (Map.Entry<String, String> each : setHastalar) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            String[] eachValurArr = eachValue.split(", ");
            if (idBul.equalsIgnoreCase(each.getKey())) {
                System.out.printf("%-3s   %-7s    %-8s  %-15s", eachKey, eachValurArr[0], eachValurArr[1], eachValurArr[2]);
                _Doktor.doktorBul(hastalikBul);
            }
        }

    }
}
