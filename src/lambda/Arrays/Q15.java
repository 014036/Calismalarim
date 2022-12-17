package lambda.Arrays;

import java.util.Arrays;

public class Q15 {
    /*  TASK :
        check your array's first and last elements are same
        (dizinizin ilk ve son elemanlarının ayni olup olmadığını kontrol eden kod yaziniz
        int []arr={2,6,4,8,2,6,2};
         */
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 8, 2, 6, 2};

        int ilkE = Arrays.stream(arr).findFirst().orElseThrow();
        System.out.println(ilkE);
        int sonE = Arrays.stream(arr).skip(arr.length - 1).findFirst().orElseThrow();
        System.out.println(sonE);

        System.out.println(Arrays.stream(arr).anyMatch(t -> ilkE==sonE)?"esittir":"degildir");




    }
}
