import java.util.Locale;
import java.util.Scanner;


public class CalculateExpression {
    public static void main(String[] args){

        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float firstFormula = (float) Math.pow(((Math.pow(a,2) + Math.pow(b,2))/(Math.pow(a,2) - Math.pow(b,2))), ((a + b + c)/Math.sqrt(c)));
        float secondFormula = (float) Math.pow((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3)), (a - b));


        float averageNumbers = (a + b + c) / 3;
        float averageFormula = (firstFormula + secondFormula) / 2;
        float differenceFormula = Math.abs(averageNumbers - averageFormula);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",firstFormula, secondFormula, differenceFormula );


    }
}
