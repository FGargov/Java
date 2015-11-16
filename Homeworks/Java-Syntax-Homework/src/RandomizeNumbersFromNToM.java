import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = Math.min(n,m);
        int max = Math.max(n,m);

        Random random = new Random();

        for(int i = min; i <= max; i++) {
           int randomNum = random.nextInt((max - min) + 1) + min;
            System.out.println(randomNum + " ");
        }


    }
}
