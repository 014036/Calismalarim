package lambda.Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q16_K {
 /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

    public static void main(String[] args) {

        String str="ade1r4d3";

        String strArr[]=str.split("");


        System.out.println(Arrays.stream(strArr).map(t -> t.replaceAll("\\D", "0")).
                mapToInt(t -> Integer.parseInt(t)).reduce(Math::addExact));

    }
}
