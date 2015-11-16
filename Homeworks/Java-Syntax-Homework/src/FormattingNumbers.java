import java.util.Locale;
import java.util.Scanner;


public class FormattingNumbers {
    public static void main(String[] args){
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        String hex = String.format("%s", Integer.toHexString(a1).toUpperCase());
       // System.out.printf("%s", hex);
       // System.out.println();
        String binary = String.format("%s",Integer.toBinaryString(a1));
       // System.out.printf("%s", binary);
        float b1 = sc.nextFloat();
        //System.out.printf("%.2f", b1);
        float c1 = sc.nextFloat();
        //System.out.printf("%.3f", c1);

      System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", hex, binary, b1, c1);


    }

}
