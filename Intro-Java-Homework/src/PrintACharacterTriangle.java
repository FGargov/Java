import java.util.Scanner;


public class PrintACharacterTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());
        int n = sc.nextInt();
        char[] ch = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 1; i <= n - 1 ; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(ch[j] + " ");
            }
            System.out.println();
        }

        for (int i = n; i > 0 ; i--) {

            for (int j = 0; j < i ; j++) {

                System.out.print(ch[j] + " ");
            }
            System.out.println();
        }
    }
}
