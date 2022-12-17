package lambda.Arrays;

import java.util.Arrays;

public class Q03 {
    /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */

    public static void main(String[] args) {

        int arr[]={1,2,-3,4,-5,-6};

        Arrays.stream(arr).map(t -> t * (-1)).forEach(t-> System.out.print(t+ " "));

    }
}
