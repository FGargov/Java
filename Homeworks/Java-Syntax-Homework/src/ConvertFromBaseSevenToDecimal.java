import java.util.Scanner;

public class ConvertFromBaseSevenToDecimal {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            String sevenBaseNumber = sc.nextLine();
            Integer toDecimal = Integer.valueOf(sevenBaseNumber, 7);

        System.out.println(toDecimal);

    }

}
