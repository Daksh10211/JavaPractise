import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
//100
//1 and number itself.
public class Main {
    public static void main(String[] args) {
//        Instant starts = Instant.now();
//100 + 99
//99 + 98 + 97 +96 = n (n + 1) = n2
//        1,000,000,000,000
//        100 + sqrt(n)
//        99 + sqrt(n)
//        100 + sqrt(n) = n + sqrt(n)
//        1000000 = 1000000 + 1000 = 10^6
//        1000000 = 1000000 * 1000000 = 10^12
//        n^2
//        100 = 10
//        101 = 10, 11
//        122 = 11,
        for(int i=1;i<=100;i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        Instant ends = Instant.now();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


        Scanner scr= new Scanner(System.in);


      /*  for(int i=0; i< total_numbers; i++){
            int user_input = scr.nextInt();
            total = total + user_input;
            System.out.println("total right now is " + total);
        }*/


        //System.out.println("avg is " +total / total_numbers);

//        var user_inputs = new ArrayList<Integer>();
//
//        for(int i = 0; i < total_numbers; i++){
//            user_inputs.add(scr.nextInt());
//        }
//        int total_sum = 0;
//        for(int j = 0; j< total_numbers; j++){
//            total_sum += user_inputs.get(j);
//        }
//        System.out.println("avg is " + total_sum / total_numbers);

         /*int n= scr.nextInt();
         int total=0;
         for(int i=1;i<=n;i++){
             total+=scr.nextInt();
         }

        System.out.println("average of your "+n+" numbers is "+total/n);*/

//        for(int i=5;i>=1;i--){
//            System.out.println();
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//        }


















    }
}