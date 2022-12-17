package lambda.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q05 {
    /*  TASK :
     * write a java program that calculates the average value of array elements
     * Print elements that are greater than avarage
     * (dizi elemanlarinin ortalama degerini hesaplayan ve
     * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
     * input[]= {1,2,3,4,5,6,7}
     * Output : 4
     */

    public static void main(String[] args) {

        int input[]= {1,2,3,4,5,6,7};

        List<Integer> newArr=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        ortalamaBul(newArr);


    }

    private static void ortalamaBul(List<Integer> newArr) {

        Double ort=newArr.stream().mapToInt(t->t).average().orElseThrow();
        System.out.println(ort);
        ortalamadanBuyuk(ort,newArr);
    }

    private static void ortalamadanBuyuk(Double ort, List<Integer> newArr) {

        newArr.stream().filter(t->t>ort).forEach(t-> System.out.print(t + " "));

    }


}
