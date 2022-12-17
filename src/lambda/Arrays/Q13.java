package lambda.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini yazdıran java code create ediniz (negatif sayilar da dahil olsun)
         */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("kac elemanli sayi girmek istiyorsaniz yaziniz : ");
        int sayi=scan.nextInt();

        int arr[]=new int[sayi];

        for (int i = 0; i <arr.length; i++) {
           // System.out.println(i +". adedi giriniz :");
            arr[i]=scan.nextInt();
        }

        System.out.println(Arrays.stream(arr).filter(t -> t % 3 == 0).count());
    }
}
