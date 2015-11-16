import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

       // String[] arr = new String[]{words};

        Pattern pattern = Pattern.compile("\\b[A-Za-z]+[A-Z]+\\b");
        Matcher matcher = pattern.matcher(words);

        for (int i = 0; i <words.length() ; i++) {
            if (matcher.find()){
                System.out.print(matcher.group() + " ");
            }
        }
    }
}
