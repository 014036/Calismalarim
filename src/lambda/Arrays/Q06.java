package lambda.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Q06 {
    /*TASK :
	write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)

	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

	*/
    public static void main(String[] args) {
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };


        List<Integer> newArr=new ArrayList<>(Arrays.asList(100, 10001, -90, 845, 8787, 898, 0, 1, -90));

        System.out.println(newArr.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList()));
        System.out.println(newArr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow());
        System.out.println(newArr.stream().reduce(Math::max).orElseThrow());
        System.out.println(newArr.stream().reduce(Math::min).orElseThrow());

    }
}
