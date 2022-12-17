package lambda.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q07 {
    /* TASK :
     * write a method that accepts a 2 dimensional array and finds the max value
     * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
     * Input : {{1,2,-3},{41,55},{-61,-17,80}}
     * Output : 80
     */
    public static void main(String[] args) {

        int arr[][]={{1,2,-3},{41,55},{-61,-17,80}};

        List<Integer> newArr=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                newArr.add(arr[i][j]);
            }
        }
        System.out.println(newArr);

        System.out.println(newArr.stream().reduce(Math::max).orElseThrow());//80
        System.out.println(newArr.stream().mapToInt(t -> t).max().orElseThrow());//80
        System.out.println(newArr.stream().mapToInt(t -> t).max());//OptionalInt[80]

    }

}
