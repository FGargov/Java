import java.util.Scanner;


public class GetAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        Average(num1, num2, num3);

    }

public static void Average( double num1, double num2, double num3){

   double result = (num1 + num2 + num3) / 3.00;
   System.out.printf("%.2f", result);

   }
}