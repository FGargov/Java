import java.util.Scanner;



public class SumNumbersFrom1ToN {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n ; i++) {

            count += i;
        }

        System.out.print("Sum of all numbers from 1 to N: " + count);
    }
}
