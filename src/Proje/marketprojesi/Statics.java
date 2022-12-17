package Proje.marketprojesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Statics {

    // 1. adim===>static olan butun methodlar buraya konulup diger classlardan cagriliyor

    public static Scanner scan=new Scanner(System.in);
    public static Map<Integer, Urun> tumUrunler=new HashMap<>();
    public static Map<Integer, Musteri> tumMusteriler=new HashMap<>();

    //static olan methodlar yazildiktan sonra AnaMenu buna extends edilecek
    //ayrica burada Map icerisine Urun, Musteri classlari yerlestirilerek
    //obje uzerinden bu iki class icerisindeki butun methodlari cagirabiliyoruz?
}
