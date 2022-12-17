package lambda.Arrays;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q01 {

    /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.
	 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi = scan.nextInt();
        Integer arr[] = new Integer[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.println("Arrayin " + (i + 1) + " . elemanini giriniz : ");
            arr[i] = scan.nextInt();

        }

        minMAxFark2(arr);
    }

    public static void minMAxFark2(Integer arr[]){

        Integer maS=Arrays.stream(arr).mapToInt(t->t).max().orElseThrow();
        Integer miS=Arrays.stream(arr).mapToInt(t->t).min().orElseThrow();

        System.out.println(maS-miS);


    }


}
