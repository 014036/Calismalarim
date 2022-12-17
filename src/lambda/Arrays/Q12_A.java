package lambda.Arrays;

import java.util.Arrays;

public class Q12_A {
    //Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
    //toplamını birer birer bulan ve herbir sonucu yeni bir array’in elemanı yapan
    // ve yeni array’i ekrana yazdıran bir program yazınız
    // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

    public static void main(String[] args) {


        int arr[][]={ {1,2,3}, {4,5}, {6,7} };
        System.out.println(Arrays.toString(Arrays.stream(arr).map(t -> Arrays.stream(t).sum()).toArray()));

    }
}
