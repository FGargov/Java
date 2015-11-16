import java.util.Scanner;


public class GhettoNumeralSystem {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        String zero = "Gee";
        String one = "Bro";
        String two = "Zuz";
        String three = "Ma";
        String four = "Duh";
        String five = "Yo";
        String six = "Dis";
        String seven = "Hood";
        String eight = "Jam";
        String nine = "Mack";

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            if (ch == '0'){
                System.out.print(zero);
            }
            else if (ch == '1'){
                System.out.print(one);
            }
            else if (ch == '2'){
                System.out.print(two);
            }
            else if (ch == '3'){
                System.out.print(three);
            }
            else if (ch == '4'){
                System.out.print(four);
            }
            else if (ch == '5'){
                System.out.print(five);
            }
            else if (ch == '6'){
                System.out.print(six);
            }
            else if (ch == '7'){
                System.out.print(seven);
            }
            else if (ch == '8'){
                System.out.print(eight);
            }
            else {
                System.out.print(nine);
            }

        }

    }


}
