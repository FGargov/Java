import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("[\\W\\d]");

        String target = sc.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i <words.length ; i++) {

            if (target.equals(words[i].toLowerCase())){
                count++;
            }
        }
        System.out.print(count);
    }
}