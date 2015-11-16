import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSubstringOccurrences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        String target = sc.nextLine();

        int count = 0;
        for (int i = 0; i <= text.length() - target.length() ; i++) {

            if (text.substring(i, i + target.length()).equals(target)){
                count++;
            }
        }
        System.out.println(count);

    }
}
