import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long factorial = calculateFactorial(num);
        System.out.printf("The factorial of %d is: %d", num, factorial);
    }

    private static long calculateFactorial(long num) {
        if(num == 1 || num == 0) {
            return 1;
        }

        return num * calculateFactorial(num - 1);
    }
}