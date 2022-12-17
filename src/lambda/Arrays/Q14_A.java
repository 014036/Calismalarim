package lambda.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Q14_A {//yapamadik!!!
    /*  TASK :
     * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
     * alin.
     * input : Congratulations
     * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
     * sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
     */
    public static void main(String[] args) {
        String str="Congratulations";
        String arr[] =str.split("");
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.stream(arr).map(t -> t.replace("o", "i")).
                map(t -> t.replace("a", "i")).map(t -> t.replace("u", "i")).
                collect(Collectors.toList()));

    }
}
