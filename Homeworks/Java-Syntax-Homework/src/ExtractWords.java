import java.util.Scanner;
import java.util.regex.*;

public class ExtractWords {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(words);

        for (int i = 0; i < words.length(); i++) {

            if (matcher.find()){
                System.out.print(matcher.group(0) + " ");
            }
        }

    }
}
