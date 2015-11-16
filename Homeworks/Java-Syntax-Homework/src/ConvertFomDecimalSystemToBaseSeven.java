import java.util.Scanner;

public class ConvertFomDecimalSystemToBaseSeven {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Integer number = sc.nextInt();

        System.out.println(Integer.toString(number, 7));
    }
}
