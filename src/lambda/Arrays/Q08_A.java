package lambda.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Q08_A {

    /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
    public static void main(String[] args) {

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String strArr[]=str.split(" ");

        System.out.println(Arrays.stream(strArr).filter(t -> t.contains("$")).mapToInt(t -> Integer.parseInt(t.replace("$", ""))).sum());
        System.out.println(Arrays.stream(strArr).filter(t -> t.contains("£")).mapToInt(t -> Integer.parseInt(t.replace("£", ""))).sum());

    }}



